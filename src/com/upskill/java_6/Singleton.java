package com.upskill.java_6;

public class Singleton {
//Singleton is class that have only one object
	//Singleton is the idea of one class one object. In order to achive singleton we do two things:  
	
	/*we start with making constructor private and making the object static and private
	 Then we initialise a get.instance method. what the getter method does it gets 
	 * the data. and we return the singleton object. inside the get instance method we do return the object. The only way to access
	 * to this class is using the get.isntance method. so whenwe  achieve singletonees one advantage is we can arrange things more organised.
	 * 
	 * 
	 */
	private Singleton(){
}////Private constructor, it prevents any other class from instantiating
//private static object of the class
	private static Singleton singletonObj = new Singleton();
	
	public static Singleton getInstance(){
		return singletonObj;
	}
	
	protected static void demo(){
		System.out.println("Demo method for singleton class");
	}
	
	protected static void demo2(){
		System.out.println("Demo 2 method for singleon class");
	}
	
	protected static void demo3(){
		System.out.println("Demo 3 method for singleton class");
	}
}