package com.sharon.sales;
//7折 20%回饋金
public class PlatinumCustomer extends SilverCustomer{
    public PlatinumCustomer(String id,int amount){
        super(id,amount);
    }
    public float getOffMoney() {
        return (amount*(off*3));
    }
    @Override
    public int getReturnMoney(){
        return (int)(amount*0.2);
    }
    @Override
    public void print () {
        System.out.println(id + "\t" + amount + "\t" + (amount-getOffMoney()) +"("+getReturnMoney()+")" );
    }
}
