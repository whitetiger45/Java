import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class sorted_maps {
	public static void main(String[] args) {
		Map<Integer, String> hashmap = new HashMap<Integer, String>();
		
		Map<Integer, String> linkedhashmap = new LinkedHashMap<Integer, String>();
	
		Map<Integer, String> treemap = new TreeMap<Integer, String>();
		
		System.out.println("Begin of Hashmap");//no particular order of the keys
		testMap(hashmap);
		System.out.println("End of HashMap");
		
		System.out.println("Begin of linkedhashmap");//keeps the keys in order
		testMap(linkedhashmap);
		System.out.println("End of linkedhashmap");
		
		System.out.println("Begin of treemap");//keys also in order
		testMap(treemap);
		System.out.println("End of treeMap");
		
		
		
	
	}
	
	public static void testMap(Map<Integer, String> map){
		map.put(9, "tiger");
		map.put(45, "lion");
		map.put(18, "bear");
		map.put(99, "dragon");
		map.put(81, "panda");
		
		for(Integer key: map.keySet()){
			String value= map.get(key);
			System.out.println(key + ": " + value);
		}
		
		
	}
	
}
