package com.sharon.sales;

public class SilverCustomer extends Customer {
    public SilverCustomer(String id,int amount){
        super(id, amount); //定義父類的構造方法
    }
    public int getReturnMoney(){
        return(int)(amount*0.1);
    }
    @Override
    public void print() {
        System.out.print(id + "\t" + amount + "\t" + (amount-getdiscountMoney())+"("+getReturnMoney()+")");
    }


}
