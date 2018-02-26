package com.jtextarea;

import javax.swing.*;
import java.awt.*;

public class TecentUI extends JFrame {

    private JTextArea jta;
    private JPanel jp;
    private JButton jb;
    private JTextField jtf;
    private JComboBox jcb;
    private JScrollPane jsp;


    public static void main(String[] args) {
        TecentUI tui = new TecentUI();
    }

    public TecentUI(){

        jta = new JTextArea();
        jsp = new JScrollPane(jta);
        jp = new JPanel();
        jb = new JButton("Send");
        jtf = new JTextField(10);

        String []des = {"Bruce", "Kevin","Mark","Andy"};
        jcb = new JComboBox(des);

        //jta.setSize(400,300);

        jp.add(jcb);
        jp.add(jtf);
        jp.add(jb);

        this.add(jsp,BorderLayout.CENTER);
        this.add(jp,BorderLayout.SOUTH);
        this.setIconImage((new ImageIcon("/Users/cuiyunqi/Desktop/HSP/GUI/src/main/java/com/jtextarea/logo1.jpeg")).getImage());
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Conversation");
        this.setSize(400,300);
        this.setLocation(300,300);
        this.setVisible(true);}

}
