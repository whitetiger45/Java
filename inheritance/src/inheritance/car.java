package inheritance;

public class car extends machine {//need to have the "extends" keyword and the class it is a child of follow it
//	public void start(){
//		System.out.println("car started");
//	}
//	right click, source, override/implement methods 
	@Override
	public void start() {
		System.out.println("car started");
	}
	
	public void windShieldWhipe(){
		System.out.println("Whiping the windshield!");
	}
	
	public void showInfo(){
		System.out.println("Name: " + name);
	}


}
