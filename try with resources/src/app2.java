import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//this is much neater than the example of using the buffered reader and file reader example from the previous tutorial
public class app2 {
	public static void main(String[] args) {
		File f = new File("test.txt");
		
		try(BufferedReader br = new BufferedReader(new FileReader(f))){
			String line;
			while((line = br.readLine()) != null){
				System.out.println(line);
			}
			
		}catch (FileNotFoundException e){
			System.out.println("Can't find file: " + f);
		}catch (IOException e){
			System.out.println("Unable to read file: " + f);
		}
		
	}
}
