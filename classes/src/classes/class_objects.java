package classes;

import java.util.Scanner;

class Person{
	
	int age;
	String name;
	void speak(){
		System.out.print("Hello " + name);
	}
	
	 int calculateYearsToRetirement(){
		 int yearLeft = 65 - age;
		 
//		 System.out.println(yearLeft);
		 return yearLeft;
	 }
	 
	 int getAge(){
		 return age;
	 }
	 String getName(){
		 return name;
	 }
}

public class class_objects {
	public static void main(String[] args) {
		Person a = new Person();
		
		Scanner iname = new Scanner(System.in);
		Scanner iage = new Scanner(System.in);
		
		System.out.println("What is your name: ");
		
		a.name = iname.nextLine();
		System.out.println("What is your age: ");
		
		a.age = iage.nextInt(); 
//		
		System.out.println("Name: " + a.getName() + "\nAge: " + a.getAge());
		a.speak();
		System.out.print(", you have " + a.calculateYearsToRetirement() + " years until retirement!");
	}
}
