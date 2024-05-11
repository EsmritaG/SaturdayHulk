package com.upskill.java_3;

import com.upskill.java_1.MethodType;

public class Inheritance extends MethodType{
	/* The process of obtaining the data members and methods from one class to another class is known as inheritance.
	 * we use the keyword extends to inherit the data and methods. 
	 * inherit  object and properties from the parent class. 
	- Single Inheritance 1 parent 1 child
	-Multiple Inheritance  multiple parent and one child
	Multilevel Inheritance grandparent class/parent class / child class - its mostly used. 
	( Java doesn't support Multiple Inheritance directly rather through Interfaces)

	*/
	public static void main(String[] args) {
		Inheritance obj = new Inheritance();
		obj.annualIncomeVoid();
		//obj.monthlyIncomeReturn()
		//obj.weeklyIncomeStatic();

	}

}
