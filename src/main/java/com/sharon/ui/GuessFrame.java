package com.sharon.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessFrame extends JFrame{

    public GuessFrame(){
        super();
        setVisible(true);
        setSize(600,400);
        setLocation(300,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        JButton button=new JButton("Todat is Friday");
        JLabel label=new JLabel("hello3");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("oh");
                label.setText("chao");
            }
        });
        setLayout(new FlowLayout());
        add(button);
        add(label);


    }

    public static void main(String[] args) {
        GuessFrame guessFrame=new GuessFrame();
    }
}
