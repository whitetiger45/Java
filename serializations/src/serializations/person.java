package serializations;

import java.io.Serializable;

public class person implements Serializable{//must include the implements Serializable to write and read
	/**
	 * 
	 */
	private static final long serialVersionUID = -6199094828522734964L;
//	private int id;
	private transient int id;//transient prevents things from being serialized
	private String name;
	
	private static int count;
	
	public person(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public static int getCount(){
		return count;
	}
	
	public static void setCount(int count){
		person.count = count;
	}
	
	public String toString(){
		return "Person [id=" + id + ", name= " + name + "] Count is: " + count;
	}
}
