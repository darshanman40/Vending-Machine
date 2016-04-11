package com.vendingmachine.BO;

public class Quarter extends Coin {
	
	static{
		faceValue = 25;
		coinName="Quarter";
	} 
	public int getFaceValue(){
		return faceValue;
	}

}
