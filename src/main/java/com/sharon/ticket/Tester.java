package com.sharon.ticket;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
//        Ticket ticket = new Ticket(Station.TAIPEI_CITY,Station.KAOHSIUNG_CITY);
//        System.out.println(ticket.start.name);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your start station? (Taipei: 1, Taichung: 2, Kaohsiung: 3)");
        int choice = Integer.parseInt(scanner.next());
        Station startStation = null;
        switch (choice) {
            case 1:
                startStation = Station.TAIPEI_CITY;
                break;
            case 2:
                startStation = Station.TAICHUNG_CITY;
                break;
            case 3:
                startStation = Station.KAOHSIUNG_CITY;
                break;
        }
        System.out.println("Your destination station? (Taipei: 1, Taichung: 2, Kaohsiung: 3)");
        choice = Integer.parseInt(scanner.next());
        Station endStation = null;
        switch (choice) {
            case 1:
                endStation = Station.TAIPEI_CITY;
                break;
            case 2:
                endStation = Station.TAICHUNG_CITY;
                break;
            case 3:
                endStation = Station.KAOHSIUNG_CITY;
                break;
        }
        //what type of ticket?
        //how many tickets?
        //loop?
        System.out.println("how many ticket do you want");
        Scanner s = new Scanner(System.in);
        int quantity = Integer.parseInt(s.next());
        System.out.println( startStation.name+ "\t" + endStation.name + "\t" +"ticket:"+ quantity);
        //System.out.println( startStation+ "\t" + endStation + "\t" +"ticket:"+ quantity);
    }


}
