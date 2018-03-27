package basics;

public class SalaryCalculator {

	public static void main(String[] args) {
		
		//Declare a variable
		String career;
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		System.out.println("Program is Starting");
		//Define a variable
		career = "SoftwareDeveloper";
		System.out.println("My Career is : " + career);
		career = "WebDeveloper";
		double salary = hoursPerWeek * weeksPerYear * rate;
		System.out.println("My Salary as a " + career + " at the rate of $" + rate + " per hour is $" + salary + " as an Year.");
	}

}
