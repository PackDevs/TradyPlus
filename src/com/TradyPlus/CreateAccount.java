package com.TradyPlus;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.border.MatteBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CreateAccount extends JFrame {

    private JPanel contentPane;
    private JTextField txtUser;
    private JPasswordField pwd;
    private JTextField txtRole;
    private JTextField txtName;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CreateAccount frame = new CreateAccount();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public CreateAccount() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 1400, 800);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 0, 0));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 1390, 83);
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel lblTrady = new JLabel("Trady");
        lblTrady.setFont(new Font("Gurajada", Font.BOLD, 80));
        lblTrady.setForeground(new Color(0, 0, 0));
        lblTrady.setHorizontalAlignment(SwingConstants.CENTER);
        lblTrady.setBounds(28, 12, 176, 71);
        panel.add(lblTrady);

        JLabel lblPlus = new JLabel("Plus");
        lblPlus.setHorizontalAlignment(SwingConstants.CENTER);
        lblPlus.setForeground(new Color(0, 0, 128));
        lblPlus.setFont(new Font("Dyuthi", Font.ITALIC, 80));
        lblPlus.setBounds(185, 14, 132, 71);
        panel.add(lblPlus);

        JLabel lblShopManagementSystem = new JLabel("Shop Management System");
        lblShopManagementSystem.setFont(new Font("Gurajada", Font.BOLD, 80));
        lblShopManagementSystem.setHorizontalAlignment(SwingConstants.CENTER);
        lblShopManagementSystem.setBounds(474, 12, 837, 71);
        panel.add(lblShopManagementSystem);

        JPanel panel_1 = new JPanel();
        panel_1.setBounds(0, 84, 648, 572);
        contentPane.add(panel_1);
        panel_1.setLayout(null);

        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 12));
        lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(0, 0, 648, 572);
        lblNewLabel.setIcon(new ImageIcon("/home/miompolly/eclipse-workspace/TradyPlus/images/trady2.jpg"));
        panel_1.add(lblNewLabel);


        JPanel panel_2 = new JPanel();
        panel_2.setLayout(null);
        panel_2.setBounds(0, 657, 1390, 60);
        contentPane.add(panel_2);

        JPanel panel_1_1 = new JPanel();
        panel_1_1.setLayout(null);
        panel_1_1.setBounds(648, 84, 742, 572);
        contentPane.add(panel_1_1);

        JPanel panel_1_1_1 = new JPanel();
        panel_1_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
        panel_1_1_1.setLayout(null);
        panel_1_1_1.setBounds(164, 30, 371, 478);
        panel_1_1.add(panel_1_1_1);

        JLabel lblEmailOrUsername = new JLabel("Email or Username");
        lblEmailOrUsername.setFont(new Font("FreeMono", Font.BOLD, 20));
        lblEmailOrUsername.setBounds(78, 205, 216, 27);
        panel_1_1_1.add(lblEmailOrUsername);

        txtUser = new JTextField();
        txtUser.setBounds(79, 244, 237, 32);
        panel_1_1_1.add(txtUser);
        txtUser.setColumns(10);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setFont(new Font("FreeMono", Font.BOLD, 20));
        lblPassword.setBounds(77, 288, 160, 27);
        panel_1_1_1.add(lblPassword);

        pwd = new JPasswordField();
        pwd.setBounds(79, 327, 237, 32);
        panel_1_1_1.add(pwd);

        JButton btnCreate = new JButton("Create");
        btnCreate.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if(e.getSource()==btnCreate) {
        			ConnectDB db = new ConnectDB();
        			db.dbConnection();
        			
        			String fullname=txtName.getText();
        			String role=txtRole.getText();
        			String user=txtUser.getText();
        			String password=pwd.getText();
        			
        			try {
						db.addUser(fullname, role, user, password);
						
					} catch (Exception e1) {
				
						e1.printStackTrace();
					}
        			
        		}
        		
        	}
        });
        btnCreate.setFont(new Font("FreeMono", Font.BOLD, 20));
        btnCreate.setBounds(84, 381, 106, 32);
        panel_1_1_1.add(btnCreate);

        JButton btnClear = new JButton("Clear");
        btnClear.setFont(new Font("FreeMono", Font.BOLD, 20));
        btnClear.setBounds(221, 381, 95, 32);
        panel_1_1_1.add(btnClear);

        JLabel lblNewLabel_2 = new JLabel("Already User");
        lblNewLabel_2.setFont(new Font("FreeMono", Font.BOLD, 20));
        lblNewLabel_2.setBounds(46, 423, 144, 27);
        panel_1_1_1.add(lblNewLabel_2);

        JButton btnCreateAccount = new JButton("Login");
        btnCreateAccount.setBounds(221, 425, 95, 25);
        panel_1_1_1.add(btnCreateAccount);
        
        JLabel lblEmailOrUsername_1 = new JLabel("Role");
        lblEmailOrUsername_1.setFont(new Font("FreeMono", Font.BOLD, 20));
        lblEmailOrUsername_1.setBounds(78, 122, 216, 27);
        panel_1_1_1.add(lblEmailOrUsername_1);
        
        txtRole = new JTextField();
        txtRole.setColumns(10);
        txtRole.setBounds(79, 161, 237, 32);
        panel_1_1_1.add(txtRole);
        
        JLabel lblEmailOrUsername_1_1 = new JLabel("Full Name");
        lblEmailOrUsername_1_1.setFont(new Font("FreeMono", Font.BOLD, 20));
        lblEmailOrUsername_1_1.setBounds(78, 39, 216, 27);
        panel_1_1_1.add(lblEmailOrUsername_1_1);
        
        txtName = new JTextField();
        txtName.setColumns(10);
        txtName.setBounds(79, 78, 237, 32);
        panel_1_1_1.add(txtName);

   
        btnCreateAccount.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               dispose();
               Home homePage=new Home();
               homePage.setVisible(true);
            	
            }
        });
    }
}
