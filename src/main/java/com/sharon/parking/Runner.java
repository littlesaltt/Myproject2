package com.sharon.parking;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Runner {
    public static void main(String[] args) {
        String id="ABC-1234";
        String enterTime="08:27";
        String exitTime="13:05";
        //字串&Date互相轉換
        SimpleDateFormat sdf=new SimpleDateFormat("HH:mm");
        //Exception例外 vs Error錯誤
        //Date d=sdf.parse(enterTime); 錯誤
        Date d=null;
        try{
            d=sdf.parse(enterTime);
        }catch (Exception e){
            System.out.println("Wrong Format");
        }
        //Date d=new Date(); //得到現在當下時間
        System.out.println(d); //按下ctri+q:可以看出每個功能說明
        System.out.println(d.getTime());
        //long a=3*60*60*1000;//三小時毫秒後
        //Date d2=new Date();
        try {
            Date d2 = sdf.parse(enterTime);
            System.out.println(d2);
            System.out.println(d2.getTime());
            //用分鐘定義
            long ms=d2.getTime()-d.getTime();
            int minutes=(int)(ms/(1000*60));
        }catch (Exception e){
            System.out.println("Exit wrong format");
        }
        //設定用set，拿到用get
        //d2.setTime(d.getTime()+a);
        //System.out.println(d2);
        //System.out.println(d2.getTime());
        //可以查 Simple date format
    }
}
