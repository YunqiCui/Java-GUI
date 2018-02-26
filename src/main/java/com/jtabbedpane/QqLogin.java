package com.jtabbedpane;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class QqLogin extends JFrame {
    //North
    JLabel jl1;

    //South
    JPanel jp1;
    JButton jb1,jb2,jb3;

    //Center
    JTabbedPane jtp;
    JPanel jp2,jp3,jp4;
    JLabel jl2,jl3,jl4,jl5;
    JTextField jtf;
    JPasswordField jpf;
    JButton jb4;
    JCheckBox jcb1,jcb2;

    public static void main(String[] args) {
        QqLogin qql= new QqLogin();
    }

    public QqLogin(){

        jl2 = new JLabel("QQ: ", JLabel.CENTER);
        jl3 = new JLabel("PS:",JLabel.CENTER);
        jl4 = new JLabel("Forgot password",JLabel.CENTER);
        jl4.setForeground(Color.blue);
        jl5 = new JLabel("<html><a href='www.qq.com'>Protect Password</a></html>");
        jl5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        jtf = new JTextField();
        jpf = new JPasswordField();

        jb4 = new JButton("Clear");

        jcb1 = new JCheckBox("Secretly Login");
        jcb2 = new JCheckBox("Remember me");


        //North Part
        jl1 = new JLabel(new ImageIcon("/Users/cuiyunqi/Desktop/HSP/GUI/src/main/java/com/jtabbedpane/logo.png"));

        //South Part
        jp1 = new JPanel();
        jb1 = new JButton("Login");
        jb2 = new JButton("Cancle");
        jb3 = new JButton("Xiangdao");

        //Center Part
        jtp = new JTabbedPane();
        jp2 = new JPanel();
        jp3 = new JPanel();
        jp3.setBackground(Color.RED);
        jp4 = new JPanel();
        jp4.setBackground(new Color(0,0,255));
        jtp.add("QQ",jp2);
        jtp.add("Mobile",jp3);
        jtp.add("Email",jp4);
        jp2.setLayout(new GridLayout(3,3));


        jp1.add(jb1);
        jp1.add(jb2);
        jp1.add(jb3);

        jp2.add(jl2);
        jp2.add(jtf);
        jp2.add(jb4);
        jp2.add(jl3);
        jp2.add(jpf);
        jp2.add(jl4);
        jp2.add(jcb1);
        jp2.add(jcb2);
        jp2.add(jl5);

        this.add(jp1,BorderLayout.SOUTH);
        this.add(jl1,BorderLayout.NORTH);
        this.add(jtp,BorderLayout.CENTER);

        this.setTitle("QQ Login");
        this.setSize(350,250);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);

    }


}
