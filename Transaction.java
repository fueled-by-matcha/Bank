//Author: Lauren Johnson, Liam Waddell
//Student Number: 300016250_300021290
//Course: ITI 1121 - Z
//Assignment 1
/*Class creates a Transaction object
*/
import java.util.Date;
public class Transaction{
	//instance variables
	Byte type;//store transaction type (0,1,2)
	Date date;//stores transaction date
	int fees;//Stores fees
	double amount;//stores amount going in or out
	String description;//description of transaction
	//Constructor
	public Transaction(byte t, int f, double a, String des){
		type = t;
		fees = f;
		amount = a;
		description = des;
	}
	//setters
	/*Method sets transaction type
	*/
	public void setType(byte t){
		type = t;
	}
	//class methods
	/*Method returns the string containing the transaction information
	*/
	public String processTransaction(){
		String s;
		String t;
		if(this.type == 0){
			t = "Deposit";
		}
		else if(this.type == 1){
			t = "Withdraw";
		}
		else{
			t = "Added Interest";
		}
		s = "Transaction: " + t + " Date: " + date + " Amount: "+ amount + " Fees: " + fees;
		return s;
	}
}