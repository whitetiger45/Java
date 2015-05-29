package multiple_exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class test {
	public static void run() throws IOException, ParseException{
//		throw new IOException();

		throw new ParseException("Error in command list. ", 2);

	}
	
	public static void input() throws IOException, FileNotFoundException{
		
	}
}
