package com.upskill.java_6;

public class Multithreading {
/*Multi Threading is a Java feature that allows concurrent execution of two or more parts of a programme. 
 * Threads can be created by using two mechanisms :
 * 1. Extending the Thread Class
 * 2. Implementing the Runnable Interface
 * 
 * thread is a class. 
 */
	public static void main(String [] args){
		int n = 10;
		//to run multiplethreads we have to run forloop;
		for (int i= 0; i <n; i++){
			MultithreadingThread obj = new MultithreadingThread();
			obj.start();
			//you can say the first one is the fastest to execute all of those threads is not one after another. 
			//all of them start at the same time. they are running parallel.
			Thread obj2 = new Thread(new MultithreadingRunable());// because raunable is interface we have to call the interface through the thread class. 
			//
			obj2.start();
		}
}/*Mutlithreading is pretty much about multitasking. 
*Multi Threading is a Java feature that allows concurrent execution of two or more parts of a programme.
	 * we can achieve multithreading is by two ways:
	 * either by using thread class or by using runnable interface. if we are using the thread class we extend the thread class
	 * if we are using the runnable interface we are implementing them. 
	 * in multithreading java will executre multiple threads in parallel. when you print out it doesnt come out sequentially.   
	 * whatever executes first it will print out that. 
	 * 
	 * 
	*/
}