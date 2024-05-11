package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {

	public static void main(String[] args){
		//Array stores multiple data using index When you put all the data in one bucket, its going to be hard to do the identfication.
		// we solve it using indexes
		int age = 25;     //Variable - stores only one value while array stores multiple value
		int[]ageHulk = new int[]{25,30,35,38,43,48};//Array
		//Array Index  [0],[1],[2],[3],[4],[5]
		//There is no limit. Special about array index is it starts from [0]. 
		System.out.println("Student Age : " + ageHulk[3]);
		System.out.println("Total Student:" +ageHulk.length);//how many members are there in your array.
		
		
		String[] nameHulk = new String[]{"Esmrita","Alan","Shajia","Sana","Saima"};//Array
		
		System.out.println("Student Name: " +nameHulk[0]);
		System.out.println("Total Student :" +nameHulk.length);
		
		//Multidimensional Array - nested array ) 
		
		int[][] ageHulk2D ={{25,30,35,38,43,28},  //[0][0] [0][1] [0][2] [0][3] [0][4] [0][5]
							{23,32,38,27}};       //[1][0] [1][1] [1][2] [1][3]
		
		System.out.println("Student Age 2D : " + ageHulk2D[0][3]);
		
		//Hashmap stores multiple data using key-value pair, Implementation of Map interface
		HashMap<String, Integer> Student = new HashMap<String, Integer>();// 
		Student.put ("Redwan",27);
		Student.put("Sana", 31);
		Student.put("Sanam", 38);
		Student.put("Muazzem", 24);
		
		System.out.println("HashMap Student Age : "+ Student.get("Sana"));
		
		HashMap<String, String> Country = new HashMap<String, String>();
		
		Country.put("UK", "London");
		Country.put("Nepal", "Kathmandu");
		Country.put("USA", "WashingtonDC");
		Country.put("Bangladesh", "Dhaka");
		Country.put("Germany", "Berlin");
		
		System.out.println("UK Capital :" + Country.get("UK"));
		
		
		//Hashset stores unordered collection containing unique value, Implementation of Set interface
		HashSet <String> Car = new HashSet <String>();
		Car.add ("Toyota");
		Car.add("BMW");
		Car.add("Audi");
		Car.add("Tesla");
		Car.add("Range Rover");
		System.out.println("Hashset value :" + Car);
		
		
		
		//HashTable is same like hashmap the only difference is its more organised.( No duplicate more synchronised)
		//store multiple data using key-pair value, No duplicate, also is synchornized (only on thread can be modified)
		
		Hashtable<String, String> Region = new Hashtable<String, String>();
		Region.put("UK", "London");
		Region.put("Nepal", "Kathmandu");
		Region.put("USA", "WashingtonDC");
	
		System.out.println("Region : " + Region.get("USA"));
		
		}
	}

