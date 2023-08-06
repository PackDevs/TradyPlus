package com.TradyPlus;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;

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
            	String role=row.getString("role");
//            	String Names=row.getString("FullName");          	
            	
//            	System.out.println(role);
//            	System.out.println(Names);
            	if(role.equals("user")){
                Landing landingPage=new Landing();
                landingPage.setVisible(true); 
            	}else {
            		AdminDashboard ad=new AdminDashboard();
            		ad.setVisible(true);
            	}
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
    
    public void addProduct(String productid, String productname, String quantity, String quality,String price) {
        if (productid.length() > 0 && productname.length() > 0 && quantity.length() > 0 && quality.length() > 0 && price.length() > 0) {
            
                String sql = "INSERT INTO Producs(ProductID, ProductName, 	Quantity, Quality,Price) VALUES(?, ?, ?, ?,?)";
                try {
                    PreparedStatement st = con.prepareStatement(sql);
                    st.setString(1, productid);
                    st.setString(2, productname);
                    st.setString(3, quantity);
                    st.setString(4, quality);
                    st.setString(5, price);
                    int row = st.executeUpdate();
                    if (row > 0) {
                        JOptionPane.showMessageDialog(null, "Product Added");
                        Products products = new Products();
                        products.setVisible(true);
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
     
        } else {
            JOptionPane.showMessageDialog(null, "Please fill in all fields");
        }
    }
    
    public ResultSet getProducts() {
        ResultSet rs = null;
        try {
            if (con != null) {
                String query = "SELECT * FROM Producs";
                Statement stmt = con.createStatement();
                rs = stmt.executeQuery(query);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    public void deleteProduct(String productId) {
    	
    	try {
    		if(con!=null) {
    			String sql="DELETE FROM Producs WHERE ProductID=?";
    			PreparedStatement dst=con.prepareStatement(sql);
    			dst.setString(1, productId);
    			dst.executeUpdate();
    			dst.close();
    			
    			
    			}
    	}catch(SQLException e) {
    		e.printStackTrace();    	}
	
    }
    
    public void updateProduct(String productId, String newName, String newQuantity, String newQuality, String newPrice) {
    	 try {
    	        if (con != null) {
    	            String sql = "UPDATE Producs SET ProductName=?, Quantity=?, Quality=?, Price=? WHERE ProductID=?";
    	            PreparedStatement pst = con.prepareStatement(sql);
    	            pst.setString(1, newName);
    	            pst.setString(2, newQuantity);
    	            pst.setString(3, newQuality);
    	            pst.setString(4, newPrice);
    	            pst.setString(5, productId);
    	            pst.executeUpdate();
    	            dispose();
    	            Products pro=new Products();
    	            pro.setVisible(true);
    	            
    	        }
    	    } catch (SQLException e) {
    	        e.printStackTrace();
    	    }
    	
    }

	private void dispose() {
		// TODO Auto-generated method stub
		
	}

	public ResultSet getProductById(String productId) {
		ResultSet row=null;
		try {
	        if (con != null) {
	            String sql = "SELECT * FROM Producs WHERE ProductID=?";
	            PreparedStatement pst = con.prepareStatement(sql);
	            pst.setString(1, productId);
	            row= pst.executeQuery();
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
		return row;
	}
    
    
    
    
    
    
}
