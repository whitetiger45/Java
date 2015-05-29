import java.util.Scanner;


public class string_arrays {
	public static void main(String[] args) {
		
		
		Scanner input1 = new Scanner(System.in);
		System.out.println("How many words in your array: ");
		int x = input1.nextInt();
		
		
		String[] words = new String[x];
	
		Scanner input2 = new Scanner(System.in);
		Scanner input3 = new Scanner(System.in);
		int more;
		boolean endit = false;
		for(int i = 0; i < x; i++){
			System.out.println("Enter your word: ");
			words[i] = input2.nextLine();
			if(i != x-1){
				System.out.println("1 for more 0 for done: ");
				more = input3.nextInt();
				if(more == 0){
					endit= true;
					if(endit)
						break;
				}
			}

			
		}
		for(String word: words){
			System.out.print(word + " ");
		}
		
		
	}
}
