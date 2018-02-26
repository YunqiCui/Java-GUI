/*
* JCheckBox
* JRadioButton
*
*
* */



package com.swing;

import javax.swing.*;
import java.awt.*;

public class RegisterPanel extends JFrame{
    private JPanel jp1, jp2,jp3;
    private JLabel jl1,jl2;
    private JButton jb1,jb2;
    private JCheckBox jcb1, jcb2, jcb3;
    private JRadioButton jrb1,jrb2;
    private ButtonGroup bg;

    public static void main(String[] args) {
        RegisterPanel rp =new RegisterPanel();
    }

    public RegisterPanel(){

        jp1 = new JPanel();
        jp2 = new JPanel();
        jp3 = new JPanel();
        jl1 = new JLabel("Favourite Sports");
        jl2 = new JLabel("Gender");
        jb1 = new JButton("Register");
        jb2 = new JButton("Cancle");
        jcb1 = new JCheckBox("Soccer");
        jcb2 = new JCheckBox("Basketball");
        jcb3 = new JCheckBox("Tennis");
        jrb1 = new JRadioButton("Male");
        jrb2 = new JRadioButton("Female");
        bg = new ButtonGroup();

        bg.add(jrb1);
        bg.add(jrb2);

        this.setLayout(new GridLayout(3,1));

        jp1.add(jl1);
        jp1.add(jcb1);
        jp1.add(jcb2);
        jp1.add(jcb3);
        jp2.add(jl2);
        jp2.add(jrb1);
        jp2.add(jrb2);
        jp3.add(jb1);
        jp3.add(jb2);

        this.add(jp1);
        this.add(jp2);
        this.add(jp3);

        this.setTitle("Register Please!");
        this.setSize(400,250);
        this.setLocation(400,400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
