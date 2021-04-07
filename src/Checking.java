/**
 * 
 * A class that represents a Checking account
 * Must extend abstract Account class to inherit generic account properties and behaviors
 *
 *
 */

public class Checking extends Account {


	/*
	 * Declare the following fields for Checking account:
	 * 
	 * debitCardNo - represents a debit card number 
	 * debitCardPIN - represents a debit card pin 
	 * 
	 * Fields must be properly encapsulated
	 */
	
	//Field declarations go here
	private String debitCardNo;
	private String debitCardPin;



	/*
	 * Constructor that initializes Checking account object
	 * 
	 * Besides calling its super class constructor, this constructor must do the following:
	 * - change accountNumber for Checking account by adding "1" before super class's accountNumber
	 * - initialize debitCardNo  by generating 16-digit random number
	 * - initialize debitCardPIN  by generating 4-digit random number
	 * - set the interest rate  by calling setInterestRate() method
	 */

	public Checking(String name, String ssn, double balance) {
	super(name, ssn, balance);
	this.accountNumber = "1" + accountNumber;
	this.debitCardNo = getDebitCardNo();
	this.debitCardPin = getDebitCardPin();
	this.interestRate = setInterestRate();
	}

	@Override
	protected double getBaseInterestRate() {
		return 2.5;
	}

	public String getDebitCardNo(){
	int num1 = 0;
	int num2 = 0;
	for (int i = 0; i < 8; i++) {
		num1 = (int) (Math.random() * 99999999);
	}
	for (int j = 0; j < 8; j++) {
		num2 = (int) (Math.random() * 99999999);
	}
//	System.out.println(num1);
//	System.out.println(num2);
	String str1 = Integer.toString(num1);
	String str2 = Integer.toString(num2);
//	System.out.println(str1 + str2);
	String debitCardNo = str1 + str2;

		return debitCardNo;
}

public String getDebitCardPin(){
	int nums = 0;
	for (int i = 0; i < 4; i++) {
		nums = (int) (Math.random() * 9999);
	}
//	System.out.println(nums);
	String debitCardPin = Integer.toString(nums);
//	System.out.println(str);
		return debitCardPin;
}
	
	/*
	 * Override super class's showInfo() method by ADDING Checking account specific info
	 * such as account type, debitCardNo, debitCardPIN and interestRate
	 * 
	 * Ex:
	 * 	NAME: Marybeth Sanders
		SSN: 431551383
		ACCOUNT NUMBER: 1138372589466
		BALANCE: 2500.0
		ACCOUNT TYPE: Checking
		DEBIT CARD NUMBER: 6804579327874081
		DEBIT CARD PIN: 8689
		INTEREST RATE: 0.375%
	 * 
	 */
     //showInfo() method definition and impementation goes here

	@Override
	public void showInfo() {
		System.out.println(
				"Name: " + name + '\'' +
				"SSN: " + ssn + '\'' +
				"Balance: " + balance +
				"Account Number: " + accountNumber + '\'' +
				"Interest Rate: " + interestRate +
				"Debit Card Number: " + debitCardNo +
				"Debit Card PIN: " + debitCardPin +
				'}');
	}

	@Override
	public double setInterestRate() {
		return super.interestRate = (15 * 2.5) / 100;
	}


	/*
	 * Implement setInterestRate() method of BaseInterestRate interface
	 * 
	 * Checking account interest rate must be set to 15% of the interestRate declared in Account class
	 */
	// setInterestRate() method definition and implementation goes here

	

}
