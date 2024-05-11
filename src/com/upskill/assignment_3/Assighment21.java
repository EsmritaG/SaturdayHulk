package com.upskill.assignment_3;

import java.util.Scanner;

public class Assighment21 {
	String accname;
	float amount;
	boolean bool;
	Scanner s = new Scanner (System.in);

	Assighment21(String accname){
		this.accname = accname;
		System.out.println("Account name : " + this.amount);
		System.out.println("Please Enter the Initial amount for this " + accname + "account");
		this.amount = s.nextFloat();
		if (this.amount <= 0){
			bool= false;
		
		}else {
			System.out.println("Initial amount: "+ this.amount);
			bool = true;
		}
		while (bool == false) {
			System.out.println("Invalid amount ! Try again..");
		System.out.println( "Please enter the initial amount for this" + accname + "account: ");
		this.amount = s.nextFloat();
		if(this.amount> 0){
			System.out.println("Initial amount : " + this.amount);
			bool = true;
		}
		}
	}
	 void deposit (float amount) {
		 this.amount = this.amount + amount;
		 System.out.println( "New amount after deposit :" + this.amount);
		
	}
	 void withdraw (float amount) {
		 if(this.amount< amount){
			 System.out.println("Insufficient Balance");
			
		 }else {
			 this.amount = this.amount - amount;
			 System.out.println("new amount after withdrawal : "+ this.amount);
		 }
	 }
public static void main(String[] args){
	Savings s = new Savings();
	s.deposit(5000);
	Checking c = new Checking();
	c.deposit(6000);
	c.withdraw(3000);
}
}
class Savings extends Assighment21 {
	Savings() {
		super ("Savings");
	}
}
class  Checking extends Assighment21 {
	Checking() {
		super ("Checking");
		
	}
}