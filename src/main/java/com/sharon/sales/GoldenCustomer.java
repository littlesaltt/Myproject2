package com.sharon.sales;
//9折 10%回饋金
public class GoldenCustomer extends SilverCustomer {
    public GoldenCustomer(String id,int amount){
        super(id, amount);
    }
    public float getOffMoney() {
        return (amount*off);
    }
    @Override
    public void print () {
        System.out.println(id + "\t" + amount + "\t" + (amount-getOffMoney()) +"("+getReturnMoney()+")" );
    }

}
