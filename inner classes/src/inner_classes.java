
public class inner_classes {
	public static void main(String[] args) {
		
		robot r1 = new robot(7);
		r1.start();
		
		robot.brain b1 = r1.new brain();//accessing the public class inside of robot
		b1.think();
		
		robot.battery batt = new robot.battery();
		batt.charge();
		
	}
}
