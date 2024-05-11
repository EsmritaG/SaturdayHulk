package com.upskill.java_2;

public class Loops {

	public static void main(String[] args) {
		/* TODO Auto-generated method stub
		 * loops– doing same thing again and again
Types of Loops: something that is going again and again
1. For Loop Do again and again unto upper limit
2.While Loop- Conditonal loop.  you put condition in while.eg. yo do this until you see this. 
3.Do While Loop- 
4.Infinite Loop

*/
		practiseForLoop(); 
		practiseWhileLoop();//conditional loop where you dont have the upper limit but have the condition. 
		practiseDoWhileLoop();
		practiseInfiniteLoop();
		practiseNestedForLoop();
		practiseForLoop();
		
	}
public static void practiseForLoop(){//For Loop - Do again and again unto upper limit
	int i;                           // Initialize the variable
	for(i=1; i<=500; i++){            //Setting lower limit,Upper Limit, Increment or Decrement
		System.out.println("For Loops number ="+ i);//Statement
	}
}
public static void practiseWhileLoop(){ //While Loop - Do again and again upto condition match
	int i =1;                                          //Initialize the variable
	while (i<=10){                                     //Setting condition
		System.out.println("While Loops number = "+ i);//Statement
		i++;                                           //Increment or Decrement
	}
}
public static void practiseDoWhileLoop (){                  //Do While Loop - Do action then match condition
	int i = 1;                                             //Initilize the variable
	do{
		System.out.println("Do While Loops number = " + i);//statement
		i++;                                               //Increment or decrement
	} while (i<=10);                                        //Checking condition
	}
//it confirms the first iteration even if the condition is 0. coz it iterates and then checks the condition.
//it does the action and then does checks the condition so the first iteration is always guaranteed.
public static void practiseInfiniteLoop (){ //Infinite Loop - never ending loop
	int i ;                                 //Initialise the variable
	for( i=1; ; i++){                       //Setting No Upper Limit
		System.out.println("Infinite Loops number = "+ i);//Statements
}
}
public static void practiseNestedForLoop(){  //Nested Loop - Loop inside another loop
	int i;									//Initilize i for loop 1
	int j; 									//Initilize j for loop 2
	for (i=1; i<=10;i++){ 					//first loop for i
		for (j=1; j<=10;j++){ 				//second loop for j
			int multiplicationTable = i*j;  // statement for loop 2
			System.out.print(multiplicationTable + " ");
		}//in a multiplication table, there are two number i and j two dimensions. first i increases and then j increases. 
		System.out.println(" ");
	}
	public static void practiseForEachLoop(){ 	//It is similar to forloop but 
		//This is for java vollection.	//For Each Loop - each loop through each element
		int[] ageHulk = new int[]{25,30,35,38,43,28}			//Initialise array
		for(int age: ageHulk){
			System.out.println("For Each Loops number =" + age);
			
		}
	}
}
}