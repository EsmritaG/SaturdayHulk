package com.upskill.java_3;

import java.util.HashMap;

public class SyedBhaiClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int[] dice = {1,2,3,4,5,6};
        String[]letterDice = {"one","two","three","four","five","six"};
        
        System.out.println(dice[2]);
        System.out.println(letterDice[3]);
        letterDice[0]= "zero";
        System.out.println(letterDice[0]);
        
        System.out.println(dice.length);
        
        for(int i= 0; i<letterDice.length; i++){
        	System.out.println(letterDice[i]);
        }
        for(String nameofface:letterDice) {
        	System.out.println(nameofface);
        }
        //int[][][]threedimension= {{4,3,2,1},{1,2,3,4},{5,6,7,8};
        int[][]twodimension = {{1,2,3,4},{5,6,7}};
        System.out.println(twodimension[1][1]);
        System.out.println(twodimension[0][3]);
        
        HashMap<String, String> capitalOfCountries = new HashMap<String,String>();//creating the key and values
        capitalOfCountries.put("Bangladesh","Dhaka");
        capitalOfCountries.put("India","New Delhi");
        capitalOfCountries.put("Pakistan", "Islamabad");
        capitalOfCountries.put("USA", "DC");
        
        System.out.println(capitalOfCountries.get("India"));//capitalOfCountries.get(key)
      
       //capitalOfCountries.remove("USA");
       //System.out.println(capitalOfCountries);
       //capitalOfCountries.clear();
       //System.out.println(capitalOfCountries);
        
       System.out.println(capitalOfCountries.size());
       
       //print keys
       for (String i: capitalOfCountries.keySet()){
    	   System.out.println(i);
       }   
    	   //print values 
     for (String j : capitalOfCountries.values()){
      System.out.println(j);
       
       }
 HashMap<String, Integer>populationOfCountries = new HashMap<String, Integer>();
 populationOfCountries.put("Bangladesh",100000);
 populationOfCountries.put("India", 200000);
 populationOfCountries.put("Nepal", 30000000);
 populationOfCountries.put("USA", 100000000);
 
 for(String country:populationOfCountries.keySet()){
	 System.out.println(country);
 }
 for(int  pop:populationOfCountries.values()){
	 System.out.println(pop);
 }
 
 HashMap<Integer, String>students = new HashMap<Integer, String>();
 students.put(1, "Esmrita");
 students.put(2, "Alan");
 students.put(3, "Saima");
 students.put(4, "Lopsang");
 
 for(int roll:students.keySet()){
	 System.out.println(roll);
 }
 for(String name:students.values()){
	 System.out.println(name);
 }
	}
}
        
	


