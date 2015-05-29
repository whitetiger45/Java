
public class casting {
	public static void main(String[] args) {
		
		byte byteValue = 20;
		short shortValue = 55;
		int intValue = 888;
		long longValue = 23555;
		
		float floatValue = 8834.8f;//f for float
		float floatValue2  = (float)99.5;
		double doubleValue = 32.4;
		
		System.out.println(Byte.MAX_VALUE);
		
		System.out.println(intValue);
		
		intValue = (int)longValue;//(round parenthesis for type casting)
	
		System.out.println(intValue);
		
		doubleValue = intValue;
		
		System.out.println(doubleValue);
		
		intValue = (int)floatValue;//must cast here to go from float to int
		
		System.out.println(intValue);
		
		//the following wont work as we expect it to
		//128 is too big for a byte
		byteValue = (byte)128;
		System.out.println(byteValue);
	
	}
}
