package com.keyin.member;

import java.awt.Font;

import javax.swing.JFrame;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MembersList {

    MembersList() {

        DefaultTableModel tableModel = new DefaultTableModel();
        JTable table = new JTable(tableModel);
        tableModel.addColumn("Name");
        tableModel.addColumn("Address");
        tableModel.addColumn("Email");
        tableModel.addColumn("Phone");
        tableModel.addColumn("StartDate");
        tableModel.addColumn("Duration(Years)");
        tableModel.addColumn("Type");
        tableModel.addColumn("CurrentTournaments");
        tableModel.addColumn("PastTournaments");
        tableModel.addColumn("UpcomingTournaments");

        // prevent from resizing
        table.getTableHeader().setResizingAllowed(false);
        tableModel.addRow(new Object[] { "John", "123 Main St", "john@email.ca", "123-456-7890",
                "01/01/2019", "1", "Normal" });
        tableModel.addRow(new Object[] {});
        tableModel.addRow(new Object[] {});
        tableModel.addRow(new Object[] {});
        tableModel.addRow(new Object[] {});
        tableModel.addRow(new Object[] {});
        tableModel.addRow(new Object[] {});
        tableModel.addRow(new Object[] {});
        tableModel.addRow(new Object[] {});
        tableModel.addRow(new Object[] {});
        tableModel.addRow(new Object[] {});
        tableModel.addRow(new Object[] {});
        tableModel.addRow(new Object[] {});

        System.out.println("Table rows = " + table.getRowCount());
        System.out.println("Table columns = " + table.getColumnCount());
        Font font = new Font("Verdana", Font.PLAIN, 12);
        table.setFont(font);
        JFrame frame = new JFrame();
        frame.setSize(600, 400);
        frame.add(new JScrollPane(table));
        frame.setVisible(true);
    }
}
