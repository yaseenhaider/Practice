package gui;

import db.DatabaseConnection;
import model.Admin;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class AdminGUI {
    public AdminGUI(Admin admin) {
        JFrame frame = new JFrame("Admin Dashboard - " + admin.name);
        frame.setSize(500, 300);
        frame.setLayout(new GridLayout(5, 2, 10, 10));

        JTextField nameField = new JTextField();
        JTextField priceField = new JTextField();
        JTextField stockField = new JTextField();
        JButton addBtn = new JButton("Add Product");

        frame.add(new JLabel("Product Name:"));
        frame.add(nameField);
        frame.add(new JLabel("Price:"));
        frame.add(priceField);
        frame.add(new JLabel("Stock:"));
        frame.add(stockField);
        frame.add(new JLabel(""));
        frame.add(addBtn);

        addBtn.addActionListener(e -> {
            try (Connection con = DatabaseConnection.getConnection()) {
                String sql = "INSERT INTO products (name, price, stock) VALUES (?, ?, ?)";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, nameField.getText());
                ps.setDouble(2, Double.parseDouble(priceField.getText()));
                ps.setInt(3, Integer.parseInt(stockField.getText()));
                ps.executeUpdate();
                JOptionPane.showMessageDialog(frame, "Product Added!");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        frame.setVisible(true);
    }
}
