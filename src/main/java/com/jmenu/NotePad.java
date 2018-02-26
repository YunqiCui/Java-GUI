/*
 * JMenu
 */


package com.jmenu;

import javax.swing.*;
import java.awt.*;
public class NotePad extends JFrame {
    private JMenuBar jmb;
    private JMenu jm1,jm2,jm3,jm4,jm5,newFile;
    private JMenuItem item1,item2,item3,item4,item5,item6,file,project;

    private JToolBar jtb;
    private JButton jb1,jb2,jb3,jb4,jb5,jb6;

    private JTextArea jta;
    private JScrollPane jsp;




    public static void main(String[] args) {
        NotePad np = new NotePad();
    }

    public NotePad(){

        jtb = new JToolBar();
        jb1 = new JButton(new ImageIcon("/Users/cuiyunqi/Desktop/HSP/GUI/src/main/java/com/jmenu/new.png"));
        jb1.setToolTipText("New");
        jb2 = new JButton(new ImageIcon("/Users/cuiyunqi/Desktop/HSP/GUI/src/main/java/com/jmenu/open.png"));
        jb2.setToolTipText("Open");
        jb3 = new JButton(new ImageIcon("/Users/cuiyunqi/Desktop/HSP/GUI/src/main/java/com/jmenu/save.png"));
        jb3.setToolTipText("Save");
        jb4 = new JButton(new ImageIcon("/Users/cuiyunqi/Desktop/HSP/GUI/src/main/java/com/jmenu/copy.png"));
        jb4.setToolTipText("Copy");
        jb5 = new JButton(new ImageIcon("/Users/cuiyunqi/Desktop/HSP/GUI/src/main/java/com/jmenu/cut.png"));
        jb5.setToolTipText("Cut");
        jb6 = new JButton(new ImageIcon("/Users/cuiyunqi/Desktop/HSP/GUI/src/main/java/com/jmenu/paste.png"));
        jb6.setToolTipText("Paste");

        jmb = new JMenuBar();
        jm1 = new JMenu("File(F)");
        jm1.setMnemonic('F');
        jm2 = new JMenu("Edit(E)");
        jm2.setMnemonic('E');
        jm3 = new JMenu("Format(O)");
        jm3.setMnemonic('O');
        jm4 = new JMenu("View(V)");
        jm4.setMnemonic('V');
        jm5 = new JMenu("Help(H)");
        jm5.setMnemonic('H');

        newFile = new JMenu("New");
        file = new JMenuItem("New File");
        project = new JMenuItem("New Project");

        item1 = new JMenuItem("Open");
        item2 = new JMenuItem("Save");
        item3 = new JMenuItem("Save as");
        item4 = new JMenuItem("Setting");
        item5 = new JMenuItem("Print");
        item6 = new JMenuItem("Exit");

        jta = new JTextArea();

        jtb.add(jb1);
        jtb.add(jb2);
        jtb.add(jb3);
        jtb.add(jb4);
        jtb.add(jb5);
        jtb.add(jb6);

        newFile.add(file);
        newFile.add(project);

        jm1.add(newFile);
        jm1.add(item1);
        jm1.add(item2);
        jm1.add(item3);
        jm1.addSeparator();
        jm1.add(item4);
        jm1.add(item5);
        jm1.add(item6);

        jmb.add(jm1);
        jmb.add(jm2);
        jmb.add(jm3);
        jmb.add(jm4);
        jmb.add(jm5);

        this.setJMenuBar(jmb);
        this.add(jtb,BorderLayout.NORTH);

        jsp = new JScrollPane(jta);
        jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        this.add(jsp);

        this.setTitle("Notepad");
        this.setSize(500,400);
        this.setLocation(400,400);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        }
}
