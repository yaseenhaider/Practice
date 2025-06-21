package gui;

import db.DatabaseConnection;
import model.*;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class LoginGUI {
    public LoginGUI() {
        JFrame frame = new JFrame("Login");
        frame.setSize(400, 250);
        frame.setLayout(new GridLayout(4, 2, 10, 10));

        JTextField emailField = new JTextField();
        JPasswordField passField = new JPasswordField();
        JButton loginBtn = new JButton("Login");

        frame.add(new JLabel("Email:"));
        frame.add(emailField);
        frame.add(new JLabel("Password:"));
        frame.add(passField);
        frame.add(new JLabel(""));
        frame.add(loginBtn);

        loginBtn.addActionListener(e -> {
            try (Connection con = DatabaseConnection.getConnection()) {
                String sql = "SELECT * FROM users WHERE email=? AND password=?";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, emailField.getText());
                ps.setString(2, new String(passField.getPassword()));
                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    String email = rs.getString("email");
                    String role = rs.getString("role");

                    frame.dispose();
                    if (role.equals("admin"))
                        new Admin(id, name, email).showGUI();
                    else
                        new Customer(id, name, email).showGUI();
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid credentials.");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        frame.setVisible(true);
    }
}
