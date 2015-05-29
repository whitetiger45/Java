import java.util.Iterator;
import java.util.LinkedList;


public class iterators {
	public static void main(String[] args) {
		
		LinkedList<String> animals = new LinkedList<String>();
		
		
		animals.add("Lion");
		animals.add("Dragon");
		animals.add("Crane");
		animals.add("Tiger");
		
		
		Iterator<String> it = animals.iterator();
		
		
		while(it.hasNext()){
			String a = it.next();
			System.out.println(a);
			
			if(a.equals("Crane")){
				it.remove();
			}
		}
		System.out.println();
		
		//modern iteration
		for(String animal: animals){
			System.out.println(animal);
//			animals.remove(3);
		}
			
			
	}
}
