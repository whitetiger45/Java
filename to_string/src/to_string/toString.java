package to_string;

class frog{
	private int id;
	private String name;
	public frog(int id, String name){
		this.id = id;
		this.name = name;
	}
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(id).append(": ").append(name);
		return sb.toString();
//		return String.format("%4d: %s", id, name);
	}
}
public class toString {
	public static void main(String[] args) {
//		Object obj = new Object();
		frog f1 = new frog(7, "freddy");
		frog f2 = new frog(9, "mike");
		System.out.println(f1);
		System.out.println(f2);
//		obj.toString();
	}
}
