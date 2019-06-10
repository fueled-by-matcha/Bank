//Author: Lauren Johnson, Liam Waddell
//Student Number: 300016250_300021290
//Course: ITI 1121 - Z
//Assignment 1
/*Class creates a Student object, an extension of Customer
*/
public class Student extends Customer{
	//Constants
	private final double SAVINGS_INTEREST = 0.07;
	private final double CHECK_INTEREST = 0.03;
	private final double CHECK_CHARGE = 0.02;
	private final double OVERDRAFT_PENALTY = 0.00;
	//Constructor
	public Student(String f, String l, int a, String ad, String p){
		super(f,l,a,ad,p);
	}
	//Getter methods outlined in abstract class
	/*Method returns the savings interest for Student
	*/
	public double getSavingsInterest(){
		return SAVINGS_INTEREST;
	}
	/*Method returns checking interest for Student
	*/
	public double getCheckInterest(){
		return CHECK_INTEREST;
	}
	/*Method returns checking charge for student
	*/
	public double getCheckCharge(){
		return CHECK_CHARGE;
	}
	/*Method returns overdraft penalty for Student
	*/
	public double getOverdraftPenalty(){
		return OVERDRAFT_PENALTY;
	}
}