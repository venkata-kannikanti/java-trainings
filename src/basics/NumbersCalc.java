package basics;

public class NumbersCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printName();
		int a = 10;
		int b = 20;
		addNumbers(a,b);
		int mutlival = multiplyNumbers(a,b);
		System.out.println("The Product of numbers " + a + " and " + b + " is: " + mutlival);

	}
	static void printName() {
			System.out.println("My Name is Venkata");
		}
	static void addNumbers(int numberA, int numberB) {
		int sum = numberA + numberB;
		System.out.println("The Sum of numbers " + numberA + " and " + numberB + " is: " + sum);
		
	}
	
	static int multiplyNumbers(int multiA, int multiB) {
		int product = multiA * multiB;
		//calling another function
		addNumbers(product+50, product);
		return product;
	}
		
		
		
	

}
