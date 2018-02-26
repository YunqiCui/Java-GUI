/*
* JComboBox JList JScrollPanel
*
* */

package com.swing;

import javax.swing.*;
import java.awt.*;

public class CustomerSurvey extends JFrame {
    private JComboBox jcb;
    private JList jli;
    private JScrollPane jsp;
    private JPanel jp1,jp2;
    private JLabel jl1, jl2;

    public static void main(String[] args) {
        CustomerSurvey cs = new CustomerSurvey();
    }

    public CustomerSurvey(){

        jp1 = new JPanel();
        jp2 = new JPanel();
        jl1 = new JLabel("Residency:");
        jl2 = new JLabel("Favourite tour destination:");
        String []jg = {"MEL","SYD","BRI","ADL","PER","DAR"};
        jcb = new JComboBox(jg);
        String []td = {"Beijing","Shanghai","Tianjin","Chongqing","Harbin"};
        jli = new JList(td);
        jli.setVisibleRowCount(2);
        jsp = new JScrollPane(jli);
        //设置显示多少个选项

        this.setLayout(new GridLayout(3,1));
        jp1.add(jl1);
        jp1.add(jcb);
        jp2.add(jl2);
        jp2.add(jsp);

        this.add(jp1);
        this.add(jp2);
        this.setTitle("CustomerSurvey");
        this.setSize(500,300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocation(400,400);
        this.setVisible(true);

        



    }
}
