class machine {
	public void start(){
		System.out.println("Starting machine...");
	}
}

interface plant{
	public void grow();
}

public class anonymous_classes {

		public static void main(String[] args) {
			
			machine m1 = new machine (){
				@Override public void start(){
					System.out.println("Camera snapping...");
				}
			};
			
			m1.start();
			
			plant p1 = new plant(){
				
				public void grow(){
					System.out.println("plant growing...");
				}
			};
			
			p1.grow();
		}
}
