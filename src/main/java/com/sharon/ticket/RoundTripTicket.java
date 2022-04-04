package com.sharon.ticket;

public class RoundTripTicket extends Ticket{
    //來回票:9折*2(來&回)
    float off = 0.1f;
    public RoundTripTicket(Station start, Station destination) {
        super(start, destination);
        price = (price - (int)(price*off))*2;
    }
}
