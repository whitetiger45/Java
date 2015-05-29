import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class linked_lists {
	public static void main(String[] args) {
		
		List<Integer> arraylist = new ArrayList<Integer>();
		List<Integer> linkedlist = new LinkedList<Integer>();
		
		doTimings("Array List ", arraylist);
		doTimings("Linked List ", linkedlist);
		
	}
	
	private static void doTimings(String type, List<Integer> list){
		
		for(int i = 0; i < 1E5; i++){
			list.add(i);
		}
	
		long start = System.currentTimeMillis();
//		array list is faster for add/remove items anywhere to the end
		for(int i = 0; i < 1E5; i++){
			list.add(i);
		}
//		linked list is faster for add/remove items anywhere but close to the end
//		for(int i = 0; i < 1E5; i++){
//			list.add(0, i);
//		}
//		
		
		
		long end = System.currentTimeMillis();
		
		System.out.println("Time taken: " + (end - start) + " ms for " + type);
	}
}


