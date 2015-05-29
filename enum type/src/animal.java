
public enum animal {
	CAT, DOG, TURTLE;
	
	private String name;
	
	animal(){//constructor no need for variable
		
	}
	
	animal(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString(){
		return "This animal is called: " + name;
	}
}
