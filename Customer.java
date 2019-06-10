
//Course: ITI 1121 - Z
//Assignment 1
/*Class creates a Customer object
*/
abstract public class Customer{
	//instance variables
	private String firstName;//customer first name
	private String lastName;//customer last name
	private int age;//customer age
	private int customerNumber;//customer number
	private static int lastCustomerNumber = 9999;//static used to increment customerNumber
	private String address;//address
	private String phoneNumber;//customer phone number
	//Constructors 
	public Customer(String f, String l, int a, String ad, String p){
		firstName = f;
		lastName = l;
		age = a;
		customerNumber = lastCustomerNumber + 1;
		lastCustomerNumber = customerNumber;
		address = ad;
		phoneNumber = p;
	}
	//setter methods
	/*Method sets firstName variable
	*/
	public void setFirstName (String f){
		firstName = f;
	}
	/*Method sets lastName variable
	*/
	public void setLastName (String l){
		lastName = l;
	}
	/*Method sets lastCustomerNumber by incrementing it by one everytime it is called when a new Customer
	*is implemented
	*/
	public void setCustomerNumber (){
		customerNumber = lastCustomerNumber;
	}
	/*Method sets customer address
	*/
	public void setAddress(String a){
		address = a;
	}
	/*Method sets telephone number
	*/
	public void setPhoneNumber(String p){
		phoneNumber = p;
	}
	//getter methods

	/*Method returns firstName variable
	*/
	public String getFirstName(){
		return firstName;
	}
	/*Method returns lastName variable
	*/
	public String getLastName(){
		return lastName;
	}
	/*Method returns lastCustomerNumberVariable
	*/
	public int getLastCustomerNumber(){
		return lastCustomerNumber;
	}
	/*Method returns CustomerNumber
	*/
	public int getCustomerNumber(){
		return customerNumber;
	}
	/*Method returns Customer address
	*/
	public String getAddress(){
		return address;
	}
	/*Method returns Customer phoneNumber
	*/
	public String getPhoneNumber(){
		return phoneNumber;
	}
	//override methods

	/*Method returns true if one customer is equal to another
	*/
	public boolean equals(Customer c){
		return(this == c);
	}
	/*Method returns the string representation of a Customer
	*/
	public String toString(){
		String s;
		s = "Name: " + firstName + " " + lastName + " Age: " + age + " Address: " + address + " Phone Number: "+ phoneNumber + " Customer number: " + customerNumber;
		return s;
	}
	//abstract methods

	/*Method returns the savings interest for a Customer
	*/
	public abstract double getSavingsInterest();
	/*Method returns the checking interest for a Customer
	*/
	public abstract double getCheckInterest();
	/*Method returns the check charge for a Customer
	*/
	public abstract double getCheckCharge();
	/*Method returns the overdraft penalty for a Customer
	*/
	public abstract double getOverdraftPenalty();
}
