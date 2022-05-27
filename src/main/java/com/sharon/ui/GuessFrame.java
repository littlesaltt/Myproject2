package com.sharon.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessFrame extends JFrame{
    JTextField number=new JTextField(20);
    public GuessFrame(){
        super();
        setVisible(true);
        setSize(600,400);
        setLocation(300,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        JButton button=new JButton("Guess 1 to 10 and Press me");
        JLabel label=new JLabel("hehehehe");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
        //        System.out.println("oh");
         //       label.setText("chao");
                int num=Integer.parseInt(number.getText());
                System.out.println(num);
                if(num==5){
                    System.out.println("You are right");
                }else{
                    System.out.println("Wrong!Haha Guess one more time");
                }

            }
        });
        setLayout(new FlowLayout());
        add(number);
        add(button);
        add(label);


    }

    public static void main(String[] args) {
        GuessFrame guessFrame=new GuessFrame();
    }
}
