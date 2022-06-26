package com.keyin.member;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

import java.awt.Font;

public class TournamentsList {

    TournamentsList() {

        DefaultTableModel tableModel = new DefaultTableModel();
        JTable table = new JTable(tableModel);
        tableModel.addColumn("Start Date");
        tableModel.addColumn("End Date");
        tableModel.addColumn("Location");
        tableModel.addColumn("Entry Fee($)");
        tableModel.addColumn("Cash Prize($)");
        tableModel.addColumn("Participating Members");
        tableModel.addColumn("Final Standings");

        table.getTableHeader().setResizingAllowed(false);
        tableModel.addRow(new Object[] { "01/01/2019", "02/01/2019", "123 Main St", "100", "1000",
                "John, Fran, Jimmy", "John" });
        tableModel.addRow(new Object[] { "05/12/2021", "07/12/2021", "Fake Road Golf Course", "100", "500",
                "Cleopatra, Othello, Kaela", "Kaela" });
        tableModel.addRow(new Object[] { "12/02/2022", "14/02/2022", "Captain Crunch Course", "150", "600",
                "Jimmy, Timmy, Tammy", "Timmy" });
        tableModel.addRow(new Object[] { "22/03/2022", "24/03/2022", "Corn Flakes Course", "100", "500",
                "Othello, Mark, Danica", "Danica" });
        tableModel.addRow(new Object[] { "15/04/2022", "14/04/2022", "Fake Road Golf Course", "150", "600",
                "John, Sally, Tammy", "Sally" });
        tableModel.addRow(new Object[] { "22/05/2022", "24/05/2022", "Corn Flakes Course", "120", "650",
                "Sally, Marc, Cleopatra", "Cleopatra" });
        tableModel.addRow(new Object[] { "03/06/2022", "05/06/2022", "Captain Crunch Course", "150", "700",
                "Perrine, Sally, Jimmy", "Jimmy" });
        tableModel.addRow(new Object[] { "15/06/2022", "17/06/2022", "123 Main Street", "200", "800",
                "Sally, Marc, John", "John" });
        tableModel.addRow(new Object[] { "26/06/2022", "29/06/2022", "Corn Flakes Course", "100", "600",
                "Sally, Kaela, Fran", "Kaela" });
        tableModel.addRow(new Object[] { "05/07/2022", "08/07/2022", "Fake Road Golf Course", "200", "1200",
                "John, Othello, Tammy", "John" });
        tableModel.addRow(new Object[] { "12/08/2022", "15/08/2022", "Captain Crunch Course", "100", "700",
                "Timmy, Fran, Marc", "Fran" });
        tableModel.addRow(new Object[] { "09/09/2022", "12/09/2022", "Corn Flakes Course", "150", "800",
                "John, Othello, Danica", "Othello" });
        tableModel.addRow(new Object[] { "15/10/2022", "18/10/22022", "123 Main Street", "120", "700",
                "Jimmy, Cleopatra, Marc", "Marc" });

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