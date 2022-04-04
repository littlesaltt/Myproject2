package com.sharon.ticket;

public class StudentTicket extends Ticket{
    //學生票:8折
    float off = 0.2f;
    public StudentTicket(Station start, Station destination) {
        super(start, destination);
        price = price - (int)(price*off);
    }
}
