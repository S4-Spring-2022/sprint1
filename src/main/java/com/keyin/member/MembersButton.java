package com.keyin.member;

import javax.swing.*;

public class MembersButton {

    JFrame frame = new JFrame();

    MembersButton() {
        JButton btn2 = new JButton("MembersList");
        btn2.setBounds(180, 100, 150, 50);
        btn2.setFocusable(false);

        frame.add(btn2);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 280);
        frame.setLayout(null);
        frame.setVisible(true);

    }

}
