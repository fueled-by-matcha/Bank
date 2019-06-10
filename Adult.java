//Author: Lauren Johnson, Liam Waddell
//Student Number: 300016250_300021290
//Course: ITI 1121 - Z
//Assignment 1
/*Class creates an Adult object, an extension of Customer
*/
public class Adult extends Customer{
	//Constants
	private final double SAVINGS_INTEREST = 0.03;//Savings interest
	private final double CHECK_INTEREST = 0.01;//checking interest
	private final double CHECK_CHARGE = 0.03;//checking charge
	private final double OVERDRAFT_PENALTY = 25.00;//overdraft penaly
	//Constructor
	public Adult(String f, String l, int a, String ad, String p){
		super(f,l,a, ad, p);
	}
	//Getter methods outlined in abstract class
	/*Method returns the savings interest for Adult
	*/
	public double getSavingsInterest(){
		return this.SAVINGS_INTEREST;
	}
	/*Method returns checking interest for Adult
	*/
	public double getCheckInterest(){
		return this.CHECK_INTEREST;
	}
	/*Method returns checking charge for Adult
	*/
	public double getCheckCharge(){
		return this.CHECK_CHARGE;
	}
	/*Method returns overdraft penalty for Adult
	*/
	public double getOverdraftPenalty(){
		return this.OVERDRAFT_PENALTY;
	}

}