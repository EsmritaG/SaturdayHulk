package com.upskill.java_5;

public abstract class AbstractClass {
//There are three types of class; Regular, abstractclass and interface.
	//regular class can only have regular method, astact class can have both regular method and abstract method.
	//interface can only have abstract method. 
	//abstract method- is the method where you dont have any implementations. 
	//its only an initialisation  it doesnt have any value. 
	//abstraction - hiding implementation. we can initialise a method without any implementation. and then when we call it in child class
	// in the child class we implement them. this type of method is called the abstract method.Abstract method is only an initialisation
	//it doesnt have any value. 
	//you have to add an additonal keyword abstract
	//once you put the abstract keyword it doesnt need any implementation. 
	//In the interface we implement them with the implement keyword. but if its a abstract class we use the extend keyword. 
	//once you initialise it someone has to implement it. 
	public void car(){
		System.out.println("My car is Tesla");
	}
	public abstract void iDoor();
	
    public abstract void iWheel();
	
	public abstract void iSeat();
}
