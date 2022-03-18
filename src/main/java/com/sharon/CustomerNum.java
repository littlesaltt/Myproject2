package com.sharon;

import java.util.Enumeration;

public class CustomerNum {
    public static void main(String[] args) {
        //Customer oo1=new Customer()
        Customer c1=new Customer("0001",1200);
        c1.print();
        Customer c2=new Customer("0002",800);
        c2.print();
        SilverCustomer c3=new SilverCustomer("0003",1000);
        c3.print();
        Customer c4=new Customer("0004",2000);
        c4.print();
        GoldenCustomer c5=new GoldenCustomer("0005",3200);
        c5.print();
    }
}
