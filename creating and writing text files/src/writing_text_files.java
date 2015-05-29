import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//this is much neater than the example of using the buffered reader and file reader example from the previous tutorial
public class writing_text_files {
	public static void main(String[] args) {
		File f = new File("test.txt");
		
		try(BufferedWriter br = new BufferedWriter(new FileWriter(f))){
			br.write("This is line one\n");
			br.newLine();
			br.write("This is line two\n");
			br.newLine();
			br.write("Last line!");
		}catch (IOException e){
			System.out.println("Unable to read file: " + f);
		}
		
		
		
	}
}
