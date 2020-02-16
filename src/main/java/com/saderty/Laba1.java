package com.saderty;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Laba1 extends JFrame {
    Laba1() {
        setSize(1000, 1000);
        setLayout(null);

        final JTextField jTextField1 = new JTextField();
        jTextField1.setBounds(100, 100, 200, 50);
        add(jTextField1);
        final JTextField jTextField2 = new JTextField();
        jTextField2.setBounds(100, 150, 200, 50);
        add(jTextField2);
        final JTextField jTextField3 = new JTextField();
        jTextField3.setBounds(100, 200, 200, 50);
        add(jTextField3);
        final JButton button1 = new JButton();
        button1.setBounds(100, 300, 200, 50);
        button1.setText("Calc");
        add(button1);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double d1 = Double.parseDouble(jTextField1.getText());
                int s1 = Integer.parseInt(jTextField2.getText());
                int s2 = Integer.parseInt(jTextField3.getText());
                button1.setText(NumUtils.calc(d1, s1, s2));
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new Laba1();
    }
}
