package sets;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;


 class person{
	
	private int id;
	private String name;
	
	
	public person(int id, String name){
		this.name = name;
		this.id = id;
	}
	public String toString(){
		return id + ": " + name;
	}
	
	//if you want to use your own custom objects in set, must implement hashcode & equals method so there will not be an issue with duplicates
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		person other = (person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
	
}
public class sets {
	public static void main(String[] args) {
		
//		Set<String> set1 = new HashSet<String>();
		
		//hash set doesnt retain order
//		Set<String> set1 = new LinkedHashSet<String>();//does retain order
		
		Set<String> set1 = new TreeSet<String>();//sorts in order
		
		
		if(set1.isEmpty()){
			System.out.println("Set is Empty at start");
		}
		
		set1.add("Crane");
		set1.add("Lion");
		set1.add("Tiger");
		set1.add("Dragon");
		
		//adding duplicate items does nothing
		set1.add("Lion");
		System.out.println(set1);
		
		
		for(String element: set1){
			System.out.println(element);
			
		}
		
		
		//does set contain a particular item?
		
		if(set1.contains("dog")){
			System.out.println("Contains dog");
		}
		
		if(set1.contains("Lion")){
			System.out.println("Contains Lion");
		}
		
//////////////////////////////////////////////////////////////////////
		
Set<String> set2 = new TreeSet<String>();//sorts in order
		
			
		set2.add("Crane");
		set2.add("Lion");
		set2.add("Tiger");
		set2.add("Dragon");
		
		//adding duplicate items does nothing
		set2.add("Lion");
		System.out.println(set2);
		
		
		for(String element: set2){
			System.out.println(element);
			
		}
		//intersetion
		Set<String> intersection= new HashSet<String>(set1);//this makes intersection a copy of set1
		System.out.println(intersection);
		
		intersection.retainAll(set2);//find out which items are in both set 1 and set 2
		
		Set<String> difference = new HashSet<String>(set1);
		
		difference.removeAll(set2);//remove items that are different
		System.out.println(difference);
		
	////////////////////////////////////////////
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		
		for(String key : map.keySet()){
			System.out.println(key + ": " + map.get(key));
		}
		
		Set<String> set = new LinkedHashSet<String>();
		set.add("hippo");
		set.add("wolf");
		set.add("sheep");
		set.add("giraffe");
		
		System.out.println(set);
		
		person p1 = new person(0, "bryan");
		person p2 = new person(99, "sarah");
		person p3 = new person(1, "julie");
		person p4 = new person(1, "felix");
		
		
		Map<person, Integer> map2 = new HashMap<person, Integer>();
		map2.put(p1, 1);
		map2.put(p2, 2);
		map2.put(p3, 3);
		
		for(person key : map2.keySet()){
			System.out.println(key + ": " + map2.get(key));
		}
		
		Set<person> set3 = new LinkedHashSet<person>();
		set3.add(p1);
		set3.add(p2);
		set3.add(p3);
		set3.add(p4);
		
		System.out.println(set3);
	}
}
