import java.util.ArrayList;


class machine {

	@Override
	public String toString() {
		return "I am a machine";
	}
	
	public void start(){
		System.out.println("Machine starting!");
	}
}

class camera extends machine{

	@Override
	public String toString() {
		return "I am a camera";
	}
	
	public void snap(){
		System.out.println("Snap!!!!");
	}
	
}

public class generics_and_wildcards {
	
	
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("one");
		list.add("nine");
		list.add("twenty-three");
		
		showList(list);
		
ArrayList<machine> list2 = new ArrayList<machine>();
		
		list2.add(new machine());
		list2.add(new machine());
		list2.add(new machine());

		showList2(list2);
		
ArrayList<camera> list3 = new ArrayList<camera>();
		
		list3.add(new camera());
		list3.add(new camera());
		list3.add(new camera());
		
		showList3(list3);
		
		showList4(list3);
		showList4(list2);
		
		showList5(list2);
		showList5(list3);
		
	}
	
	public static void showList(ArrayList<String> list){
		for(String value : list)
			System.out.println(value);
	}
	public static void showList2(ArrayList<machine> list){
		for(machine value : list)
			System.out.println(value);
	}
	//using the wildcard type (uses the ? & object type parameter specifier)
	//
	public static void showList3(ArrayList<?> list){
		for(Object value : list)
			System.out.println(value);
	}
	
	public static void showList4(ArrayList<? extends machine> list){//allows user to access machine methods
		for(machine value : list)
			System.out.println(value);
	}
	
	public static void showList5(ArrayList<? super camera> list){//allows user to access machine methods
		for(Object value : list)
			System.out.println(value);
	}
	
	
}
