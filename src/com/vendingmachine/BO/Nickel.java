package com.vendingmachine.BO;

public class Nickel extends Coin{

	static{
		faceValue = 5;
		coinName="Nickel";
	} 
	
	public int getFaceValue(){
		return faceValue;
	}
}
