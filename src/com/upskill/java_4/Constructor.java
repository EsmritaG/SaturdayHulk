package com.upskill.java_4;

public class Constructor {
	/* Constructor is instance of class, method same as class name, java will execute constructor first
	- 	Constructor cannot be static or override nor void or return type.
	- 	Default Constructor : No constructor is initialized
	- 	Parameterized Constructor : Add different signatures
	-	Constructor overloading : Different signatures
	 */
	//
	
	String studentName;
	int studentAge;
	
	public Constructor( String name){// created a variable in the constructor
		studentName = name;
	}
	public Constructor( int age){
		studentAge = age;
	}
	
	public Constructor( String name, int age){
		studentName = name;
		studentAge = age;
	}
	//when you modify the constructor the object get error. 
	// we can overload the object by overloading the constructor

	public static void main(String[] args) {
		Constructor obj = new Constructor("Esmrita");
		System.out.println(obj.studentName);

		Constructor obj2 = new Constructor (30);
		System.out.println(obj2.studentAge);
		
		Constructor obj3 = new Constructor ("Esmrita",30);
		System.out.println(obj3.studentName);
		System.out.println(obj3.studentAge);
		
		// one object of a class gives you string and additionalinstance of a class gives you age. 
	}// this is called constructor overloading. 

}
