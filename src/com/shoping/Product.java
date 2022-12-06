package com.shoping;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class Product {
	

	public void productInfo() throws ClassNotFoundException, SQLException {

		// call the connection
		ConnectionTest connectionTest = new ConnectionTest();
		Connection con = connectionTest.getConnection();
		// create querry
		String s = "select * from product";
		// prepared statement
		PreparedStatement preparedStatement = con.prepareStatement(s);
		// resultset to get the data from database
		ResultSet resultSet = preparedStatement.executeQuery();

		while (resultSet.next()) {

			System.out.println("Product Details");
			System.out.println("ProductID : " + resultSet.getString(1));
			System.out.println("ProductName : " + resultSet.getString(2));
			System.out.println("Quantity : " + resultSet.getString(3));
			System.out.println("ProductDetails : " + resultSet.getString(4));
			System.out.println("ProductPrice :" +resultSet.getString(5));
			System.out.println("------------------------------------");

		}
		con.close();

	}
	
	public void getQuantity() throws ClassNotFoundException, SQLException {
						Scanner scan = new Scanner(System.in);
						System.out.println("------------------------");
						System.out.println("Check Product Quantity..");
						System.out.println("Enter Product ID : ");
						String ID = scan.next();
				// call the connection
				ConnectionTest connectionTest = new ConnectionTest();
				Connection con = connectionTest.getConnection();
				// create querry
				String s = "select ID,Name,Quantity from product where ID =?";
				// prepared statement
				PreparedStatement preparedStatement = con.prepareStatement(s);
				preparedStatement.setString(1, ID);
				// resultset to get the data from database
				ResultSet resultSet = preparedStatement.executeQuery();
				while (resultSet.next()) {

					System.out.println("Product Details");
					System.out.println("ProductID : " + resultSet.getString(1));
					System.out.println("ProductName : " + resultSet.getString(2));
					System.out.println("Quantity : " + resultSet.getString(3));
					System.out.println("------------------------------------");

				}
				con.close();
	}

}

