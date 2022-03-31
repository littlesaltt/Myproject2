package com.sharon.sales;

public class Customer {
    String id;
    int amount;
    int discount;
    public Customer(String id, int amount) {
        this.id = id;
        this.amount = amount;
    }
    public float getdiscountMoney() {
        return  (amount/1000)*100;
    }
    public void print(){
        if (amount>1000) {
            int discount= (int) (amount-getdiscountMoney());
            System.out.println(id + "\t" + amount + "\t" + discount);
        }
        else {
            System.out.println(id + "\t" + amount + "\t" + amount);
        }
    }

}
