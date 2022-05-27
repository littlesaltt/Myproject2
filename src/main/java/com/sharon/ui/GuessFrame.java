package com.sharon.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessFrame extends JFrame{
    JButton button = new JButton("Guess 1 to 10 and Press me");
    JLabel label = new JLabel("hehehehe");
    JTextField number=new JTextField(20);
    Random random=new Random();
    int secert=random.nextInt(10)+1;
    public GuessFrame(){
        super();
        setVisible(true);
        setSize(600,400);
        setLocation(300,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
        //        System.out.println("oh");
         //       label.setText("chao");
                int num=Integer.parseInt(number.getText());
                System.out.println(num);
                if(num<secert){
                    label.setText("Guess bigger");
                }else if(num>secert){
                    label.setText("Guess smaller");
                }else{
                    label.setText("Bingo");
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
