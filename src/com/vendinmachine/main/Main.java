package com.vendinmachine.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.vendingmachine.BO.Coin;
import com.vendingmachine.BO.Dime;
import com.vendingmachine.BO.Nickel;
import com.vendingmachine.BO.Product;
import com.vendingmachine.BO.Quarter;
import com.vendingmachine.input.CoinHandler;
import com.vendingmachine.input.ProductHandler;

class Main{

public static void main (String[] args) 
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	boolean repeat= true;
	int totalFaceValue = 0 ;
	Product myProduct = null;
	int productValue = 0;
	
	System.out.println("Insert Coin") ;
	while(repeat){
	try{
		
		String inputa = br.readLine() ;
		Coin myCoin = CoinHandler.newCoin(inputa) ;
		if (!CoinHandler.validateCoin(myCoin))
			{
			  System.out.println("invalid coins");
			  continue;
			}
		
		totalFaceValue+= myCoin.getFaceValue();
		//System.out.println("total FV = "+totalFaceValue);
		
		
		
		
		//input products
		
		if(myProduct==null)
		{
			System.out.println("Select Product: ");
			String inputb = br.readLine() ;
			myProduct = ProductHandler.newProduct(inputb);
			
			if(myProduct == null)
			{
				System.out.println("Enter Valid Product");
				;
			}
			
			productValue = myProduct.getProductValue();
			
			
			if(totalFaceValue>=productValue)
			{
			
				repeat=remainingValueHandler(myProduct,totalFaceValue,productValue);
		
			}else{
				
				System.out.println ("EXACT CHANGE ONLY");
				continue;
				
			}
			
			
		}else{
			// 
			repeat =remainingValueHandler(myProduct,totalFaceValue,productValue);
			continue;
		}
		
		
	//repeat= false;
	}catch (Exception E)
	{
		
	}
	
	}
}

public static boolean remainingValueHandler(Product myProduct, int totalFaceValue, int productValue){
	if(totalFaceValue>=productValue)
	{
		int remainingValue = totalFaceValue - productValue ;
		int exactChange =0;
		Coin returnCoin =null;
		while(remainingValue > 0)
		{
			
			// check remaining value divide by 25 is 0 remainder
			if (remainingValue % 25 == 0)
			{
				exactChange =  remainingValue/25 ;
				returnCoin = new Quarter();
				
			}
			
			else if (remainingValue % 10 == 0)
			{
				exactChange = remainingValue/10 ; 
				returnCoin = new Dime();
			}
			
			else if (remainingValue % 5 == 0)
			{
				exactChange = remainingValue/5 ;
				returnCoin = new Nickel();
			}
			
			// check remaining value divided by 10 is 0 remainder
			// 
			// check remaining value divided by 5 is 0 remainder
			System.out.println( exactChange + " coins of " + returnCoin.getCoinName() + " returned" );
			totalFaceValue=0;
			break;
			
		}
		if(myProduct !=null)
		{
			System.out.println(myProduct.productName + " purchased successfully!");
		}
		else{
			System.out.println("Please retry the transaction");
			
		}
		return false;  
	
}else{
		System.out.println("EXACT CHANGE");
		return true;
	}

}
}