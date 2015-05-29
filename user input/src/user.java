import java.util.Scanner;

public class user {
	public static void main(String[] args) {
		
		//create a scanner object
		Scanner input = new Scanner(System.in);
		
		//output the prompt
		System.out.println("What is your name: ");
		String line = input.nextLine();
		
		//output the user input
		System.out.println("Hello " + line);
		
		//output another prompt
		System.out.println("Enter the length of the side of your object: ");
		
		int x = input.nextInt();
		
		System.out.println("You entered: " + x);
		//area of square
		
		System.out.println("Area of a square with sides of length " + x + " is: " + x * x);
		
		//area of triangle
		
		System.out.println("Area of a triangle with sides of length " + x + " is: " + x*x*x);
		
	}

}
