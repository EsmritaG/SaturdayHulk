package com.upskill.assignment_2;

public class assignment28 {

	public static void main(String[] args) {
		myMethod();
	}
public static void myMethod(){
	int n= 7;
	int result = 1;
	for (int i = 1; i<=n; i++){
		result = result * i;
	}
	System.out.println("The factorial of 7 is " + result);
}
}
