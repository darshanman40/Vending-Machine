package com.vendingmachine.input;


import com.vendingmachine.BO.*;

public class ProductHandler {

	public static Product newProduct (String productName)
	{
		
		
			switch (productName){
			case "Cola":
				return new Cola();
			case "cola":
				return new Cola();
				
			case "Chips":
				return new Chips();
			case "chips":
				return new Chips();
			
			case "Candy":
				return new Candy();
			case "candy":
				return new Candy();
				
			
				
				default : return null ; 
				
			}
		
		
		}
}
