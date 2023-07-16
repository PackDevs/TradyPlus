package com.TradyPlus;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConnectDB {
    private String dburl = "jdbc:mysql://localhost:3306/TradyPlusDB";
    private String dbuser = "root";
    private String dbpwd = "";
    private Connection con;

    public Connection dbConnection() {
        try {
            con = DriverManager.getConnection(dburl, dbuser, dbpwd);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    public void addUser(String fullname, String role, String user, String password) {
        if (fullname.length() > 0 && role.length() > 0 && user.length() > 0 && password.length() > 0) {
            if (role.equals("admin") || role.equals("user")) {
                String encryptedPassword = encryptPassword(password);
                String sql = "INSERT INTO users(FullName, Role, Email, Password) VALUES(?, ?, ?, ?)";
                try {
                    PreparedStatement st = con.prepareStatement(sql);
                    st.setString(1, fullname);
                    st.setString(2, role);
                    st.setString(3, user);
                    st.setString(4, encryptedPassword);
                    int row = st.executeUpdate();
                    if (row > 0) {
                        JOptionPane.showMessageDialog(null, "User Created");
                        Home homepage = new Home();
                        homepage.setVisible(true);
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Role is not valid, try again");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please fill in all fields");
        }
    }

    public ResultSet getUser(String user, String password) {
        ResultSet row = null;
        String encryptedPassword = encryptPassword(password);
        String sql = "SELECT * FROM users WHERE Email=? AND Password=?";
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, user);
            st.setString(2, encryptedPassword);
            row = st.executeQuery();
            if (row.next()) {
                Landing landingPage=new Landing();
                landingPage.setVisible(true);          
                }
            else {
            	JOptionPane.showMessageDialog(null, "Incorrect Email or Password");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            
        }
        return row;
    }

    private String encryptPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] digest = md.digest(password.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(String.format("%02x", b & 0xff));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
}
