/*
 *
 *
 *
 */


package com.layoutmanager;

import java.awt.*;
import javax.swing.*;


public class FlowLayoutLearning extends JFrame {


    private JButton jb1, jb2, jb3, jb4;

    public static void main(String[] args) {

        FlowLayoutLearning fll = new FlowLayoutLearning();

    }

    public FlowLayoutLearning() {

        jb1 = new JButton("Button1");
        jb2 = new JButton("Button2");
        jb3 = new JButton("Button3");
        jb4 = new JButton("Button4");

        this.add(jb1);
        this.add(jb2);
        this.add(jb3);
        this.add(jb4);

        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        this.setTitle("FlowLayout");
        this.setSize(300, 200);
        this.setLocation(300, 300);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }



}
