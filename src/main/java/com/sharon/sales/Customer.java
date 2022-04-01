package com.sharon.sales;

public class Customer {
    String id;
    int amount;
    //int discount;
    float off=0.1f;
    public Customer(String id, int amount) {
        this.id = id;
        this.amount = amount;
    }
    public float getdiscountMoney() {
        return  (amount/1000)*off*1000; //打9折
    }
    public void print(){
        if (amount>1000) {
            float discount= (float) (amount-getdiscountMoney());
            System.out.println(id + "\t" + amount + "\t" + discount); //滿千折百
        }
        else {
            System.out.println(id + "\t" + amount + "\t" +"    "+ amount);
        }
    }

}
