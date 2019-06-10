//Author: Lauren Johnson, Liam Waddell
//Student Number: 300016250_300021290
//Course: ITI 1121 - Z
//Assignment 1
/*Class creates a Bank object
*/
/*
 * Bank.java
 *
 * Created on July 21, 2004, 1:23 AM
 */

public class Bank {
	//instance variables
    private Account[] accounts;
    private int size;
    private int capacity;
    //Constants
    private static final int SAVINGS = 0;
    private static final int CHECKING = 1;    
    private static final int SENIOR = 0;
    private static final int ADULT = 1;    
	private static final int STUDENT = 2;
	private static final int NON_VIP = 0;
	private static final int VIP = 1;
    private static final int INIT_CAPACITY = 100;
    //Constructor
    /** Creates a new instance of Bank */
    public Bank(){
        accounts = new Account[INIT_CAPACITY];
        capacity = INIT_CAPACITY;
        size = 0;
    }


    
    /********************************************************************
     * Creates a new account.
     */
    public String addAccount(String firstname, String lastname, int customerAge, String customerAddress, String customerPhoneNumber, int customerType, int typeAccount, boolean vip){
        Customer c;
        String accountNumber;
        if (size == capacity){
            reallocate();
        }
        if (customerType == 0){
			c = new Senior(firstname, lastname, customerAge, customerAddress, customerPhoneNumber,vip);
			
        }
        if (customerType == 1){
            c = new Adult(firstname, lastname, customerAge, customerAddress, customerPhoneNumber);
        }
        else{
            c = new Student(firstname, lastname, customerAge, customerAddress, customerPhoneNumber);
        }
        if (typeAccount == 0){
            accounts[size] = new SavingsAccount(c);
        }
        else{
            accounts[size] = new CheckingAccount(c);
        }
        accountNumber = accounts[size].getAccountNumber();
        size++;
        return accountNumber;
    }
    /***********************************************************************
     * Make a deposit into account.
     * pre: amount must be a positive integer
     * post: Account's balance increases
     * @param accountNumber String Account's number
     * @param amount double Amount to deposit
     * @return double New balance
     */
    public String makeDeposit(String accountNumber, double amount){
        int index = find(accountNumber);//store index number of Account containing accountNumber
        accounts[index].deposit(amount);
        return Double.toString(accounts[index].getBalance());
    }
    
    /***********************************************************************
     * Make a withdrawal from account.
     * pre: amount must be a positive integer
     * post: Account's balance decreases
     * @param accountNumber String Account's number
     * @param amount double Amount to withdraw
     * @return double New balance
     */    
    public String makeWithdrawal(String accountNumber, double amount){
        int index = find(accountNumber);
        accounts[index].withdrawal(amount);
        return Double.toString(accounts[index].getBalance());       
    }

    /***********************************************************************
     * Returns account information as a string so it can be displayed
     * @param accountNumber String Account's number
     * @return String Account information as a String object
     */    
    public String getAccount(String accountNumber){
		int i;
        for(i = 0; i<accounts.length;i++){
            if(accounts[i].getAccountNumber().equals(accountNumber)){
                return accounts[i].toString();
            }
        }
        return "-1";
    }
    
    /***********************************************************************
     * Given an account number tells if the account exists or not
     * @param accountNumber String Account's number
     * @return int TRUE if accountNumber exists in accounts[]. Otherwise, -1.
     */    
    private int find(String accountNumber){
		int i;
        for(i = 0; i<accounts.length; i++){
            if(accounts[i].getAccountNumber().equals(accountNumber)){
                return i;
            }
        }
        return -1;
    }

 /***********************************************************************


    /** You need to create private method : Allocate to allocate a new array to hold the transactions. */
    private void reallocate(){
        int i;//control for loop
		capacity = capacity * 2;//double capacity
		Account[] temp = new Account [capacity];//temp account to hold expanded account
		for(i = 0; i < accounts.length; i++){
			temp[i] = accounts[i];
		}
		accounts = temp;
    }
}

