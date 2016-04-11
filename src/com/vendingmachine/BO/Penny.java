package com.vendingmachine.BO;

public class Penny extends Coin {

	static{
		faceValue = 1;
		coinName="Penny";
	}
	
	public int getFaceValue(){
		return faceValue;
	}
}
