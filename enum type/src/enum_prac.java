
public class enum_prac {
	
//	public static final int DOG = 0;
//	public static final int CAT = 1;
//	public static final int TURTLE = 2;
	
	public static void main(String[] args) {
		
//		int animal = CAT;
		animal a1 = animal.CAT;
		
		switch(a1){
			case CAT:
				System.out.println("Cat goes meow");
				break;
			case DOG:
				System.out.println("Dog goes woof");
				break;
			case TURTLE:
				System.out.println("Turtle is in it's shell");
				break;
			default:
				break;
		}
		
		System.out.println(animal.DOG);//string
		System.out.println(animal.DOG.getClass());
		
		System.out.println(animal.DOG instanceof animal);//true
		System.out.println(animal.DOG instanceof Enum);//true
	
		animal.DOG.setName("Jackson");
		System.out.println(animal.DOG.getName());//Jackson
		
		System.out.println("Enum name as a string: " + animal.DOG.name());//DOG
		
		animal a2 = animal.valueOf("DOG");//
		
		System.out.println(a2);//Jackson
	}

}
