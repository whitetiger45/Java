package inheritance;

public class machine {
//	private String name = "Machine type 1";//only accessible in machine class
//	public String name = "Machine type 1";//
	protected String name = "Machine type 1";// accessible in machine class & machine class children
	
	public void start(){
		System.out.println("Machine started");
	}
	
	public void stop(){
		System.out.println("Machine stopped");
	}
}
