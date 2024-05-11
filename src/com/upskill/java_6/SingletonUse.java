
package com.upskill.java_6;

public class SingletonUse {

	public static void main(String[] args) {
		//Singleton obj = new Singleton(); cant use the regular method to call the object,instead we use the get instance method.  
		Singleton obj= Singleton.getInstance();
		obj.demo();
		obj.demo2();
		obj.demo3();
	}
}
