package string_builder_and_formatting;

public class string_builder {
	public static void main(String[] args) {
//		/inefficent way to build a string
		String info = "";
		info+= "Hi my name is Bob";
		info+= " ";
		info+= ", and I am a builder";
		
//		efficient way to build a string
		
		StringBuilder sb = new StringBuilder("");
		sb.append("My name is Sarah");
		sb.append(", I am a string builder that is efficient");
		System.out.println(sb.toString());
		
		StringBuilder s = new StringBuilder();
		s.append("My name doesn't matter.")
		.append(" ")
		.append("I am a skydiver.");
		System.out.println(s.toString());
		
//		string formatting
		System.out.println("Here is some text.\tThat was a tab.\nThat was a newline.");
		System.out.printf("Total %d; quantity is %d\n", 5, 120);
		
		for(int i = 0; i < 20; i++){
			System.out.printf("%2d: print the line using a width of 2\n", i);//print the line using a width of 2
			System.out.printf("%-2d: print the line using a width of 2 and align numbers to the left\n", i);//print the line using a width of 2 and align numbers to the left
			System.out.printf("%2d: %s\n", i, "Print the string");
			System.out.printf("Total value: %.2f\n", 5.67828393);//floating point
			System.out.printf("Total value: %5.3f\n", 5.67828393);//floating point
			System.out.printf("Total value: %6.3f\n", 6.67828393);//floating point
			System.out.printf("Total value: %6.3f\n", -6.67828393);//floating point
			
		}
	}
}
