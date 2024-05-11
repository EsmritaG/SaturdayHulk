package com.upskill.java_4;

import com.upskill.java_1.MethodType;

public class Polymorphism extends MethodType{
	/* Polymorphism is the ability of an object to take on many forms.
	 -Method Overloading ( Compile time Polymorphism/Static binding) Same method name with different signature to overload
	 -Method Overrriding ( Runtime Polymorphism / Dynamic binding) Same method name from Parent class to override
	 example yourself. you act as a student in class, wife to your husband, daughter to your parents. same object depending on different situdations
	 its acting differently. Depending on the situation, you have to implement the object in a different way. thats polymorphism. 
	 
	 */
	public static void main(String[] args) {
		Polymorphism obj = new Polymorphism ();
		obj.annualIncomeVoid();
	
car ("Red", 4 );
car ();
car("Red");
car("Red", 4 , 5);
	}
	//Method Overriding - Runtime Polymorphism - Dynamic binding
	//Same method name from Parent class to override
	
	public void annualIncomeVoid(){// we called it in the child class and modified more stuffs and run it. 
		int rentalIncome = 25000;
		int crypto = 20000;
		int business = 25000;
		int calculateAnnualIncome = hourlyIncome * 2000 + rentalIncome + crypto + business;
		System.out.println("My Annual Income = " + calculateAnnualIncome);
	}
 //Method Overloading - Compile time Polymorphism - Static binding
	//Same method name with different signature
	
	public static void car(){
		System.out.println("My car is Tesla");
	}
	public static void car(String color){
		System.out.println("My car is Tesla, Color is " + color);
	}
	public static void car(String color, int doors){
		System.out.println("My car is Tesla, Color is " + color +", it has doors "+ doors);
	}
	public static void car(String color, int doors, int seats){
		System.out.println("My car is Tesla, Color is " + color + ",it has doors "+ doors + " and has seats "+ seats);
	}
	
}
