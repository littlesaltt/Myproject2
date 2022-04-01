package com.sharon.sales;

import java.util.ArrayList;
import java.util.List;

public class SalesTester {
    public static void main(String[] args) {
        List<Customer>customers=new ArrayList<>();
        customers.add(new Customer("0001", 2150));
        customers.add(new Customer("0002", 800));
        customers.add(new SilverCustomer("0003", 2150));
        customers.add(new GoldenCustomer("0004", 2150));
        customers.add(new PlatinumCustomer("0005", 2150));
        for (int i = 0; i < 5; i++) {
            customers.get(i).print();
        }
        for (Customer c:customers) { //冒號右邊放多東西
            c.print();
        }

        /*Customer c1 = new Customer("0001", 2150);
        c1.print(); //=customers.get(0).print();
        Customer c2 = new Customer("0002", 800);
        c2.print();
        SilverCustomer c3 = new SilverCustomer("0003", 2150); //也可以寫成Customer c3=...
        c3.print();
        GoldenCustomer c4 = new GoldenCustomer("0004", 2150);
        c4.print();
        PlatinumCustomer c5 = new PlatinumCustomer("0005", 2150);
        c5.print();*/
    }
}
