package com.codebehind;

import sun.swing.SwingUtilities2;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form2 extends JFrame{
    private JButton button1;
    public JPanel jPanel;
//    static JFrame jFrame;



    public Form2()  {

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1.setText("jhjgkffdh");
                setTitle("sldfkjsjlf");
            }
        });
    }

}
