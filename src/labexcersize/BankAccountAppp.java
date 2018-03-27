package labexcersize;

public class BankAccountAppp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount bAcc = new BankAccount("9245678990", 1000.50);
		bAcc.setAccountName("Venkata Kannikanti");
		System.out.println("The Account Name Is :" + bAcc.getAccountName());
		bAcc.makeDeposit(3000.00);
		bAcc.payBill(200.00);
		bAcc.accrue();
		System.out.println("The Complete Account Details Is :" + bAcc.toString());
		
	}

}

class BankAccount implements IIntrest{
	private static int id= 1000; // internal ID
	private String accountName;
	private String accountNumber; //ID+Random 2 digit number + first 2 of SSN
	private static final String routingNumber = "005400657";
	private String SSN;
	private double balance;
	
	BankAccount(String SocialNum, double initDeposit){
		balance = initDeposit;
		System.out.println("New Account is Created");
		this.SSN = SocialNum;
		id++;
		setAccountNumber();
	}
	public void setAccountNumber() {
		int random = (int) (Math.random() * 100);
		accountNumber = id + "" + random + SSN.substring(0,2);
		System.out.println("The Account Number Generated Is:" + accountNumber);
	}
	public void setAccountName(String userName) {
		this.accountName = userName;
	}
	public String getAccountName() {
		return accountName;
	}
	public void payBill(double ammount) {
		System.out.println("The PayBill from the Account is:" + ammount);
		balance = balance - ammount;
		showBalance();
	}
	public void makeDeposit(double ammount) {
		System.out.println("The Deposit made in the Account is:" + ammount);
		balance = balance + ammount;
		showBalance();
	}
	public void showBalance() {
		System.out.println("The Balance present in the Account is:" + balance);
	}
	@Override
	public void accrue() {
		System.out.println("The Balance Before Intrest :" + balance);
		balance = balance * (1+rate/100);
		showBalance();
		
	}
	@Override
	public String toString() {
		return "[Name: " + accountName + "]\n[Account Number: " + accountNumber + "]\n[Routing Number :" + routingNumber + "]\n[Balance :" + balance +"]";
	}
}
