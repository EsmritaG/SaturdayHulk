package com.upskill.assignment_2;

public class Assignment25 {

	public static void main(String[] args) {
		InfiniteLoop();
		}
public static void InfiniteLoop(){
	int number = 8;
	System.out.println("Multiplication table of" + number + ":");
	for (int i= 1; i <=10; i++){
		System.out.println(number + " x " + i + " = " + (number*i));
	}
}
}


