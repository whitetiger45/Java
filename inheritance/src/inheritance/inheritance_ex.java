package inheritance;

public class inheritance_ex {
	
	public static void main(String[] args) {
		machine m1 = new machine();
		
		m1.start();
		m1.stop();
		
		car c1 = new car();
		c1.start();
		c1.windShieldWhipe();
		c1.stop();
		
	}
}
