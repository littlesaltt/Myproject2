package com.sharon.ticket;

public class Ticket {
    public static final int TAIPEI_CITY = 100;
    public static int TAICHUNG_CITY = 200;
    public static int KAOHSIUNG_CITY = 300;

    int price;
    Station start;
    Station destination;
    public Ticket(Station start, Station destination) {
        this.start = start;
        this.destination = destination;
        if(start==Station.TAIPEI_CITY){
            if(destination==Station.TAICHUNG_CITY){
                //台北到台中
                price=600;
            } else if(destination==Station.KAOHSIUNG_CITY){
                //台北到高雄
                price=1500;
            }else{
                //台北到台北(錯誤)
                System.out.println("You choose the same start station and end station.");

            }
        } else if(start==Station.TAICHUNG_CITY){
            if(destination==Station.TAIPEI_CITY){
                //台中到台北
                price=600;
            }else if(destination==Station.KAOHSIUNG_CITY){
                //台中到高雄
                price=900;
            }else{
                //台中到台中(錯誤)
                System.out.println("You choose the same start station and end station.");
            }
        }else if(start==Station.KAOHSIUNG_CITY){
            if(destination==Station.TAIPEI_CITY){
                //高雄到台北
                price=1500;
            }else if(destination==Station.TAICHUNG_CITY) {
                //高雄到台中
                price=900;
            }else{
                //高雄到高雄(錯誤)
                System.out.println("You choose the same start station and end station.");
            }
        }
    }


}
