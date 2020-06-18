package me.sup2is;

public class SellerService {

    public AirlineTicketInfo assignPrice(AirlineTicketInfo airlineTicketInfo) {

        //판매자에게 해당 티켓의 최저가를 가져오는 로직 ...
        delay();
        airlineTicketInfo.assignPrice(100_000);
        return airlineTicketInfo;
    }

    public void delay () {
        try {
            Thread.sleep(1000);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
