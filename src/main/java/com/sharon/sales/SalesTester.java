package com.sharon.sales;
//最後寫
public class SalesTester {
    public static void main(String[] args) {
        Customer c1 = new Customer("0001",1200);
        c1.print();
        Customer c2 = new Customer("0002",800);
        c2.print();
        SilverCustomer c3 = new SilverCustomer("0003",2150);
        c3.print();
        GoldenCustomer c4 = new GoldenCustomer("0004",2000);
        c4.print();
    }
}
