
public class recursion {
	public static void main(String[] args) {
//		System.out.println("Hello");
		
		//i.e. 4! = 4*3*2*1
		int value = 6;
		System.out.println(factorial(value));
		
//		System.out.println(value);
	}
	
	private static int factorial(int value){
		System.out.println(value);
		
		if(value == 1)
			return 1;
		
		return factorial(value-1) * value;
	}
}
