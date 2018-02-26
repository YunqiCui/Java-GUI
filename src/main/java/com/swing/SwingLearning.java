/**
 * Swing: JFrame, JButton
 * Yunqi Cui
 */


package com.swing;

import java.awt.*;

import javax.swing.*;

public class SwingLearning extends JFrame {

    JButton jb1;

    public static void main(String[] args) {
        SwingLearning swing1 = new SwingLearning();

    }

    public SwingLearning() {

        this.setTitle("Hello World!");

        this.setSize(200, 200);

        jb1 = new JButton("Button1");

        this.add(jb1);

        this.setVisible(true);

        this.setLocation(100, 200);
        //When close the window, close JVM as well
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);


    }

}
