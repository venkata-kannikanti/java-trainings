package oops;

public class BankAccount implements IRate {

	String accountNumber;
	static final String routingNumber = "034380333";
	private String SSN;
	private String name;
	String accountType;
	double balance;
	
	BankAccount(){
		System.out.println("Calling BankAccount Class");
	}
	BankAccount(String typeofAccount){
		System.out.println(" The Account Type Is: " + typeofAccount);
	}
	BankAccount(String typeofAccount, double depositAmt){
		System.out.println(" The Account Type Is: " + typeofAccount + " And the deposited Ammount in $ Is: " + depositAmt);
		balance = depositAmt;
	}
	
	//Getters and Setters
	public void setName(String accName) {
		this.name = accName; 
	}
	public String getName() {
		return name;
	}
	
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("deposit");
		
	}
	
	public void setRate() {
		System.out.println("Set Rate");
	}
	
	public void increaseRate() {
		System.out.println("Increase Rate");
	}
	
	void withdraw(double wamount) {
		balance = balance - wamount;
		showActivity("withdraw");
		checkBalance();
	}
	
	void checkBalance() {
		System.out.println("Balance is :" + balance);
	}
	
	void getStatus() {
		
	}
	
	private void showActivity(String activityName) {
		System.out.println("Showing Recent Activity :" + activityName);
	}
	
	@Override
	public String toString() {
		return "[ " + name + ", " + accountNumber + ", " + balance + "] ";
	}
	
}
