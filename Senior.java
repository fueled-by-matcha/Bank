//Author: Lauren Johnson, Liam Waddell
//Student Number: 300016250_300021290
//Course: ITI 1121 - Z
//Assignment 1
/*Class creates a Senior object, an extension of Customer
*/
public class Senior extends Customer {
	//Constants
 	private final double SAVINGS_INTEREST = 0.08;
	private final double CHECK_INTEREST = 0.04;
	private final double CHECK_CHARGE = 0.01;
	private final double OVERDRAFT_PENALTY = 10.00;
	//Instance variables
	static boolean isVIP = false;
	//Constructor
	public Senior(String f, String l, int a, String ad, String p, boolean vip){
		super(f,l,a, ad, p);
		isVIP = vip;
	}
	//setters
	/*Method sets isVIP to true or false
	*/
	public static void setVIP(boolean x){
		isVIP = x;
	}
	//Getter methods outlined in abstract class
	/*Method returns the savings interest for Senior
	*/
	public double getSavingsInterest(){
		if (isVIP == true){
			return 0.1;
		}
		return SAVINGS_INTEREST;
	}
	/*Method returns checking interest for Senior
	*/
	public double getCheckInterest(){
		if (isVIP == true){
			return 0.04;
		}
		return CHECK_INTEREST;
	}
	/*Method returns checking charge for Senior
	*/
	public double getCheckCharge(){
		if (isVIP == true){
			return 0.0;
		}
		return CHECK_CHARGE;
	}
	/*Method returns overdraft penalty for Senior
	*/
	public double getOverdraftPenalty(){
		return OVERDRAFT_PENALTY;
	}
	/*Method returns the boolean isVIP
	*/
	public static boolean getVIP(){
		return isVIP;
	}
}