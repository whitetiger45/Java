class frog{
	private String name;
	private int age;
	
	public void setName(String newName){
		name = newName;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setInfo(String name, int age){
		setName(name);
		setAge(age);
	}
}


public class setters {
	public static void main(String[] args) {
		frog f1= new frog();
		
		f1.setName("sarah");
		f1.setAge(21);
		
		frog f2 = new frog();
		f2.setInfo("jules", 57);
		
		System.out.println(f1.getName());
		System.out.println(f2.getName());
		System.out.println(f2.getAge());
	}
}
