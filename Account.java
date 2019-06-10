
//Course: ITI 1121 - Z
//Assignment 1
/*Class creates an Account object
*/
import java.util.Date;
import java.lang.Math;
abstract public class Account{
	//Constants
	static final int INITSIZE = 25;
	//Instance variables
	Customer customer;//new Customer
	double balance;//balance
	static int number = 9999;//static used to increment accountNumber
	int accountNumber;//accountNumber
	Transaction [] transactions;//array of transactions
	int capacity;//set to INITSIZE
	//Constructors
	public Account(Customer c){
		customer = c;
		accountNumber = number + 1;
		number = accountNumber;
		capacity = INITSIZE;
		transactions = new Transaction[INITSIZE];
	}
	//getters
	/*Method returns the balance of account rounded to 2 decimal places
	*/
	public double getBalance(){
		balance = (double) Math.round(balance * 100.0)/100.0;
		return balance;
	}
	/*Method returns Customer object
	*/
	public Customer getCustomer(){
		return customer;
	}
	/*Method returns account number as String
	*/
	public String getAccountNumber(){
		return Integer.toString(accountNumber);
	}
	//setters
	/*Method sets Customer
	*/
	public void setCustomer(Customer c){
		customer = c;
	}

	public void setBalance(double b){
		balance = b;
	}
	//overrides
	/*Method returns string representation of Account
	*/
	public String toString(){
		String s;
		s = "Customer: " + customer + " Balance: " + balance + " Account number: " + accountNumber;
		return s;
	}
	//class methods
	/*Method doubles size of Transaction array when full
	*/
	public void reallocate(){
		int i;
		capacity = capacity*2;
		Transaction [] temp = new Transaction[capacity];
		for(i = 0; i < transactions.length; i++){
			temp[i] = transactions[i];
		}
		transactions = temp;
	}
	//Abstract methods
	public abstract double deposit(double amount);
	public abstract double withdrawal(double amount);
	public abstract double addInterest();
}
