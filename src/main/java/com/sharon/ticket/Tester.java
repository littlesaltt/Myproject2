package com.sharon.ticket;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
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
        System.out.println("Your end station? (Taipei: 1, Taichung: 2, Kaohsiung: 3)");
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
        //float price=Math.abs(endStation.id- startStation.id);
        System.out.println("What type of ticket(s)? (Normal ticket:1, Student ticket:2, Elder ticket:3, Round trip ticket:4)");
        choice = Integer.parseInt(scanner.next());
        Ticket ticket=null;
        switch (choice){
            case 1:
                ticket=new Ticket(startStation,endStation);
                break;
            case 2:
                ticket=new StudentTicket(startStation,endStation);
                break;
            case 3:
                ticket=new ElderTicket(startStation,endStation);
                break;
            case 4:
                ticket=new RoundTripTicket(startStation,endStation);
                break;
        }
        //票數
        System.out.println("How many ticket do you want?");
        Scanner s = new Scanner(System.in);
        int quantity = Integer.parseInt(s.next());
        //System.out.println( startStation.name+ " to " + endStation.name + "\t" +"ticket:"+ quantity + "\t" +"total price:"+ ticket.price*quantity);
        if(startStation==endStation){
            System.out.println("Please choose again!");
        }else{
            System.out.println( startStation.name+ " to " + endStation.name + "\t" +"   ticket:"+ quantity + "\t" +"   total price:"+ ticket.price*quantity);
        }
    }


}
