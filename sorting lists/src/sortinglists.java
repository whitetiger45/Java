import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class person{
	private int id;
	private String name;
	
	public person(int id, String name){
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString(){
		return name;
	}
}

class ReverseAlphabeticalComparator implements Comparator<String>{

	public int compare(String s1, String s2){			
		return -s1.compareTo(s2);//the - sign returns the result in reversealphabetical order	
	}
}

class AlphabeticalComparator implements Comparator<String>{

	public int compare(String s1, String s2){
		
		int len1 = s1.length();
		int len2 = s2.length();
		
		if(len1 > len2){
			return 1;
		}
		else if (len1 < len2){
			return -1;
		}
		
		return 0;	
	}
	
}


public class sortinglists {
	public static void main(String[] args) {
		List<String> animals = new ArrayList<String>();
		
		animals.add("lion");
		animals.add("crane");
		animals.add("dragon");
		animals.add("tiger");
		animals.add("eagle");
		
		Collections.sort(animals, new AlphabeticalComparator());
		for(String animal: animals){
			System.out.println(animal);
		}
		
		Collections.sort(animals, new ReverseAlphabeticalComparator());
		for(String animal: animals){
			System.out.println(animal);
		}
		
		
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(9);
		numbers.add(18);
		numbers.add(99);
		numbers.add(27);
		numbers.add(45);
		
		Collections.sort(numbers);
		for(Integer number: numbers){
			System.out.println(number);
		}
		
		Collections.sort(numbers, new Comparator<Integer>(){
			public int compare(Integer num1, Integer num2){
				return -num1.compareTo(num2);//return the reverse sorted list
			}
		
		});
		
		List<person> people = new ArrayList<person>();
		people.add(new person(1, "Joe"));
		people.add(new person(23, "MJ"));
		people.add(new person(99, "Ronaldo"));
		people.add(new person(18, "Sarah"));
		
		for(person p1 : people){
			System.out.println(p1);
		}
		//sort in order of id
		Collections.sort(people, new Comparator<person>() {
			public int compare(person p1, person p2){
				
				if(p1.getId() > p2.getId())
					return 1;
				else if(p1.getId() < p2.getId())
					return -1;
				
				return 0;
			
			}
		});
		
		//sort in order of name
				Collections.sort(people, new Comparator<person>() {
					public int compare(person p1, person p2){
					return p1.getName().compareTo(p2.getName());					}
				});
				
				for(person p1: people){
					System.out.println(p1);
				}
	}
}
