package com.upskill.java_5;

public class InterfaceImplementation implements Interface {
//using interface you are forcing the creative people to follow your method
	@Override
	public void iDoor() {
		// TODO Auto-generated method stub
	System.out.println("My car has 4 doors");	
	}

	@Override
	public  int iWheel() {
		// TODO Auto-generated method stub
	System.out.println("My car has 4 wheels");
	return 4;	
	}

	@Override
	public void iSeat() {
		// TODO Auto-generated method stub
	System.out.println("My car has 4 seats");	
	}

	@Override
	public String iColor() {
		// TODO Auto-generated method stub
	System.out.println("My car is RED");
		return "RED";
	}

}
