package com.codebehind;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JButton Button1;
    private JPanel jPanel;
    private JLabel lable1;
    private JButton ButtonExit;
    private JButton button2;

    public static void main(String[] args) {
        JFrame jFrame=new JFrame("برنامه من");
        jFrame.setPreferredSize(new Dimension(600,400));
        jFrame.setContentPane(new App().jPanel);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.pack();
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
    }


}
