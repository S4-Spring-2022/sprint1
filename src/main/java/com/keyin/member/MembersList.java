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
                "01/01/2019", "3", "Normal", "CancerSociety", "YouthSociety", "N/A" });
        tableModel.addRow(new Object[] { "Sally Lytle", "123 Fake Street", "sally@gmail.com", "809-123-4567",
                "02/03/2022", "2", "Trial", "N/A", "N/A", "N/A" });
        tableModel.addRow(new Object[] { "Danica Dickman", "49 Bunting Road", "ddickman1@erecht24.de",
                "611-901-6681",
                "24/12/2014", "8", "Regular", "CancerSociety", "YouthSociety", "N/A" });
        tableModel.addRow(new Object[] { "Kaela Turgoose", "72650 Anthes Lane", "kturgoose2@microsoft.com",
                "763-954-7498",
                "02/04/2021", "1", "Other","N/A", "YouthSociety", "N/A"  });
        tableModel.addRow(new Object[] { "Timmy Carnaman", "2 Holy Cross Parkway", "tcarnaman3@addtoany.com",
                "965-681-9819",
                "04/02/2019", "3", "Family", "CancerSociety", "YouthSociety", "N/A" });
        tableModel.addRow(new Object[] { "Jimmy Carnaman", "2 Holy Cross Parkway", "jcarnaman@addtoany.com",
                "965-681-9818",
                "04/02/2019", "3", "Family", "CancerSociety", "YouthSociety", "N/A" });
        tableModel.addRow(new Object[] { "Tammy Carnaman", "2 Holy Cross Parkway", "tcarnaman4@addtoany.com",
                "965-681-9820",
                "04/02/2019", "3", "Family", "CancerSociety", "YouthSociety", "N/A" });
        tableModel.addRow(new Object[] { "Othello Bonellie", "78 Dixon Court", "obonellie6@blogs.com",
                "681-726-4693",
                "05/24/2010", "12", "Regular", "CancerSociety", "N/A", "N/A" });
        tableModel.addRow(new Object[] { "Fran Fine", "4385 Flushing Way", "ffines7@gmail.com", "200-596-2578",
                "12/05/2021", "1", "Special Offer", "N/A", "N/A", "N/A" });
        tableModel.addRow(new Object[] { "Cleopatra Chomley", "4151 Fuller Plaza",
                "cchomley8@ezinearticles.com", "305-678-0947",
                "21/06/2018", "4", "Family", "CancerSociety", "YouthSociety", "N/A" });
        tableModel.addRow(new Object[] { "Marc Chomley", "4151 Fuller Plaza", "mchomley8@ezinearticles.com",
                "305-678-0947",
                "21/06/2018", "4", "Family", "CancerSociety", "YouthSociety", "N/A" });
        tableModel.addRow(new Object[] { "Bartolomeo Basketter", "548 Del Mar Plaza", "bbasketterc@auda.org.au",
                "577-641-6493",
                "20/12/2019", "3", "Regular", "CancerSociety", "YouthSociety", "N/A" });
        tableModel.addRow(new Object[] { "Perrine Ravenshaw", "14035 Tony Crossing", "pravenshawe@oracle.com",
                "706-353-5334",
                "14/06/2022", "0", "Trial", "N/A", "N/A", "N/A" });

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
