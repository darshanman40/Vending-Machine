package com.vendingmachine.input;

import com.vendingmachine.BO.Dime;
import com.vendingmachine.BO.Nickel;
import com.vendingmachine.BO.Penny;
import com.vendingmachine.BO.Quarter;
import com.vendingmachine.BO.Coin;

public class CoinHandler  {

	public static Coin newCoin(String in )
	{
		switch (in){
		case "1":
			return new Penny();
			
		case "5":
			return new Nickel();
		
		case "10":
			return new Dime();
		
		case "25":
			return new Quarter();
			
		
			
			default : return null ; 
			
		}
		
		
	}
	
	public static boolean validateCoin (Coin coin)
	{
		if (coin instanceof Nickel){
			return true;
		} else if (coin instanceof Dime){
			return true;
		}
		else if (coin instanceof Quarter){
			return true;
		}
		return false ; 
	}
	
	
}
