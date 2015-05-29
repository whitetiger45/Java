import java.io.File;//ctrl + shft + o
import java.io.FileNotFoundException;
import java.util.Scanner;


public class using_scanner {
	public static void main(String[] args) throws FileNotFoundException {
		
		String fileName = "C:/Users/TheIronLion/Desktop/example.txt";
		
		File textFile = new File(fileName);
		
		Scanner in = new Scanner(textFile);
		
		int val = in.nextInt();
		in.nextLine();
		int count = 2;
		System.out.println("Value is " + val);
		while(in.hasNextLine()){
			String line = in.nextLine();
			System.out.println(count + ": " + line);
			count++;
		}
		
		String file2 = "C:/Users/TheIronLion/Desktop/School/CS I/Helpful Class Files/Input Output Array Example/Input Output Array Example/ten.txt";
		
		File text2= new File(file2);
		
		Scanner in2 = new Scanner(text2);
		in2.close();
		
		int val2 = in2.nextInt();
		System.out.println("Value2 is : " + val2);
		
		in.close();//must close the underlying file on the system
		
	}

}
