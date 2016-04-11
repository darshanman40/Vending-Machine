package com.vendingmachine.BO;

public class Dime extends Coin {

	static{
		faceValue = 10;
		coinName="Dime";
	}
	
	public int getFaceValue(){
		return faceValue;
	}
	
}
