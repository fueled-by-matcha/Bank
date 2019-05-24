
abstract class Customer{
	//instance variables
	private String firstName;
	private String lastName;
	private int age;
	private int customerNumber;
	private int lastCustomerNumber;
	//Constructors 
	public Customer(String f, String l, int a){
		firstName = f;
		lastName = l;
		age = a;
		customerNumber = 9999;
		lastCustomerNumber = 9999;
	}

	public Customer (){
		firstName = " ";
		lastName = " ";
		age = 18;
		customerNumber = 9999;
		lastCustomerNumber = 9999;
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
	public void setLastCustomerNumber (){
		lastCustomerNumber++;
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
		s = "Customer name: " + firstName + " " + lastName+"/n"+ "Customer number: " + customerNumber;
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
}