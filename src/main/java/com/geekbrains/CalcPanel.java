package com.geekbrains;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcPanel extends JPanel {
    JTextField field = null;

    double a1, a2, result;
    String operator;

    public CalcPanel() {
        try {
            setLayout(null);
            final TextField field = new TextField();
            field.setBounds(10, 10, 230, 25);
            add(field);

            JButton b0 = new JButton("0");
            b0.setBounds(10, 250, 50, 50);
            add(b0);
            b0.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    field.setText(field.getText() + b0.getText());
                    if (a1 == 0) {
                        a1 = Double.valueOf(field.getText());
                    } else {
                        a2 = Double.valueOf(field.getText());
                    }
                }
            });

            JButton b1 = new JButton("1");
            b1.setBounds(10, 190, 50, 50);
            add(b1);
            b1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    field.setText(field.getText() + b1.getText());
                    if (a1 == 0) {
                        a1 = Double.valueOf(field.getText());
                    } else {
                        a2 = Double.valueOf(field.getText());
                    }
                }
            });

            JButton b2 = new JButton("2");
            b2.setBounds(70, 190, 50, 50);
            add(b2);
            b2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    field.setText(field.getText() + b2.getText());
                    if (a1 == 0) {
                        a1 = Double.valueOf(field.getText());
                    } else {
                        a2 = Double.valueOf(field.getText());
                    }
                }
            });

            JButton b3 = new JButton("3");
            b3.setBounds(130, 190, 50, 50);
            add(b3);
            b3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    field.setText(field.getText() + b3.getText());
                    if (a1 == 0) {
                        a1 = Double.valueOf(field.getText());
                    } else {
                        a2 = Double.valueOf(field.getText());
                    }
                }
            });

            JButton b4 = new JButton("4");
            b4.setBounds(10, 130, 50, 50);
            add(b4);
            b4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    field.setText(field.getText() + b4.getText());
                    if (a1 == 0) {
                        a1 = Double.valueOf(field.getText());
                    } else {
                        a2 = Double.valueOf(field.getText());
                    }
                }
            });

            JButton b5 = new JButton("5");
            b5.setBounds(70, 130, 50, 50);
            add(b5);
            b5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    field.setText(field.getText() + b5.getText());
                    if (a1 == 0) {
                        a1 = Double.valueOf(field.getText());
                    } else {
                        a2 = Double.valueOf(field.getText());
                    }
                }
            });

            JButton b6 = new JButton("6");
            b6.setBounds(130, 130, 50, 50);
            add(b6);
            b6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    field.setText(field.getText() + b6.getText());
                    if (a1 == 0) {
                        a1 = Double.valueOf(field.getText());
                    } else {
                        a2 = Double.valueOf(field.getText());
                    }
                }
            });

            JButton b7 = new JButton("7");
            b7.setBounds(10, 70, 50, 50);
            add(b7);
            b7.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    field.setText(field.getText() + b7.getText());
                    if (a1 == 0) {
                        a1 = Double.valueOf(field.getText());
                    } else {
                        a2 = Double.valueOf(field.getText());
                    }
                }
            });

            JButton b8 = new JButton("8");
            b8.setBounds(70, 70, 50, 50);
            add(b8);
            b8.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    field.setText(field.getText() + b8.getText());
                    if (a1 == 0) {
                        a1 = Double.valueOf(field.getText());
                    } else {
                        a2 = Double.valueOf(field.getText());
                    }
                }
            });

            JButton b9 = new JButton("9");
            b9.setBounds(130, 70, 50, 50);
            add(b9);
            b9.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    field.setText(field.getText() + b9.getText());
                    if (a1 == 0) {
                        a1 = Double.valueOf(field.getText());
                    } else {
                        a2 = Double.valueOf(field.getText());
                    }
                }
            });

            JButton bResult = new JButton("=");
            bResult.setBounds(70, 250, 110, 50);
            add(bResult);
            bResult.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    double n1 = a1;
                    double n2 = a2;
                    String strOperator = operator;

                    Calculator cal = new Calculator();
                    String strResult = String.valueOf(cal.calc(a1, strOperator, a2));
                    field.setText(strResult);
                }
            });

            JButton bPlus = new JButton("+");
            bPlus.setBounds(190, 70, 50, 50);
            add(bPlus);
            bPlus.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    a1 = Integer.valueOf(field.getText());
                    field.setText("");
                    operator = "+";
                }
            });

            JButton bMinus = new JButton("-");
            bMinus.setBounds(190, 130, 50, 50);
            add(bMinus);
            bMinus.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    a1 = Double.valueOf(field.getText());
                    field.setText("");
                    operator = "-";
                }
            });

            JButton bMulti = new JButton("*");
            bMulti.setBounds(190, 190, 50, 50);
            add(bMulti);
            bMulti.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    a1 = Double.valueOf(field.getText());
                    field.setText("");
                    operator = "*";
                }
            });

            JButton bDiv = new JButton("/");
            bDiv.setBounds(190, 250, 50, 50);
            add(bDiv);
            bDiv.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    a1 = Double.valueOf(field.getText());
                    field.setText("");
                    operator = "/";
                }
            });
        } catch (ArithmeticException exception) {
            System.out.println("zero");
        }
    }
}
