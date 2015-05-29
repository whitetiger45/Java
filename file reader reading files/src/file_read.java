import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class file_read {
	public static void main(String[] args) {
		File file = new File("test.txt");
		BufferedReader br = null;
		try {
			FileReader in = new FileReader(file);
			br = new BufferedReader(in);
			
			String line;
			
			while( (line = br.readLine()) != null){
				System.out.println(line);
			}
			
//			br.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + file.toString());
		} catch (IOException e) {
			System.out.println("Unable to read file: " + file.toString());
		}
		finally {
				try {
					br.close();
				} catch (IOException e) {
					System.out.println("Unable to close file: " + file.toString());
				}
				catch(NullPointerException ex){
					//file was probably never opened
			}
			
		}
		
		
		
	}
}
