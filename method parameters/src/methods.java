class robot{
	public void speak(String text){
		System.out.println(text);
	}
	
	public void jump(int x){
		System.out.println("Jumping " + x + " ft" );
	}
	
	public void move(String direction, double distance){
		System.out.println("Moving: " + direction + " for a total of: " + distance + "ft.");
	}
}
public class methods {
	public static void main(String[] args) {
	robot sam = new robot();
	
	sam.speak("Hi I'm Sam!");
	}
}
