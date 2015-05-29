package interfaces;

public class person implements Info{
	private String name;
	
	public person(String name) {
		this.name = name;
	}


	public void greet(){
		System.out.println("Hello There!");
	}

	public void showInfo() {
		System.out.println("Person's name is: " + name);
		// TODO Auto-generated method stub
		
	}
}
