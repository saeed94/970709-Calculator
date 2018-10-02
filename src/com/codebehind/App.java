package com.codebehind;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JPanel jPanel;
    private JButton buttonCalc;
    private JButton buttonInfo;
    private JButton buttonExit;
    static JFrame jFrame;
    static JFrame jFrame2;

    public static void main(String[] args) {
        jFrame = new JFrame("برنامه من");
        jFrame.setPreferredSize(new Dimension(440, 200));
        jFrame.setContentPane(new App().jPanel);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.setResizable(false);

    }

    public App() {
        buttonInfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "برنامه ماشین حساب ساده نوشته شده با زبان جاوا");
            }
        });
        buttonExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
                //exit
            }
        });
        buttonCalc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                jFrame2 = new JFrame("22222222");
                jFrame2.setPreferredSize(new Dimension(320, 450));
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
