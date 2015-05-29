package serializations;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class write_objects {
	public static void main(String[] args) {
		System.out.println("Writing objects...");
		
		person mike = new person(23, "Mike");
		person james = new person(9, "James");
		person.setCount(88);
		person[] people = {new person(1, "roger"), new person(2, "bryan"), new person(3, "suzie")};//serializing an array	
		ArrayList<person> peopleList = new ArrayList<person>(Arrays.asList(people));
//		System.out.println(mike);
//		System.out.println(james);
		
		

//		try(FileOutputStream fs = new FileOutputStream("people.bin")){
//		
		try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("people.bin"))){
//			
//		ObjectOutputStream os = new ObjectOutputStream(fs);
		
		
		
		os.writeObject(mike);
		os.writeObject(james);
		os.writeObject(people);
		os.writeObject(peopleList);
		
		os.writeInt(peopleList.size());
		
		for(person peeps: peopleList){
			os.writeObject(peeps);
		}
				
		os.close();
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}
