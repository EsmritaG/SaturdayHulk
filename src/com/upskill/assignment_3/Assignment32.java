package com.upskill.assignment_3;

public class Assignment32 {
static int count = 1;
Assignment32 (String name, int age, int salary, String address){
	System.out.println("Employee Number : "+ count);
	System.out.println("Employee Name : " + name);
	System.out.println("Employee Age : " + age);
	System.out.println("Employee Salary : "+ salary);
	System.out.println("Employee Address : "+ address);
	count++;
	System.out.println("");
}
	public static void main(String[] args) {
		Assignment32[]obj = new Assignment32[5];
				obj[0] = new Assignment32("Esmrita", 30, 135000,"Ridgefield Park");
				obj[1]= new Assignment32 ("Alan",31,150000,"California");
				obj[2] = new Assignment32("Ella",33,120000,"Augustines Close");
				obj[3]= new Assignment32("Amaya", 29,250000, "Ridgefield");
				obj[4]= new Assignment32 ("Sabhyata", 22,200000,"Jersey City");
	}

}
