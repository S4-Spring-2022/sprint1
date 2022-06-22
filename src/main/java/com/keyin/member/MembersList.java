package com.keyin.member;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class MembersList {

    JFrame frame = new JFrame();
    JTable table;
    JScrollPane scrollPane;

    MembersList() {
        JLabel label = new JLabel("Members List");
        label.setBounds(350, 10, 200, 30);
        label.setFont(new Font("Serif", Font.BOLD, 20));

        String[] columnNames = { "Name", "Address", "Email", "Phone", "StartDate", "Duration(Years)", "Type" };
        Object[][] data = { { "John", "123 Main St", "john@email.ca", "123-456-7890", "01/01/2019", "1", "Normal" },
                { "Jane", "243 Main St", "jane@email.ca", "123-456-7890", "01/01/2019", "1", "Normal" }, };

        table = new JTable(data, columnNames);
        scrollPane = new JScrollPane(table);
        scrollPane.setBounds(10, 50, 1000, 1000);

        frame.add(label);
        frame.add(scrollPane);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 280);
        frame.setLayout(null);
        frame.setVisible(true);

    }

}
