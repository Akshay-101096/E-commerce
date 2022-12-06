package com.shoping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Admin {
			
			public void adminMenu() throws NumberFormatException, IOException, ClassNotFoundException, SQLException {
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
				while (true) {
				System.out.println("Press 1 to Check Registerd Users : ");
				System.out.println("Press 2 to Check Previous History  : ");
				System.out.println("Press 3 to Check Product Quantity : ");
				System.out.println("Press 4 to Logout : ");
				int b = Integer.parseInt(bufferedReader.readLine());
				
				if (b==1) {
					//Check User Details
					this.getUserDetails();
				}
				if(b==2) {
					//Check Previous Order History
					OrderHistory orderHistory = new OrderHistory();
					orderHistory.previousOrderHistory();
					
				}
				if(b==3) {
					//Check Product Quantity
					Product product = new Product();
					product.getQuantity();
				}
				if(b==4) {
					//Logout
					System.out.println("You are Successfully Logged Out..");
					break;
					
				}
				else {
					
					}
				}
			}
		
		public void getUserDetails() throws ClassNotFoundException, SQLException {
			
			// call the connection
			ConnectionTest connectionTest = new ConnectionTest();
			Connection con = connectionTest.getConnection();
			// create querry
			String s = "select Name,Username from user";
			// prepared statement
			PreparedStatement preparedStatement = con.prepareStatement(s);
			// resultset to get the data from database
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				System.out.println("Registered User Details..");
				System.out.println("-------------------------");
				System.out.println("Name : "+resultSet.getString(1));
				System.out.println("Username : "+resultSet.getString(2));
				System.out.println("-------------------------");
				
			}
			

			
		}
}

