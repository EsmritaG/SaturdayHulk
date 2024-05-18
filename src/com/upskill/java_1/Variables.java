package com.upskill.java_1;

public class Variables {//stores data. it can be different types of data)
	
	public String country = "USA"; // class level variable true for the whole class its global variable
	public static String region = "North America";//now that its a static variable we dont need creating object
	// both of them are global but region is static while usa is normal. 
//Variables in Java
	//Instance or global Variable - Variables declared in Class level, outside method
	//Local variable - variables declared in method - true for that specific method. 
	//Static Variable - variables belong to class and doesn't require creating object to call it.
	//you declare as static so you dont have to create object
	//method parameter = variables used in method parameter
	
	//method parameter= variable using what you will pass the data outside of the method to the inside of the method
	public static void main(String[] args){
	   ct("Fairfield");
	   ny();
	   nj("Essex",5000 );//local variable
	   
	 Variables myObj = new Variables();//class name myobj = new classname
	System.out.println(myObj.country);
	System.out.println(region);
	
	}
public static void ny(){
	String city = "Queens";// local variable
	System.out.println(city);
}

public static void nj(String county, int population){
	String city = "RidgefieldPark";//local variable
	System.out.println(city);
	
	System.out.println(county);
	System.out.println(population);
}

public static void ct(String county){
	String city = "Hartford"; // local variable
	System.out.println(city);
	
	String myCounty = county;
	System.out.println(myCounty);
}

//Git change
public void git(){
	System.out.println("Git Branching");
	
}
}

