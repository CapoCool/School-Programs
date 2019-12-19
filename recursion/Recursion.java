package recursion;
/**
 * 
 * @author Dillan Poorman
 * CSC205
 * 11/23/2019
 * Recrusion class
 */

public class Recursion {
	
	//returns factorial
	public static int fact(int n) {
		
		if (n >= 1) {
			return n * fact(n - 1);
		}
		else {
			return 1;
		}
	}
	
	//returns the fibonacci sequence
	public static int fib(int n) {
		
		if (n <= 1) {
			return n;
		}
		else {
			return fib(n - 1) + fib(n - 2);
		}
	}
	
	//returns the greates common divisors
	public static int gcd(int num1, int num2) {
		
		//everything divides 0
		if(num1 == 0) {
			return num2;
		}
		if(num2 == 0) {
			return num1;
		}
		
		//base case
		if(num1 == num2) {
			return num1;
		}
		
		//a is greater
		if (num1 > num2) {
			return gcd(num1-num2, num2);
		}
		
		//b is greater
		else {
			return gcd(num1, num2-num1);
		}
		
	}
	
	//returns the power of numbers
	public static int power(int x, int y) {
		if(y != 0) {
			return(x * power(x, y-1) );
		}
		else {
			return 1;
		}
	}
	
	//ackermann's function
	public static int ack(int m, int n) {
		
		if(m == 0) {
			return n + 1;
		}
		if(n == 0) {
			return ack(m - 1, 1);
		}
		
		return ack(m-1, ack(m, n - 1));
	}

}
