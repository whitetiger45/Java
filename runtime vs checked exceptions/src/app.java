
public class app {
	public static void main(String[] args) {
//		Thread.sleep(111);//checked exception, must handle this
//		int value = 7; 
//		value = value/0;//runtime exception(arithmetic exception, trying to divide by 0)
		
//		String text = null;
//		System.out.println(text.length());//null pointer exception
		String[] texts = {"one", "two", "three"};
		
//		try{
//		System.out.println(texts[3]);//array index out of bounds exception (runtime exception)
//		}catch(Exception e){
//			System.out.println(e.toString());
//		}
		
		try{
			System.out.println(texts[3]);//array index out of bounds exception (runtime exception)
		}catch(ArrayIndexOutOfBoundsException e){
				System.out.println(e.toString());
		}
		
	}
}
