package com.upskill.java_6;

public class MultithreadingThread extends Thread{
public void run(){
	//multiple thread means there is chances of excvptions. to handle that we will be using try catch. 
	try{
		System.out.println("Thread # " + Thread.currentThread().getId());// this way you know which thread is running
	}catch (Exception e){
		System.out.println("Exception is caught");
	}
}
}

