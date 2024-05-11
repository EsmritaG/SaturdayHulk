package com.upskill.assignment_1;

public class assignment1 {

	public static void main(String[] args) {
		trianglePerimeter ();
		rectangularPerimeter();
		multiplyfunction();
	
		
		int a= 9;
		int b = 11;
		int c= multiplyfunction();
		System.out.println(a+b+c);

	}
	
	public static void trianglePerimeter() {
		int a = 5;
		int b = 7;
		int c = 11;
		int perimeter = a+b+c;
		System.out.println("The Perimeter of Triangle with arms 5,7,11 is" + perimeter);
	}
	
	public static void rectangularPerimeter() {
		int w = 9;
		int l = 13;
		int p = 2*(w+l);
		System.out.println("The Perimeter of Rectangle with width 9inches and length 13inches is" +  p);
		
		
		}
	
		public static int multiplyfunction() {
			int a= 9;
			int b= 11;
			int c= a*b;
			return c;
			
			
		}
		
		
		
		
	 }


