package com.shoping;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class OrderHistory {

	public void previousOrderHistory() throws ClassNotFoundException, SQLException {
		System.out.println("Previous Order History of User : ");
		System.out.println("----------------------------------");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter UserName : ");
		String Username = scan.next();
		//create connection
		ConnectionTest connectionTest = new ConnectionTest();
		Connection con = connectionTest.getConnection();
	}
}

