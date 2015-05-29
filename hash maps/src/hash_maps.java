import java.util.HashMap;
import java.util.Map;


public class hash_maps {
	
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(5,  "five");
		map.put(45,  "fourty five");
		map.put(23,  "twenty");
		map.put(9,  "nine");
		map.put(18,  "eighteen");
		
		map.put(5, "Hello");//overwriting the previous key
		
		String text = map.get(45);
		System.out.println(text);
		
		System.out.println(1);//if calling a value not in the map, null is returned
		System.out.println(5);
		
		for (Map.Entry<Integer, String> entry: map.entrySet()){
				int key = entry.getKey();
				
				String value = entry.getValue();
				
				System.out.println(key + ": " + value);
		}
		
	}
}
