package interfaces;

//import inheritance.Info;

public class machine implements Info{
	private int id = 7;
	
	
	public void start(){
		System.out.println("Machine started!");
	}

	public void showInfo() {
		System.out.println("Machine Id is: " + id);
		
	}
}
