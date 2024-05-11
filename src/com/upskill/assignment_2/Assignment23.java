package com.upskill.assignment_2;

public class Assignment23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a = getFirstNumber();
int b = getSecondNumber();
	
 if (a >b) {
	System.out.println(a + "is bigger than" + b);
}else if (b>a) {
	System.out.println(b+ "is bigger than" + a);
} else{
	System.out.println("Both numbers are equal");
}
	}
public static int getFirstNumber(){
	return 10;
}
public static int getSecondNumber(){
	return 20;
}
	}


