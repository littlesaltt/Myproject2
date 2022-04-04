package com.sharon.ticket;

public class ElderTicket extends Ticket{
    //敬老票:5折
    float off = 0.5f;
    public ElderTicket(Station start, Station destination) {
        super(start, destination);
        price = price - (int)(price*off);
    }
}
