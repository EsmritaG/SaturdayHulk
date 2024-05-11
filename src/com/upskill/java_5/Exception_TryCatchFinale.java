package com.upskill.java_5;

import com.upskill.java_6.myException;

public class Exception_TryCatchFinale {
	/* Java Exceptions - Use "try - catch - finally" if you do some logical error java will throw you some exception. 
	 * 
		A. Built-in Exceptions - Built-in exception throws by java which explain certain error situations. There are more but most common.
			 1. ArithmeticException - error has occurred in an arithmetic operation._ something is maths
			 2. ArrayIndexOutOfBoundsException -  an array has been accessed with an illegal index.- we did the example down we dont have the right index
			 3. ClassNotFoundException - try to access a class whose definition is not found
			 4. FileNotFoundException - a file is not accessible or does not open.
			 5. IOException - input-output operation failed or interrupted -- 
			 6. InterruptedException  - thread is waiting, sleeping, or doing some processing, and it is interrupted.
			 7. NoSuchFieldException - class does not contain the field or variable specified
			 8. NoSuchMethodException - accessing a method which is not found
			 9. NullPointerException - referring to the members of a null object-- when your object is null
			 10. NumberFormatException  -  a method could not convert a string into a numeric format
			 11. RuntimeException - any exception which occurs during runtime.
			 12. StringIndexOutOfBoundsException -  String class methods to indicate that an index is either negative or greater than the size of the string
		
		B. User-Defined Exceptions - User can also create exception where the error situations is not covered by java
	*/
	public static void main (String[] args) throws myException {
		//Built-in Exceptions = ArrayIndexOutOfBoundsException
		try{
		int [] ageHulk = new int[]{30,28,27,26,30};
		System.out.println("Student age = " + ageHulk[8]);
		}
		catch (Exception e){// exception e is method parameter we are storing in the variable e
			e.printStackTrace();
		}
		System.out.println("Array Method Completed");
		//exception is good and bad. exception tells you what kind of problem do you have that way you can resolve it. 
		//the bad part is it stops execution. so inorder for the execution to go on we are going to catch the exception.
		//we are going to handle the exception by using try catch and finally block.  there are two types of exception in java
		//built-in( defined by java) and user defined.Java has 100 of exceptions you are going to have more issues when you dont have right exceptions.
		//you put try catch when you are doing transactional code when you have multiple try catch then you have finally. 
		/*two types of exceptions: Built-in and User defined 
		 * in built in you have exceptions like arithmentic exception- when you do some arithmetic operations and you end up geting logical error 
		 * you get the arithmetic exceptions
		 * in array if you have 4 memeers and you try to find 
		 * classnotfound- whatever class you are trying to access is not there and you are getting this exception
		 * IO- something wrong with the input output
		 * Interruptedexception if you are dealing with threads. 
		 * nosuchfield exception- the filed you are trying to access is not there etc
		 */
		//
//specific Built in Exceptions - NumberFortmatException
	try{
	int num = Integer.parseInt("five");
	System.out.println(num);
	}
	catch (NumberFormatException e){
		e.printStackTrace();
	System.out.println("Parsed Int from String complete");
	}
	//User-Defined Exceptions
	try{ 
		throw new myException ("Test");
	}	catch (myException e){
		e.printStackTrace();
	System.out.println("This is User-Defined Exceptions Method!");
	}
	
	
	
	
	finally {
		System.out.println(" Test Completed");
	}
}
}//how do you handle exception in Java-- we hanlde it using the try, catch and finally block. 
	
