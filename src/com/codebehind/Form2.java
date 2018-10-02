package com.codebehind;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form2 extends JFrame {
    private JButton buttonBackSpace;
    public JPanel jPanel;
    private JButton buttonClear;
    private JButton buttonClears;
    private JButton buttonCalculate;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button0;
    private JButton buttonDivision;
    private JButton buttonMultiplication;
    private JButton buttonSubtraction;
    private JButton buttonPoint;
    private JButton buttonSum;
    private JLabel lableResult;
    private JLabel lableCalc;
    //    static JFrame jFrame;

    double result=0;


    public Form2() {

        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lableResult.setText(lableResult.getText()+"0");
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lableResult.setText(lableResult.getText()+"1");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lableResult.setText(lableResult.getText()+"2");
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lableResult.setText(lableResult.getText()+"3");
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lableResult.setText(lableResult.getText()+"4");
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lableResult.setText(lableResult.getText()+"5");
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lableResult.setText(lableResult.getText()+"6");
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lableResult.setText(lableResult.getText()+"7");
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lableResult.setText(lableResult.getText()+"8");
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lableResult.setText(lableResult.getText()+"9");
            }
        });
        buttonPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lableResult.setText(lableResult.getText()+".");
            }
        });

        buttonBackSpace.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n=lableResult.getText().length();
                String s =lableResult.getText().substring(0,n-1);
                lableResult.setText(s);
            }
        });
        buttonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lableResult.setText("");
            }
        });
        buttonClears.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lableResult.setText("");
                lableCalc.setText("");
            }
        });



    }

}
