import java.util.ArrayList;
import java.util.List;


public class array_list {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		//Adding
		numbers.add(10);
		numbers.add(100);
		numbers.add(40);
		
		//retrieving
		System.out.println(numbers.get(0));
		
		System.out.println("Iteration #1: ");
		//indexed for loop
		for(int i = 0; i < numbers.size(); i++)
		{
			System.out.println(numbers.get(i));
		}
		
		
		System.out.println("\nIteration #2: ");
		for(Integer value: numbers){
			
			System.out.println(value);
		}
		
		//removing items from the end
		numbers.remove(numbers.size()-1);
		
		//removing items from the beginning is slow
		
		numbers.remove(0);
		
		System.out.println("\nIteration #3: ");
		for(Integer value: numbers){
			
			System.out.println(value);
			
		List<String> values = new ArrayList<String>();
		}
	}
};