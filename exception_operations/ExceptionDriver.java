/*
 *Dillan Poorman
 *CSC205
 *09/30/2019
 *Driver class demonstrating custom exceptions
 */
package exception_operations;

import java.util.Scanner;

public class ExceptionDriver {
	
	public static void main(String[] args) {
		int numer = 1;
		int denom = 1;
		Scanner sc = new Scanner(System.in);
		Fraction frac = new Fraction(numer, denom);
	
		while(numer != 1234) {
			try {
				
			
				System.out.println("Enter a numerator 1234 to exit ");
				numer = sc.nextInt();
				System.out.println("Enter a denominator");
				denom = sc.nextInt();
			
				frac.setNumerator(numer);
				frac.setDenominator(denom);
			
				System.out.println(frac + " " + frac.toMixedNumber());
			
			}
			catch(DenominatorIsZeroException e) {
				
				System.out.println(e);
			}
			
			
		
		}
		
	}
	
	

}
/*

Enter a numerator 1234 to exit 
1
Enter a denominator
3
1/3 0 1/3
Enter a numerator 1234 to exit 
1
Enter a denominator
5
1/5 0 1/5
Enter a numerator 1234 to exit 
1
Enter a denominator
0
CSC205.DenominatorIsZeroException: Can't divide by zero!
Enter a numerator 1234 to exit 
3
Enter a denominator
6
3/6 0 3/6
Enter a numerator 1234 to exit 
1
Enter a denominator
0
CSC205.DenominatorIsZeroException: Can't divide by zero!
Enter a numerator 1234 to exit 
0
Enter a denominator
0
CSC205.DenominatorIsZeroException: Can't divide by zero!
Enter a numerator 1234 to exit 




*/