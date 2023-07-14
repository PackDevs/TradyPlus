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

public class Landing extends JFrame {

    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Landing frame = new Landing();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Landing() {
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
        
        JButton button = new JButton("<- Logout");
        button.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
        		
        		Home homePage=new Home();
        		homePage.setVisible(true);
        	}
        });
        button.setBounds(1217, 28, 117, 25);
        panel.add(button);

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
    }
}
