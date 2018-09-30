package com.codebehind;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App  {
    private JButton Button1;
    private JPanel jPanel;
    private JLabel lable1;
    private JButton ButtonExit;
    private JButton button2;
    private JButton button3;
    static JFrame jFrame;
    static JFrame jFrame2;

    public static void main(String[] args) {
        jFrame=new JFrame("برنامه من");
        jFrame.setPreferredSize(new Dimension(600,400));
        jFrame.setContentPane(new App().jPanel);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.setResizable(false);

    }

    public App() {
        Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "خوش آمدید");
                lable1.setText("خوش آمدید");
            }
        });
        ButtonExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               System.exit(0);
               //exit
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                jFrame2=new JFrame("22222222");
                jFrame2.setPreferredSize(new Dimension(500,300));
                jFrame2.setContentPane(new Form2().jPanel);
                jFrame2.setDefaultCloseOperation(jFrame2.HIDE_ON_CLOSE);
                jFrame2.pack();
                jFrame2.setLocationRelativeTo(null);
                jFrame2.setVisible(true);
                jFrame2.setResizable(false);
            }
        });
    }


}
