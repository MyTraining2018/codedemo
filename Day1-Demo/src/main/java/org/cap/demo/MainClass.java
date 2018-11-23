package org.cap.demo;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("Hello! Good Afternoon");

		greetings();
		
		String[] names= {"tom","jack","ram"};
		for(String str:names)
			System.out.println(str);
		
		
	}
	
	public static void greetings() {
		System.out.println("Welcome to GIT!");
		System.out.println("Hi! Feeling Hungry!");
	}
	
	
	public void show() {
		System.out.println("Show method implementation.....");
	}

}
