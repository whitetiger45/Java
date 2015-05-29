package generics;

import java.util.ArrayList;
import java.util.HashMap;

class animal{
	
}

public class arrayLists {
	public static void main(String[] args) {
		//before java 5
		ArrayList list = new ArrayList();
		
		list.add("apple");
		list.add("banana");
		list.add("orange");
		
		String fruit = (String)list.get(0);//must downcast the list value to a string if I want to print the current values in the list
		
		System.out.println(fruit);
		
		//modern style
		
		ArrayList<String> strings = new ArrayList<String>();
		
		strings.add("cat");
		strings.add("lion");
		strings.add("wolf");
		
		String animal = strings.get(1);
		
		System.out.println(animal);
		
		for(String a : strings)//for each loop perfect for generics
			System.out.println(a);
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
	
		//java 7 style
		ArrayList<animal> someList = new ArrayList<>();
	}
}
