
public class robot {
	
	private int id;
	
	//declare a class within robot class (nested class)
	public class brain{//could also not make this public and it would not be accessible in the main function
		public void think(){
			System.out.println("Robot " + id + " is thinking...");
		}
		
	}
	
	static class battery{
		public void charge(){
			System.out.println("charging battery...");//static in a class can access static outer class members in the parent class
		}
	}
	
	public robot(int id) {
		this.id = id;
	}

	public void start(){
		System.out.println("starting robot "+ id);
		
		brain b1 = new brain();
		b1.think();
		
		final String name = "robert";
		
		class temp{
			public void doSomething(){
				System.out.println("ID is: " + id);
				System.out.println("My name is " + name);
			}
		}
			
		temp t1 = new temp();
		t1.doSomething();
	}
	
	
}
	


