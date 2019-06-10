
//Course: ITI 1121 - Z
//Assignment 1
/*Class creates a SavingsAccount object, an extension of Account
*/
import java.util.Date;
public class SavingsAccount extends Account{
	//instance variables
	private int index;
	//Constructor
	public SavingsAccount(Customer c){
		super(c);
		double balance = 0.00;
		transactions = new Transaction[INITSIZE];
		int index = 0;//tracks number of transactions
	}
	//class methods
	/*Method adds money to account
	*/
	public double deposit(double amount){
		if(index == capacity){
			reallocate();
		}
		transactions[index] = new Transaction((byte)0, 0 , amount, "Deposit");
		index++;
		balance = balance + amount;
		addInterest();
		return balance;
	}
	/*Method withdraws money from Account and takes into account overdraft fees
	*/
	public double withdrawal(double amount){
		//Check if need for reallocate
		if(index == capacity){
			reallocate();
		}
		transactions[index] = new Transaction((byte)1, 0, amount, "Withdrawal");
		index++;
		balance = balance - amount;
		if(balance < 0.00 && customer instanceof Adult && balance > -500.00){
			balance = balance - customer.getOverdraftPenalty();
			return balance;
		}
		if(balance < 0.00 && customer instanceof Senior && Senior.getVIP() == false){
			balance = balance - customer.getOverdraftPenalty();
			return balance;
		}
		if(balance < 0.00 && customer instanceof Senior && Senior.getVIP() == true && balance > -500.00 && balance < -100.00){
			balance = balance - 5.00;
			return balance;
		}
		if(balance < 0.00 && customer instanceof Student){
			balance = 0.00;
			return balance;
		}
		return balance;
	}
	/*Method adds interest to Account
	*/
	public double addInterest(){
		double interest = balance * customer.getSavingsInterest();//interest calculation
		if(index == capacity){
			reallocate();
		}
		transactions[index] = new Transaction((byte)2, 0, interest, "Interest");
		index++;
		balance = balance + interest;
		return balance;
	}
}
