package oops;

public class LoanAccount implements IRate {
	
	@Override
	public void setRate() {
		System.out.println("Rate");
		
	}
	@Override
	public void increaseRate() {
		System.out.println("Plan to Increase Rate");
	}
}
