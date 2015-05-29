
public class abstract_example {
	
	public static void main(String[] args) {
		camera cam1 = new camera();
		
		cam1.setId(9);
		car auto1 = new car();
		auto1.setId(18);
		auto1.run();
//		machine m1 = new machine();//can"t do this because machine is an abstract class
	}
}
