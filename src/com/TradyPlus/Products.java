package com.TradyPlus;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import javax.swing.ListSelectionModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Products extends JFrame {

	private static final long serialVersionUID = 1L;
	protected static final DefaultTableModel tableModel = null;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Products frame = new Products();
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
	public Products() {
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
		panel_2.add(lblLogout);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_3.setBounds(493, 180, 666, 409);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 666, 409);
		panel_3.add(scrollPane);
		
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ProductId", "Product Name", "Quantity", "Quality", "Price"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("Add Product");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddProducts ap=new AddProducts();
				ap.setVisible(true);
			}
		});
		btnNewButton.setBounds(493, 130, 132, 38);
		panel.add(btnNewButton);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				ConnectDB db = new ConnectDB();
//	            db.dbConnection();
//	            String productid=null;
//	            db.deleteProduct(productid);
				
				 int selectedRow = table.getSelectedRow();
			     if (selectedRow != -1) {
			         String productId = table.getValueAt(selectedRow, 0).toString();
			         deleteProduct(productId);
			         tableModel.removeRow(selectedRow);
			     }
				
		
              
			}
		});
		btnDelete.setBounds(493, 615, 132, 38);
		panel.add(btnDelete);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(667, 615, 132, 38);
		panel.add(btnUpdate);
	    DefaultTableModel model = (DefaultTableModel) table.getModel();
        try {
            ConnectDB db = new ConnectDB();
            db.dbConnection(); 
   
            ResultSet rs = db.getProducts();
            while (rs.next()) {
                String ProductId = rs.getString("ProductId");
                String ProductName = rs.getString("ProductName");
                String Quantity = rs.getString("Quantity");
                String Quality = rs.getString("Quality");
                String Price = rs.getString("Price");
             
                model.addRow(new Object[]{ProductId, ProductName, Quantity, Quality,Price});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } 
			
			
			
		
	}

	protected void deleteProduct(String productId) {
		// TODO Auto-generated method stub
		
	}
	

}
