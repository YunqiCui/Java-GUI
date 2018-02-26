/*
* JLable, JTextField, JPasswordField
*
*/


package com.swing;


import javax.swing.*;
import java.awt.*;


public class LoginPanel extends JFrame {

    private JLabel jl1, jl2;
    private JTextField jtx1;
    private JPasswordField jpf1;
    private JButton jb1,jb2;
    private JPanel jp1,jp2,jp3;

    public static void main(String[] args) {
        LoginPanel loginPanel = new LoginPanel();
    }

    public LoginPanel(){
        jl1 = new JLabel("Username");
        jl2 = new JLabel("Password");
        jtx1 = new JTextField(10);
        jpf1 = new JPasswordField(10);
        jb1 = new JButton("Login");
        jb2 = new JButton("Cancle");
        jp1 = new JPanel();
        jp2 = new JPanel();
        jp3 = new JPanel();

        this.setLayout(new GridLayout(3,1));

        jp1.add(jl1);
        jp1.add(jtx1);
        jp2.add(jl2);
        jp2.add(jpf1);
        jp3.add(jb1);
        jp3.add(jb2);

        this.add(jp1);
        this.add(jp2);
        this.add(jp3);

        this.setTitle("Login Please!");
        this.setSize(300,150);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocation(400,400);
        this.setVisible(true);

    }



}
