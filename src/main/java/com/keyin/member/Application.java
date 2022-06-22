package com.keyin.member;

import java.awt.*;
import javax.swing.*;

public class Application {

    Application() {
        JPanel panel = new JPanel();

        JFrame frame = new JFrame("Input");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 330);

        frame.add(panel);

        panel.setLayout(null);

        JLabel title = new JLabel("Golf Club Application");
        title.setBounds(100, 1, 200, 25);
        panel.add(title);

        JLabel nameLabel = new JLabel("Enter Name: ");
        nameLabel.setBounds(10, 30, 200, 25);
        panel.add(nameLabel);

        JTextField nameField = new JTextField(20);
        nameField.setBounds(100, 30, 165, 25);
        panel.add(nameField);

        JLabel addressLabel = new JLabel("Enter Address: ");
        addressLabel.setBounds(10, 60, 200, 25);
        panel.add(addressLabel);

        JTextField addressField = new JTextField(20);
        addressField.setBounds(100, 60, 165, 25);
        panel.add(addressField);

        JLabel emailLabel = new JLabel("Enter Email: ");
        emailLabel.setBounds(10, 90, 200, 25);
        panel.add(emailLabel);

        JTextField emailField = new JTextField(20);
        emailField.setBounds(100, 90, 165, 25);
        panel.add(emailField);

        JLabel phoneLabel = new JLabel("Enter Phone#: ");
        phoneLabel.setBounds(10, 120, 200, 25);
        panel.add(phoneLabel);

        JTextField phoneField = new JTextField(20);
        phoneField.setBounds(100, 120, 165, 25);
        panel.add(phoneField);

        JLabel startLabel = new JLabel("Start Date: ");
        startLabel.setBounds(10, 150, 200, 25);
        panel.add(startLabel);

        JTextField startField = new JTextField(20);
        startField.setBounds(100, 150, 165, 25);
        panel.add(startField);

        JLabel durationLabel = new JLabel("Duration:");
        durationLabel.setBounds(10, 180, 200, 25);
        panel.add(durationLabel);

        JTextField durationField = new JTextField(20);
        durationField.setBounds(100, 180, 165, 25);
        panel.add(durationField);

        JLabel typeLabel = new JLabel("Membership: ");
        typeLabel.setBounds(10, 210, 200, 25);
        panel.add(typeLabel);

        String[] typeStrings = { "Normal", "Trial", "Special Offer", "Family Plan", "Other" };
        JComboBox typeBox = new JComboBox(typeStrings);
        typeBox.setBounds(100, 210, 165, 25);
        panel.add(typeBox);

        JButton button = new JButton("Submit");
        button.setBounds(130, 240, 80, 25);
        panel.add(button);

        frame.setVisible(true);

    }
}
