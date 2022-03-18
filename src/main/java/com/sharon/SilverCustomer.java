package com.sharon;

public class SilverCustomer extends Customer{
    int returnmoney;
    public SilverCustomer(String id,int amount){
        super(id,amount); //呼叫 Customer
    }

    public int getReturnmoney(){
        return (int) (amount*0.1f);
    }


    @Override
    public void print(){
        System.out.println(id+"\t"+amount+"\t"+getReturnmoney()); //+Returnmoney是錯的
    }

}
