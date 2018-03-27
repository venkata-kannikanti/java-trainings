package basics;

public class FibonnaciApp {

	public static void main(String[] args) {
		//Fibonnaci is Sum of the two previous numbers
		//fib(0) = 0;
		//fib(1) = 1;
		//fib(2) = fib(1)+fib(0);
		//fib(3) = fib(2)+fib(1)+fib(0);
		int n = 15, k = 8;
		int fibval = fib(n);
		printFib(n);
		printRecurFact(8);
		int factvalue = printFact(k);
		int[] nums = {5, -2, 0, 234, -438, 63};
		System.out.println("The Factorial for the Given Number is :" + factvalue);
		System.out.println("The Factorial for the Given Number is :" + printRecurFact(8));
		System.out.println("The Fibonnaci Value of the Given Number :" + n + " Is :" + fibval);
		System.out.println("The Minimum Number Present in the Array Is :" + findMin(nums));
		System.out.println("The Maximum Number Present in the Array Is :" + findMax(nums));
		System.out.println("The Average value of Array Is :" + findAvgOfArray(nums));
	}
	public static int findMin(int[] arr) {
		int min = arr[0];
		for (int i = 0; i< arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	public static int findMax(int[] arr) {
		int max = arr[0];
		for (int i = 0; i< arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	public static int findAvgOfArray(int[] arr) {
		int sum = 0;
		for (int i = 0; i< arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum/arr.length;
	}
	public static int fib(int n) {
		if (n== 0) {
			return 0;
		}
		else if (n == 1) {
			return 1;
		}
		return (((fib(n-1))+(fib(n-2))));
			
	}
	public static void printFib(int n) {
		int j = 0;
		int k = 1;
		System.out.println(j+" "+k);
		for (int i = 2; i<=n; i++) {
			int m = j + k;
			System.out.println("The Fibonacci Series is :" + m);
			j = k;
			k = m;
		}
		}
	public static int printFact(int n) {
			int factValue,k = 1;
			
			for (int i = 2; i<=n; i++) {
				factValue = i * k;
				k = factValue;
				
			}
			return k;
			
	}
	public static int printRecurFact(int n) {
		if (n== 0) {
			return 0;
		}
		else if (n == 1) {
			return 1;
		}
		return (((printRecurFact(n-1))*n));
		
}

}
