
public class iterable {
	public static void main(String[] args) {
		
		
		urlLibrary urlLib = new urlLibrary();
		
		for(String html: urlLib){
			
			System.out.println(html.length());
		}
		
	}
}
