package com.sharon.ui;//user interface

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow {
    public static void main(String[] args) {
        //Graphical User Interface(GUI)
        //寫[視窗程式]
        //JFrame:視窗頁面的框
        JFrame frame=new JFrame();
        frame.setVisible(true);//顯示葉面 要結束按terminate(左下角)
        frame.setSize(400,300);
        frame.setLocation(200,200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JButton button=new JButton("OK");//視窗中間跑出ok
           //設定按下ok建會跑出什麼
           //匿名類別 Anonymous class
        MyActionListener listener=new MyActionListener();
        button.addActionListener(listener);
        //第二種方法
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello");
            }
        });
        frame.setLayout(new FlowLayout());
        //Layout
        frame.add(button);
        frame.add(new JButton("testing"));
        System.out.println("End?");

    }
}
