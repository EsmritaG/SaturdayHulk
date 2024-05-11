package com.upskill.java_4;

public class Encapsulation {

		// Encapsulation is used to hide the data using setter and getter method. 
	//Encapsulation is a concept of hiding the sensitive data using getter and setter method. 
	//its coming more from the java OOPS concept while encrypting is more from cybersecurity

	private String name = "upskill";  			//Write & Read (others can read and update it)by putting setter and getter method
	private int ssn = 4598764;					//Write only (so noone can see it ) so we put only the setter method
	private String username = "esmritag";		//Read only ( noone can change it they can only read it) we put only the getter method.
	
	//Setter Method - name			//set the data, Write
	public void setName(String value){
		name= value;
		//we use simple void method to set the data. whatever data we use in the parameter we are setting the data as the value.
	}
	
	//Getter Method - name   		//get the data, Read
	public String getName(){  			// must return some kind of data
		return name;
		//why do you even need the getter method? name is private so we wont be able to acess the data but the getter method is public. 
		//so we use the public getter method to get the private data. 
		
	//did you see your ssn in any application ? No. the reason is because ssn is write only. by law its protected. ssn is only setter method.
		//there is no way you can use getter method. 
		
	}
	//setter method = ssn 	set the data, write	The only thing you can do is write it but noway you can see it
	public void setSSN( int value){
		ssn = value;
	}
	
	//Getter Method - username // get the data, read
	public String getUserName(){
		return username;
	}
	
	public static void main(String[] args){
		Encapsulation obj = new Encapsulation();
		obj.setName("Muazzem601");
		System.out.println(obj.getName()); // we can print out ssn as there is not getter method in ssn
		
		obj.setSSN(99999);// there is no way i can get it
		System.out.println(obj.getUserName());//there is no way we can set it. 
	}
	
	
}



