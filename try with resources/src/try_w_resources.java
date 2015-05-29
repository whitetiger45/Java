class temp implements AutoCloseable{

	public void close() throws Exception {
		System.out.println("Closing!");
		throw new Exception("oh no!"); 
	}
	
}

public class try_w_resources {
	public static void main(String[] args) {
		
		try(temp t1 = new temp())
		{
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
