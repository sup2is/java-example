package me.sup2is;

public class ClientReservation {
    private String from;
    private String to;

    public ClientReservation(String from, String to) {
        this.from = from;
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }
}
