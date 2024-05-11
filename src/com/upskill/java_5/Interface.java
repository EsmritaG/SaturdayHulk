package com.upskill.java_5;

public interface Interface {
//you can only have abstract method .it allows a speical type of method called abstract method.
	//the abstract method doesnt have any implementation. 
	//Java 8 and forward they have static method too.
	public abstract void iDoor();
	
	public abstract int iWheel();
	
	public abstract void iSeat();
	
	//public  String color(){ -- this is our regular method. 
		//return "red"; -- now we are converting this into a abstract method, we add abstract keyword and remove the implementation 
	//and we put a i - you can put abc anything but you put i as a naming convention i - interface
	
	public abstract String iColor();
	}
/*
 
    (Parent)				   (Keyword) 				      (Child)					 (Keyword) 					(GrandChild)
    						
	Class (0)no abstract method extends					  Class(0)		 
	Abstract Class (4)			extends					   Class (4-4)
	Interface 	(4)		  		implements				   Class (4-4)
	Interface (4)			 	extends					Interface (4+4)   			implements				  Class (8-8 = 0)
	Interface 		  		     implements			      Abstract Class(4-4=0)
	Abstract Class 		 		extends			          Interface   (4+4=8)		implements				   Class(8-8 = 0)	
	
	Interface to interface is usually implements but the extends is the correct answer.Regular class is inheritance. When it comes to the interface its more of the depth.
	Abstract method doesnt have any implementation. When you implement an interface java forces you to implement you those methods. But interface
	doesnt allow any regular methods. So 
	
	Interface to interface - its more depth. 
*/

	

