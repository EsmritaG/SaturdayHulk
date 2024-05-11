package com.upskill.java_1;

public class MethodType {// inside class there can be many methods. to group in the codes you use methods. 
	
	/* Types of Methods - method is some snippet of codes. 
	1. Void Method- its void or empty space so you dont have to return anything.
	2.Static Method- In static method,  you make the method static and in the static method you dont call it by creating object
	                      // you can call it directly.
	                       *  static keyword and dont need to create object to call it.
	3. Return Type Method

	*/
	public static int hourlyIncome = 65;
	static public void main(String[] args) {
			MethodType myObj = new MethodType();
			myObj.annualIncomeVoid();
			
			
//System.out.println("My Monthly Income = " + myObj.monthlyIncomeReturn());
//System.out.println("I live in "+ myObj.state());

	}
	//any method with void keyword is called void method. void is an empty space. inside the space we can write some line of code. 
	//
public void annualIncomeVoid(){
	int calculateAnnualIncome = hourlyIncome * 2000;
	System.out.println("My Annual Income = " + calculateAnnualIncome);
	//System.out.println(" My birth month is " + birthMonth ("April"));
	//weeklyIncomeStatic();
	rain();
}
//return type of method- no matter what you do , you have to return some data which tyoe of data are you returning you have to specify
//public int monthlyIncomeReturn(){
	//int calculateMonthlyIncome = hourlyIncome * 180;
	//return calculateMonthlyIncome;
//}

//public static String birthMonth (String month){
	//return month;
	
//}
//public String state(){
	//return "NJ";
//}
//static method
//public static void weeklyIncomeStatic(){
	//int calculateWeeklyIncome = hourlyIncome *40;
	//System.out.println("My weekly Income = " + calculateWeeklyIncome);
//}

public static boolean rain(){//In static method,  you make the method static and in the static method you dont call it by creating object
	                      // you can call it directly. 
	return false;

}

}

