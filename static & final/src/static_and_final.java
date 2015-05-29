class thing{
	public final static int lucky_number = 7;//final is the same as const--must set equal to something
	public static int count = 0;
	public int id;
	public String name;
	public static String description;
	
	public thing(){
		id = count;
		count++;
	}
	public void showName(){
		System.out.println(name);
		System.out.println(description +": " + name);
	}
	
	public void showId(){
		System.out.println("Object Name: " + name + ", Object id: " + id);
	}
	
	public static void showInfo(){
		System.out.println("Hello");
		System.out.println(description);
	}
}
public class static_and_final {
	public static void main(String[] args) {
		
		System.out.println("count before objects created: "+ thing.count);
		thing t1 = new thing();
		thing t2 = new thing();
		System.out.println("counter after objects created: " + thing.count);
		thing.description = "I am a thing";
		thing.showInfo();
		t1.name = "bryan";
		t2.name = "Sarah";
		
		System.out.println(thing.description);
		System.out.println(t1.name);
		System.out.println(t2.name);
		t1.showName();
		System.out.println(Math.PI);
		System.out.println(thing.lucky_number);//const variable
		t1.showId();
		t2.showId();
	}
}
