package arrays;

import java.util.Scanner;

public class arrays {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many names in your vector: ");
		int x = input.nextInt();
		
		String[] values;
		values = new String[x];
		
		Scanner input2 = new Scanner(System.in);
		//System.out.println("Enter a value for m: ");
		int more;
		Scanner input3 = new Scanner(System.in);
		for(int i = 0; i < x; i++){
			System.out.println("Enter a name: ");
			values[i]= input2.nextLine();
			if(i != x-1){
				System.out.println("1 for more 0 for done: ");
				more = input3.nextInt();
				if(more == 0)
					break;
			}
			
			
		}

		for(int i = 0; i < values.length; i++){
			System.out.println((i + 1) + ": "+ values[i]);
		}
	}
}
