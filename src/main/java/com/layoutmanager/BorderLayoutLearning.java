/*
 * BorderLayout
 */

/*
 * 1.继承JFrame
 * 2.定义你需要的组件
 * 3.创建组件（构造函数）
 * 4.添加组建
 * 5.设置窗体组建参数
 * 6.显示窗体
 */



package com.layoutmanager;

import java.awt.*;
import javax.swing.*;
public class BorderLayoutLearning extends JFrame{

    JButton jb1,jb2,jb3,jb4,jb5;


    public static void main(String[] args) {
        BorderLayoutLearning bdl = new BorderLayoutLearning();
    }

    public BorderLayoutLearning() throws HeadlessException {

        //Create Component
        jb1 = new JButton("North");
        jb2 = new JButton("South");
        jb3 = new JButton("West");
        jb4 = new JButton("East");
        jb5 = new JButton("Center");

        //Add Component
        this.add(jb1,BorderLayout.NORTH);
        this.add(jb2,BorderLayout.SOUTH);
        this.add(jb3,BorderLayout.WEST);
        this.add(jb4,BorderLayout.EAST);
        this.add(jb5,BorderLayout.CENTER);

        //Setup Window
        this.setTitle("BorderLayout");
        this.setSize(300,200);
        this.setLocation(300,300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

    }


}
