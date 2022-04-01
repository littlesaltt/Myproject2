package com.sharon.sales;
//10%回饋金
public class SilverCustomer extends Customer {
    public SilverCustomer(String id,int amount){
        super(id, amount); //定義父類的構造方法
    }
    public int getReturnMoney(){   //購物金
        return (int)(amount*0.1);
    }
    @Override
    public void print() {
        System.out.println(id + "\t" + amount + "\t" + (amount-getdiscountMoney())+"("+getReturnMoney()+")");
    }


}
