import java.util.Scanner;


public class do_while {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Guess my number: ");
		int x = input.nextInt();
		
		while(x != 5){
			System.out.println("Try again: ");
			x = input.nextInt();
		}
		
		System.out.println("You guessed it correctly!");
		
		System.out.println("Guess my number: ");
		do{
			
			System.out.println("Your Guess: ");
			x = input.nextInt();
		}
		while(x != 7);
		System.out.println("You guessed it correctly again!");
	}
}
