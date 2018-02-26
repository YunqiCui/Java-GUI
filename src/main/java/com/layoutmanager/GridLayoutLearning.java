/*
* 网格布局
*
*/


package com.layoutmanager;

import java.awt.*;
import javax.swing.*;

public class GridLayoutLearning extends JFrame {


    int size = 9;
    JButton jb[]=new JButton[size];
    public GridLayoutLearning(){

        for (int i = 0; i <size; i++) {
            jb[i] = new JButton(String.valueOf(i+1));
        }

        this.setLayout(new GridLayout(3,3,10,10));
        for (int i = 0; i <size; i++) {
            this.add(jb[i]);
        }

        this.setTitle("GridLayout");
        this.setSize(500,300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        GridLayoutLearning gridLayoutLearning = new GridLayoutLearning();
    }
}
