package com.TradyPlus;


public class MainForm {

	public static void main(String[] args) {
		ConnectDB db= new ConnectDB();
		db.dbConnection();
	}
}
