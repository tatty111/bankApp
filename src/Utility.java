import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.*;
import java.lang.ProcessBuilder.Redirect;
import java.nio.file.FileSystemNotFoundException;
import java.util.*;

public class Utility {
	
	
	/*
	 * Implement a static utility method that reads from a .txt file and returns the information in the file
	 * as a List of String [], where each element (i.e String[] ) represents each line in the file
	 * which contains all the required information about each customer (name, ssn, accountType, initialBalance)
	 * 
	 * To read from a file use Scanner class and nextLine() method
	 * 
	 * Use try-catch block to handle the FileNotFoundException
	 *
	 * Optionally use try-with-resources statement to auto-close the Scanner object 
	 */
	public static List<String[]> readFromAFile(String customers) throws IOException {
		ArrayList<String[]> list = new ArrayList<>();

		try (Scanner sc = new Scanner(new File("customers.txt"))) {
			while (sc.hasNextLine()) {

			}
		} catch (FileSystemNotFoundException e){

	}

//		File file = new File("customers.txt");
//		Scanner sc = new Scanner(file);
//
//	while (sc.hasNextLine()){
//		System.out.println(sc.nextLine());
//	}
//
//	sc.close();
//
		return list;


	}}
	
	


