package serializations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class read_objects {
	
	public static void main(String[] args) {
		System.out.println("Reading objects.....");
//		try(FileInputStream fi = new FileInputStream("people.bin")){
		try(ObjectInputStream os = new ObjectInputStream(new FileInputStream("people.bin"))){
//			ObjectInputStream os = new ObjectInputStream(fi);
			
			
			person p1 = (person)os.readObject();//have to case this to the type of object that is being read
			person p2 = (person)os.readObject();
			
			person[] people = (person[])os.readObject();//initializing the read object for 
			@SuppressWarnings("unchecked")
			ArrayList<person> peopleList = (ArrayList<person>)os.readObject();
			
			
			System.out.println(p1);
			System.out.println(p2);
			
			for(person peeps: people){//reading out the array
				System.out.println(peeps);
			}
			
			for(person peeps: peopleList){//reading out the array
				System.out.println(peeps);
			}
			
			int num = os.readInt();
					
			for(int i = 0; i < num; i++){//reading out the array
				person peeps = (person)os.readObject();
				System.out.println(peeps);
			}
			
			os.close();
			
			
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		

				
				
		
	}
}
