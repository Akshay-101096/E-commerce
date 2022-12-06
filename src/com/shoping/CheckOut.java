package com.shoping;

import java.io.IOException;
import java.sql.SQLException;

public class CheckOut  {
	
	public void CheckOutDetails() throws NumberFormatException, ClassNotFoundException, IOException, SQLException {
				
				System.out.println("Checkout Page..");
				System.out.println("Confirm Your Order..");
				Cart cart = new Cart();
				cart.addToCart();
		
	}

}

