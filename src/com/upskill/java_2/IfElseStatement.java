package com.upskill.java_2;

public class IfElseStatement {
//in the conditional statement we got if else and switch case. if we know the known data we use switch case. 
	public static void main(String[] args) {
		int age = 18;//only print out if your age is less than 13 to resolve this issue we put the else sateemtn
		//what is the main thing about coding? conditions if this happens do this thing
		if (age <13){//if (condition)
			System.out.println("You are children");
		}else if (age>=13 && age <=18){ // else if to add more conditions and && two logics
			System.out.println("You are teenager");
		}else if (age>=60){//nested if else
			if (age>=100){
				System.out.println("You are champion");
			} else {
			System.out.println("You are senior");
			}//Else if goes before else else is always at the last
		} else {
				System.out.println("You are adult");
			}
		}//These are called conditional statements
	}

//if else is used when we have a broader range of conditions. 
//switch case is used when data is open structure. ypou specifiy case by case. 

//two types of conditional statements that we can deveop :
//if else and switch case. 
// when we have limited data sources that time we use switch case. in switch case we can put a condition and go by case by case. 
//if else is more open cases. 
//if we have multiple open cases we can use operator or use else if. 
// also used nested if else. 
//in switch case we siwtch condition case 1 you break it case 2 you break it and case 3 you break it. 
