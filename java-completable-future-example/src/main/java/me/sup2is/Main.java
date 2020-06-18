package me.sup2is;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

            List<String> airlines = Arrays.asList("Qatar Airways",
                                                "Singapore Airlines",
                                                "ANA All Nippon Airways",
                                                "Cathay Pacific Airways",
                                                "Emirates",
                                                "EVA Air",
                                                "Hainan Airlines",
                                                "Qantas Airways",
                                                "Lufthansa",
                                                "Thai Airways",
                                                "Japan Airlines",
                                                "Garuda Indonesia",
                                                "Swiss International Air Lines",
                                                "China Southern Airlines",
                                                "Austrian Airlines",
                                                "Air New Zealand",
                                                "Bangkok Airways",
                                                "KLM Royal Dutch Airlines",
                                                "British Airways",
                                                "AirAsia",
                                                "Virgin Atlantic",
                                                "Aeroflot",
                                                "Air France",
                                                "Hong Kong Airlines",
                                                "Virgin Australia",
                                                "Iberia",
                                                "Turkish Airlines",
                                                "Asiana Airlines",
                                                "Etihad Airways",
                                                "Philippine Airlines",
                                                "Air Canada",
                                                "Finnair");

        ClientReservation reservation = new ClientReservation("서울", "제주");
        AirlineService airlineService = new AirlineService();
        SellerService sellerService = new SellerService();


        long start = System.currentTimeMillis();

//#1

//        List<AirlineTicketInfo> collect = airlines.stream()
//                .map(airline -> airlineService.createTickerByAirline(airline, reservation))
//                .collect(Collectors.toList());

//#2

//        List<AirlineTicketInfo> collect = airlines.parallelStream()
//                .map(airline -> airlineService.createTickerByAirline(airline, reservation))
//                .collect(Collectors.toList());

//#3

//        List<CompletableFuture<AirlineTicketInfo>> reservationInfos = airlines.stream()
//                .map(airline -> CompletableFuture.supplyAsync(() -> airlineService.createTickerByAirline(airline, reservation)))
//                .collect(Collectors.toList());
//        List<AirlineTicketInfo> collect = reservationInfos.stream().map(CompletableFuture::join).collect(Collectors.toList());


//#4

//        Executor executor = Executors.newFixedThreadPool(Math.min(airlines.size(), 100), r -> {
//            Thread t = new Thread(r);
//            t.setDaemon(true);
//            return t;
//        });
//
//
//        List<CompletableFuture<AirlineTicketInfo>> reservationInfos = airlines.stream()
//                .map(airline -> CompletableFuture.supplyAsync(() -> airlineService.createTickerByAirline(airline, reservation), executor))
//                .collect(Collectors.toList());
//        List<AirlineTicketInfo> collect = reservationInfos.stream().map(CompletableFuture::join).collect(Collectors.toList());

//#5

        Executor executor = Executors.newFixedThreadPool(Math.min(airlines.size(), 100), r -> {
            Thread t = new Thread(r);
            t.setDaemon(true);
            return t;
        });

        List<CompletableFuture<AirlineTicketInfo>> reservationInfos = airlines.stream()
                .map(airline -> CompletableFuture.supplyAsync(() -> airlineService.createTickerByAirline(airline, reservation), executor))
                .map(future -> future.thenCompose(airlineTicketInfo -> CompletableFuture.supplyAsync(()
                                                                        -> sellerService.assignPrice(airlineTicketInfo), executor)))
                .collect(Collectors.toList());
        List<AirlineTicketInfo> collect = reservationInfos.stream().map(CompletableFuture::join).collect(Collectors.toList());



//        System.out.println(collect);

        long end = System.currentTimeMillis();
        print(collect);
        System.out.println("티켓정보를 가져오는데 걸린 시간: " + (end - start) + "ms");

    }

    private static void print(List<AirlineTicketInfo> collect) {
        collect.stream()
                .forEach(System.out::println);
    }

}