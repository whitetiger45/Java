package demo3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class main3 {
	public static void main(String[] args) {
		try {
			openFile();
		} catch (FileNotFoundException e) {
			//P.S. this message is too vague...maybe try passing back the file that couldn't be opened
			System.out.println("Could not open file!!");
		}
	}
	
	public static void openFile() throws FileNotFoundException{
		File file = new File ("test.txt");
		
		FileReader fr = new FileReader(file);
	}
}
