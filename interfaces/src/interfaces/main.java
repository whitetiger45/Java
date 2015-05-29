package interfaces;

public class main {
	 public static void main(String[] args) {
		machine m1 = new machine();
		m1.start();
		m1.showInfo();
		
		person p1 = new person("Rachel");
		p1.greet();
		p1.showInfo();
		
		Info info1 = new machine();
		info1.showInfo();
		
		Info info2 = p1; //pointing new info object at the person object
		info2.showInfo();
		
		outputInfo(m1);
		outputInfo(p1);
		
		
	}
	
	 private static void outputInfo(Info info){//this is a method/function in java
		 info.showInfo();
	}
}
