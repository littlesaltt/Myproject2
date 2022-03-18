package com.sharon;

public class GoldenCustomer extends Customer {
    int returnmoney2;
    public GoldenCustomer(String id,int amount){
        super(id,amount);
    }

    public int getReturnmoney2(){return (int) (amount*0.2f);}

    @Override
    public void print(){
        System.out.println(id+"\t"+amount+"\t"+getReturnmoney2());
    }

}
