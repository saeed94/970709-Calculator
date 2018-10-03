package com.codebehind;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form2 extends JFrame {
    private JButton buttonBackSpace;
    public JPanel jPanel;
    private JButton buttonClears;
    private JButton buttonClear;
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

    double result=0;
    boolean showResult=false;
    String function="";


    public Form2() {

        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(showResult)
                    lableResult.setText("");
                showResult=false;
                lableResult.setText(lableResult.getText()+"0");
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(showResult)
                    lableResult.setText("");
                showResult=false;
                lableResult.setText(lableResult.getText()+"1");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(showResult)
                    lableResult.setText("");
                showResult=false;
                lableResult.setText(lableResult.getText()+"2");
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(showResult)
                    lableResult.setText("");
                showResult=false;
                lableResult.setText(lableResult.getText()+"3");
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(showResult)
                    lableResult.setText("");
                showResult=false;
                lableResult.setText(lableResult.getText()+"4");
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(showResult)
                    lableResult.setText("");
                showResult=false;
                lableResult.setText(lableResult.getText()+"5");
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(showResult)
                    lableResult.setText("");
                showResult=false;
                lableResult.setText(lableResult.getText()+"6");
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(showResult)
                    lableResult.setText("");
                showResult=false;
                lableResult.setText(lableResult.getText()+"7");
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(showResult)
                    lableResult.setText("");
                showResult=false;
                lableResult.setText(lableResult.getText()+"8");
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(showResult)
                    lableResult.setText("");
                showResult=false;
                lableResult.setText(lableResult.getText()+"9");
            }
        });
        buttonPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(showResult)
                    lableResult.setText("");
                showResult=false;
                lableResult.setText(lableResult.getText()+".");
            }
        });

        buttonBackSpace.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int n = lableResult.getText().length();
                    String s = lableResult.getText().substring(0, n - 1);
                    lableResult.setText(s);
                }catch (Exception el){}
            }
        });
        buttonClears.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lableResult.setText("");
                lableCalc.setText("");
            }
        });
        buttonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lableResult.setText("");
            }
        });

        buttonDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String calc=lableCalc.getText();
                if(function=="*"||function=="-"||function=="+"&&!lableCalc.getText().isEmpty()) {
                    lableCalc.setText(calc.substring(0, String.valueOf(calc).length() - 3));
                    lableCalc.setText(lableCalc.getText() + " ÷ ");
                    function="/";
                    return;
                }
                if (lableCalc.getText().isEmpty()) {
                    lableCalc.setText(lableResult.getText() + " ÷ ");
                    result=Double.parseDouble(lableResult.getText());
                }
                else {
                    lableCalc.setText(lableCalc.getText() + lableResult.getText() + " ÷ ");
                    function(function);
                }
                showResult = true;
                function="/";
            }
        });

        buttonMultiplication.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String calc=lableCalc.getText();
                if(function=="/"||function=="-"||function=="+"&&!lableCalc.getText().isEmpty()) {
                    lableCalc.setText(calc.substring(0, String.valueOf(calc).length() - 3));
                    lableCalc.setText(lableCalc.getText() + " × ");
                    function="*";
                    return;
                }
                if (lableCalc.getText().isEmpty()) {
                    lableCalc.setText(lableResult.getText() + " × ");
                    result=Double.parseDouble(lableResult.getText());
                }
                else {
                    lableCalc.setText(lableCalc.getText() + lableResult.getText() + " × ");
                    function(function);
                }
                showResult = true;
                function="*";

            }
        });

        buttonSubtraction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                function="-";
                String calc=lableCalc.getText();
                if(!function.isEmpty())
                    lableCalc.setText(calc.substring(0,String.valueOf(calc).length()-3));
                if (!lableCalc.getText().isEmpty()||showResult) {
                    lableCalc.setText(lableCalc.getText() + lableResult.getText() + " − ");
                    function(function);
                } else {
                    lableCalc.setText(lableResult.getText() + " − ");
                    result=Double.parseDouble(lableResult.getText());
                }
                showResult = true;
            }
        });

        buttonSum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                function="+";
                String calc=lableCalc.getText();
                if(!function.isEmpty())
                    lableCalc.setText(calc.substring(0,String.valueOf(calc).length()-3));
                if (!lableCalc.getText().isEmpty()||showResult) {
                    lableCalc.setText(lableCalc.getText() + lableResult.getText() + " + ");
                    function(function);
                } else {
                    lableCalc.setText(lableResult.getText() + " + ");
                    result=Double.parseDouble(lableResult.getText());
                }
                showResult = true;
            }
        });

        buttonCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!lableCalc.getText().isEmpty())
                    function(function);
                lableCalc.setText("");
                showResult = true;
            }
        });


    }

    void function (String s) {
        double auxiliary = 0;
        if (s == "/") {
            auxiliary = result / Double.parseDouble(lableResult.getText());
        }
        if (s == "*") {
            auxiliary = result * Double.parseDouble(lableResult.getText());
        }
        if (s == "-") {
            auxiliary = result - Double.parseDouble(lableResult.getText());
        }
        if (s == "+") {
            auxiliary = result + Double.parseDouble(lableResult.getText());
        }
        function="";
        result = auxiliary;
        if (result != 0) {
            if (auxiliary - Math.floor(auxiliary) != 0)
                lableResult.setText(String.valueOf(auxiliary));
            else
                lableResult.setText(String.format("%.0f", auxiliary));
        }
    }

}



