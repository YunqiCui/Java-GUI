package com.jsplitpane;

import javax.swing.*;

public class Dictionary extends JFrame {

    JSplitPane jlp;
    JList jli;
    JLabel jl;


    public static void main(String[] args) {
        Dictionary di = new Dictionary();
    }

    public Dictionary(){


        String []word = {"Boy","Girl","Man","Woman"};
        jli = new JList(word);
        jl = new JLabel(new ImageIcon("/Users/cuiyunqi/Desktop/HSP/GUI/src/main/java/com/jsplitpane/logo.jpeg"));

        jlp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,jli,jl);
        //分割处可以收缩
        jlp.setOneTouchExpandable(true);

        this.add(jlp);

        this.setTitle("Dictionary");
        this.setSize(500,300);
        this.setLocation(400,400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
        //this.setResizable(false);

    }

}