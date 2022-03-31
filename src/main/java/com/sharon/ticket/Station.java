package com.sharon.ticket;

public class Station {
    public static final Station TAIPEI_CITY=new Station(100,"Taipei");
    public static Station TAICHUNG_CITY=new Station(200,"Taichung");
    public static Station KAOHSIUNG_CITY=new Station(300,"Kaohsiung");

    int id;
    String name;
    public Station(int id,String name){
        this.id=id;
        this.name=name;
    }
}
