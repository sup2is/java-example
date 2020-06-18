package me.sup2is;

import java.util.Random;

public class AirlineService {

    private Random random = new Random();


    public AirlineTicketInfo createTickerByAirline(String airline, ClientReservation reservation) {

        //항공사 서비스를 호출해서 티켓정보를 받아오는 로직 ...
        delay();

        AirlineTicketInfo airlineTicketInfo =
                AirlineTicketInfo.createAirlineTicketInfo(airline,
                                            reservation,
                                            getRandomTime(),
                                            getRandomTime());
        return airlineTicketInfo;
    }

    private String getRandomTime() {
        return "2020-16-18 "
                + String.format("%02d", random.nextInt(22) + 1)
                + ":"
                + String.format("%02d", random.nextInt(58) + 1);
    }

    public void delay () {
        try {
            Thread.sleep(1000);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}
