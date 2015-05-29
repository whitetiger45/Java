package constructors;
class machine{
	private String name;
	private int code;
	public machine(){
//		calling another constructor below must be the first line
//		this("James", 9);
		System.out.println("Constructor running");
		name= "James";

	}
	
	public machine(String name){
		System.out.println("Second constructor running");
		this.name = name;
		System.out.println(name);
	}
	
	public machine(String name, int code){
		System.out.println("Third constructor running");
		this.name = name;
		this.code = code;
		System.out.println("name: "+ name +"\ncode: "+ code);
	}
}

public class constructors_practice {
	public static void main(String[] args) {
		machine m1 = new machine();
		new machine();
		
		machine m2 = new machine("James Bond");
		machine m3 = new machine("arnie", 7);
	}
}
