package oops;

public class BankAccApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount bAcc = new BankAccount();
		bAcc.setName("Venkata");
		bAcc.setSSN("3745739003");
		bAcc.balance = 34556;
		bAcc.accountNumber = "3484848533";
		System.out.println(bAcc.getName());
		System.out.println(bAcc.getSSN());
		BankAccount bAcc1 = new BankAccount("CheckingAccount");
		bAcc1.setRate();
		bAcc1.increaseRate();
		bAcc1.accountNumber = "4564848533";
		bAcc1.deposit(2000);
		bAcc1.deposit(4000);
		bAcc1.deposit(6000);
		bAcc1.withdraw(6000);
		System.out.println(bAcc.toString());
		BankAccount bAcc2 = new BankAccount("SavingsAccount",4658500);
		bAcc2.accountNumber = "6784848533";
		System.out.println("The Routing Number for Account 1 is:" + bAcc1.routingNumber);
		System.out.println("The Routing Number for Account 2 is:" + bAcc2.routingNumber);
		
		//Inheritance
		CDAccount CDAcc = new CDAccount();
		CDAcc.balance = 3000;
		CDAcc.setName("Rani");
		CDAcc.accountNumber = "4848494544";
		CDAcc.accountType = "CD Account";
		System.out.println(CDAcc.toString());
		CDAcc.compound();
				
			
	}

}
