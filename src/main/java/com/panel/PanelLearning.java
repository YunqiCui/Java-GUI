/*
 * JPanel
 * Yunqi Cui
 * 02/23/2018
 */


package com.panel;


import javax.swing.*;
import java.awt.*;

public class PanelLearning extends JFrame {
    JButton jb1,jb2,jb3,jb4,jb5,jb6;
    JPanel jpn1,jpn2;

    public static void main(String[] args) {
        PanelLearning panelLearning = new PanelLearning();
    }


    public PanelLearning(){

        jpn1 = new JPanel();
        jpn2 = new JPanel();

        jb1 = new JButton("Apple");
        jb2 = new JButton("Orange");
        jb3 = new JButton("Banana");
        jb4 = new JButton("Watermelon");
        jb5 = new JButton("Avocado");
        jb6 = new JButton("Lychee");

        jpn1.add(jb1);
        jpn1.add(jb2);
        jpn2.add(jb3);
        jpn2.add(jb4);
        jpn2.add(jb5);


        this.add(jpn1,BorderLayout.NORTH);
        this.add(jb6,BorderLayout.CENTER);
        this.add(jpn2,BorderLayout.SOUTH);

        this.setTitle("MixedLayout");
        this.setSize(500,400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLocation(300,300);
    }

}
