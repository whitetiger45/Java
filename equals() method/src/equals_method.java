class person{
	private int id;
	private String name;
	
	public person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		person other = (person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}

public class equals_method {
	public static void main(String[] args) {
		
		person p1 = new person(23, "bryan");
//		person p2 = new person(9, "sarah");
		person p2 = new person(23, "bryan");
		
//		p2 = p1;
//		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		
		Double v1 = 7.2;
		Double v2 = 7.2;
		
		int n1 = 6;
		int n2 = 6;
		System.out.println(v1.equals(v2));//true
		System.out.println(v1 == v2);//false
		System.out.println(n1 == n2);//true
		
		String t1 = "hello";
//		String t2 = "hello";//true
		String t2 = "hello".substring(0, 5);
		
//		System.out.println(t1 == t2);//true
		
		System.out.println(t2);//hello
		System.out.println(t1.equals(t2));
	}
}
