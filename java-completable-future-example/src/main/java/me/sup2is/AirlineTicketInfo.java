package me.sup2is;

public class AirlineTicketInfo {

    private String airline;
    private ClientReservation clientReservation;
    private String departureTime;
    private String arrivalTime;
    private int price;

    private AirlineTicketInfo(){}

    public static AirlineTicketInfo createAirlineTicketInfo(String airline, ClientReservation clientReservation, String departureTime, String arrivalTime) {
        AirlineTicketInfo info = new AirlineTicketInfo();
        info.airline = airline;
        info.clientReservation = clientReservation;
        info.departureTime = departureTime;
        info.arrivalTime = arrivalTime;
        return info;
    }

    public void assignPrice(int price) {
        this.price = price;
    }

    public String getAirline() {
        return airline;
    }

    public ClientReservation getClientReservation() {
        return clientReservation;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "AirlineTicketInfo{" +
                "airline='" + airline + '\'' +
                ", clientReservation=" + clientReservation +
                ", departureTime='" + departureTime + '\'' +
                ", arrivalTime='" + arrivalTime + '\'' +
                ", price=" + price +
                '}';
    }
}
