package com.upskill.java_2;

public class SwitchCase {//if else is more broader and switch case is more specific condition)

	public static void main(String[] args) {
		int day = 9;
		switch(day){//switch why switch and why if else? if else is more open condition switch is more closed conditions. 
		    case 1:// switch case when delivering a specific set of data. Number of students is open case. eg so you use if else
		          System.out.println("Monday");// bank account if open case. switch case - days always 7. months - 12. 
		          break;//switch case is more used in healthcare industries as you are specific. 
		    case 2:
		    	  System.out.println("Tuesday");
		          break;
		    case 3:
		    	  System.out.println("Wednesday");
		          break;
		    case 4:
		    	  System.out.println("Thursday");
		          break;
		    case 5:
		    	  System.out.println("Friday");
		          break;
		    case 6:
		    	  System.out.println("Saturday");
		          break;
		    case 7:
		    	  System.out.println("Sunday");
		    default:
		    	System.out.println( "Please enter the right day!");
		  
		
		}
	}

}
