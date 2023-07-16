package com.TradyPlus;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JTextPane;

public class AdminDashboard extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminDashboard frame = new AdminDashboard();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AdminDashboard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1400, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 0)));
		panel.setBounds(0, 0, 1400, 800);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(98, 160, 234));
		panel_1.setBounds(0, 0, 1400, 90);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/home/miompolly/eclipse-workspace/TradyPlus/images/profile-user_64572.png"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(1120, 12, 64, 66);
		panel_1.add(lblNewLabel);
		
		JLabel lblTrady = new JLabel("Trady");
		lblTrady.setHorizontalAlignment(SwingConstants.CENTER);
		lblTrady.setForeground(Color.BLACK);
		lblTrady.setFont(new Font("Gurajada", Font.BOLD, 80));
		lblTrady.setBounds(22, 12, 176, 71);
		panel_1.add(lblTrady);
		
		JLabel lblPlus = new JLabel("Plus");
		lblPlus.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlus.setForeground(new Color(0, 0, 128));
		lblPlus.setFont(new Font("Dyuthi", Font.ITALIC, 80));
		lblPlus.setBounds(179, 14, 132, 71);
		panel_1.add(lblPlus);
		
	
		
		String names="Joel Minani";
		JLabel lblNewLabel_1 = new JLabel(names);
		lblNewLabel_1.setFont(new Font("FreeMono", Font.BOLD, 23));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(1196, 24, 100, 36);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(UIManager.getColor("Button.foreground"));
		panel_2.setBounds(0, 90, 260, 633);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblDashboard = new JLabel(" Dashboard");
		lblDashboard.setForeground(UIManager.getColor("Button.highlight"));
		lblDashboard.setFont(new Font("FreeMono", Font.BOLD, 18));
		lblDashboard.setVerticalAlignment(SwingConstants.TOP);
		lblDashboard.setHorizontalAlignment(SwingConstants.LEFT);
		lblDashboard.setBounds(47, 52, 141, 31);
		lblDashboard.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) 
			{
				AdminDashboard adm=new AdminDashboard();
				adm.setVisible(true);
			}
		});
		
		panel_2.add(lblDashboard);
		
		JLabel lblProduvts = new JLabel(" Products");
		lblProduvts.setForeground(UIManager.getColor("Button.highlight"));
		lblProduvts.setFont(new Font("FreeMono", Font.BOLD, 18));
		lblProduvts.setVerticalAlignment(SwingConstants.TOP);
		lblProduvts.setHorizontalAlignment(SwingConstants.LEFT);
		lblProduvts.setBounds(47, 102, 141, 31);
		lblProduvts.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) 
			{
				Products adm=new Products();
				adm.setVisible(true);
			}
		});
		panel_2.add(lblProduvts);
		
		JLabel lblOrders = new JLabel(" Orders");
		lblOrders.setForeground(UIManager.getColor("Button.highlight"));
		lblOrders.setFont(new Font("FreeMono", Font.BOLD, 18));
		lblOrders.setVerticalAlignment(SwingConstants.TOP);
		lblOrders.setHorizontalAlignment(SwingConstants.LEFT);
		lblOrders.setBounds(47, 149, 141, 31);
		panel_2.add(lblOrders);
		
		JLabel lblCustomers = new JLabel(" Customers");
		lblCustomers.setForeground(UIManager.getColor("Button.highlight"));
		lblCustomers.setFont(new Font("FreeMono", Font.BOLD, 18));
		lblCustomers.setVerticalAlignment(SwingConstants.TOP);
		lblCustomers.setHorizontalAlignment(SwingConstants.LEFT);
		lblCustomers.setBounds(47, 195, 141, 31);
		panel_2.add(lblCustomers);
		
		JLabel lblStaff = new JLabel(" Staff");
		lblStaff.setForeground(UIManager.getColor("Button.highlight"));
		lblStaff.setFont(new Font("FreeMono", Font.BOLD, 18));
		lblStaff.setVerticalAlignment(SwingConstants.TOP);
		lblStaff.setHorizontalAlignment(SwingConstants.LEFT);
		lblStaff.setBounds(47, 244, 141, 31);
		panel_2.add(lblStaff);
		
		JLabel lblReports = new JLabel(" Reports");
		lblReports.setForeground(UIManager.getColor("Button.highlight"));
		lblReports.setFont(new Font("FreeMono", Font.BOLD, 18));
		lblReports.setVerticalAlignment(SwingConstants.TOP);
		lblReports.setHorizontalAlignment(SwingConstants.LEFT);
		lblReports.setBounds(47, 294, 141, 31);
		panel_2.add(lblReports);
		
		JLabel lblSettings = new JLabel(" Settings");
		lblSettings.setForeground(UIManager.getColor("Button.highlight"));
		lblSettings.setFont(new Font("FreeMono", Font.BOLD, 18));
		lblSettings.setVerticalAlignment(SwingConstants.TOP);
		lblSettings.setHorizontalAlignment(SwingConstants.LEFT);
		lblSettings.setBounds(47, 347, 141, 31);
		panel_2.add(lblSettings);
		
		JLabel lblLogout = new JLabel(" Logout");
		lblLogout.setForeground(UIManager.getColor("Button.highlight"));
		lblLogout.setFont(new Font("FreeMono", Font.BOLD, 18));
		lblLogout.setVerticalAlignment(SwingConstants.TOP);
		lblLogout.setHorizontalAlignment(SwingConstants.LEFT);
		lblLogout.setBounds(47, 398, 141, 31);
		lblLogout.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) 
			{
				Home hm=new Home();
				hm.setVisible(true);
			}
		});
		panel_2.add(lblLogout);
	}
}
