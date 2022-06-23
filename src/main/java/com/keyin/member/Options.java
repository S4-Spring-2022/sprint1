package com.keyin.member;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Options implements ActionListener {

    static JFrame frame = new JFrame();

    public Options() {

        JButton btn = new JButton("Application");
        btn.setBounds(10, 100, 150, 50);
        btn.setFocusable(false);
        btn.addActionListener(this);

        frame.add(btn);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 280);
        frame.setLayout(null);
        frame.setVisible(true);

        JButton btn2 = new JButton("MembersList");
        btn2.setBounds(180, 100, 150, 50);
        btn2.setFocusable(false);
        btn2.addActionListener(this);

        frame.add(btn2);

    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        if (arg0.getSource() == frame.getContentPane().getComponent(0)) {
            new Application();
        } else if (arg0.getSource() == frame.getContentPane().getComponent(1)) {
            new MembersList();
        }

    }

}
