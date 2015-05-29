import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;


class person implements Comparable<person>{
	private String name;
	
	public person(String name){
		this.name= name;
	}
	public String toString(){
		return name;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	public int compareTo(person p ){
		return name.compareTo(p.name);//add - in front of name to sort in reverse alphabetical order
		
		//to sort by string length
//		int len1 = name.length();
//		int len2 = p.name.length();
//		
//		if(len1 > len2)
//			return 1;
//		else if(len1 < len2)
//			return -1;
//		else
//			return name.compareTo(p.name);
	}
}

public class naturalOrder {
	public static void main(String[] args) {
		
		List<person> list = new ArrayList<person>();
		SortedSet<person> set = new TreeSet<person>();
		
		addElements(list);
//		Collection.sort(list);
		addElements(set);
		
		showElements(list);
		System.out.println("End of list, beginning of set");
		showElements(set);
	}
	
	private static void addElements(Collection<person> col){
		col.add(new person("James"));
		col.add(new person("Michael"));
		col.add(new person("Sarah"));
		col.add(new person("Lisa"));
		col.add(new person("Bryan"));
		
	}
	
	private static void showElements(Collection<person> col){
		for(person element: col){
			System.out.println(element);
		}
	}
}
