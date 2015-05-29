class Machine{
	public void start(){
		System.out.println("Machine started!!");
	}
}

class Camera extends Machine{
	public void start(){
		System.out.println("Camera started!");
	}
	
	public void snap(){
		System.out.println("Photo taken!");
	}
}

public class up_and_down_casting {
	public static void main(String[] args) {
		Machine m1 = new Machine();
		Camera c1 = new Camera();
		
		m1.start();
		c1.start();
		c1.snap();
		
		//upcasting
		Machine m2 = c1;
		m2.start();
//		m2.snap(); //not allowed
		
		//downcasting
		Machine m3 = new Camera();
//		Camera c2 = m3; not allowed
		Camera c2 = (Camera)m3;//static casting is acceptable
		c2.snap();//this works because c2 was type/static casted
		
//		//doesnt work----runtime error
		Machine m4 = new Machine();
//		Camera c3 = (Camera)m4;
////		c3.start();
////		c3.snap();
		
		
	}
}
