/**
 * Abstract class that represents a generic Bank Account
  
 * Must implement BaseInterestRate interface to obtain base interest rate and set interest rate for
 * specific concrete classes
  *
 */

public abstract class Account implements BaseInterestRate{
	
	/*
	 * Declare the following fields:
	 * 
	 * name - represents an accountholder's full name
	 * ssn - represents an accountholder's ssn
	 * balance - represents the balance of the account
	 * accountNumber - represents the unique id of the account 
	 * interestRate - represents the base interest rate for all accounts 
	 */
	

	
	String name;
	String ssn;
	double balance;
	String accountNumber;
	double interestRate;
	
	
	
	
	/*Constructor to set all 5 fields
	 * 
	 *accountNumber field must be initialized by calling the generateAccountnumber() method
	 *
	 *interestRate  field must be initialized by calling the getBaseInterestRate() method of BaseInterestRate interface
	 *
	 */
	public Account(String name, String ssn, double balance) {
		//implementation goes here
		this.name = name;
		this.ssn = ssn;
		this.balance = balance;
		this.accountNumber = generateAccountnumber();
		this. interestRate = getBaseInterestRate();

	}

	protected abstract double getBaseInterestRate();


	/*
	 * method to generate a generic Account number and to initialize accountNumber field in the constructor. 
	 * 
	 * It should be generated as:
	 * Last four digits of ssn + random 8 digit number
	 *  
	 * 
	 */
	private String generateAccountnumber() {
	   //implementation goes here
		int num = 0;
		for (int i = 0; i < 8; i++) {
			num = (int) (Math.random() * 99999999);
		}
//		System.out.println(num);
		String str = Integer.toString(num);
//		System.out.println(str);
		String l4ssn = ssn.substring(5);

		String accountNumber = l4ssn + str;
		return accountNumber;
	}
	
	
	/*
	 * adds the given amount to the balance and prints out a message -> "YOUR BALANCE IS: " +  balance
	 */
	public void deposit(double amount) {
		//implementation goes here
		this.balance = balance + amount;
		System.out.println("Your balance is: " + this.balance);
	}
	
	
	
	
	
	/*
	 * subtracts the given amount from the balance and prints out a message -> "YOUR BALANCE IS: " +  balance
	 * 
	 * if the amount that is being withdrawn is larger than the balance prints out a message ->
	 * "AMOUNT TO BE WITHDRAWN EXCEEDS THE BALANCE"
	 */
	public void withdraw(double amount) {
		//implementation goes here
		if (amount < balance) {
		this.balance = this.balance - amount;
			System.out.println("Your balance is: " + this.balance);
		}else{
			System.out.println("Amount to be withdrawn exceeds the balance");
		}
	}
	
	
	


	/*
	 * Prints information about the account
	 * 
	 * Information should include name, ssn, accountNumber and balance printed on separate lines
	 * 	Ex:
	 * 	
	 * 	NAME: Arielle Duncan
		SSN: 444102638
		ACCOUNT NUMBER: 2263869065803
		BALANCE: 1000.0
	 */
	public void showInfo() {
		System.out.println(
				"Name: " + name + '\'' +
				"SSN: " + ssn + '\'' +
				"Balance: " + balance + '\'' +
				"Account Number: " + accountNumber);
	}


}
