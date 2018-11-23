package org.cap.demo;

public class MainClass {

	public static void main(String[] args) {
		
		SalesApp obj=new SalesApp();
		obj.display();
		
		System.out.println("Hello! Good Afternoon");

		greetings();
	}
	
	public static void greetings() {
		System.out.println("Welcome to GIT!");
		System.out.println("Hi! Feeling Hungry!");
	}
	
	
	public void show() {
		System.out.println("Show method implementation.....");
	}

}
