import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * This Runner class is used to obtain customer information from a text file 
 * and create multiple bank accounts based on it and display information about them
 * 
 *
 */

public class TestApp {
	
	public static void main(String[] args) throws IOException {


		//*** THIS PART OF THE PROJECT IS QUITE CHALLENGING, NOT SURE HOW TO PROCEED WITH THIS, WOULD APPRECIATE ADVICE / GUIDANCE ***



		//1. Create a List of Accounts and initialize it  //Use ArrayList
		BufferedReader bufReader = new BufferedReader(new FileReader("customers.txt"));
		ArrayList<String>  accounts = new ArrayList<>();

		String line = bufReader.readLine();
		while(line != null) {
			accounts.add(line);
			line = bufReader.readLine();
		}
		bufReader.close();
		System.out.println(accounts);


		//2. Create a List of customers
		//Read new account holder information from a file customers.txt by calling the utility method readFromAFile()
		//and store it into a List of String arrays (String[])


		//3. Add new accounts to List of Accounts		
		//Loop through the List of customers and get the information for each new customer (name, ssn, accountType, initialBalance )
		// and create a new Savings or Checking account based on the accountType and add that new Account to the 
		// List of Accounts

		for (int i = 0; i < ; i++) {
			
		}

		//4. Loop through the List of Accounts and 
		// call showInfo() method on each account to display info about each created account
		for (int i = 0; i < ; i++) {
			
		}

	}

}
