package recursion;

//Used by Dillan Poorman
//11/23/2019
//CSC205
//Tester class for recursion


/*
Test Activity 4 & Project 4:
Factorial:
1   1   2   6   24   120   720   5040   40320   362880   

Fibonacci:
0   1   1   2   3   5   8   13   21   34   

GCD:
GCD of 96 and 60 is 12
GCD of 30 and 10 is 10
GCD of 96 and 120 is 24

Test Project 4:
Power:
0^0=1   0^1=0   0^2=0   0^3=0   0^4=0   0^5=0   
1^0=1   1^1=1   1^2=1   1^3=1   1^4=1   1^5=1   
2^0=1   2^1=2   2^2=4   2^3=8   2^4=16   2^5=32   
3^0=1   3^1=3   3^2=9   3^3=27   3^4=81   3^5=243   

Ackerman:
1	2	3	4	5	
2	3	4	5	6	
3	5	7	9	11	
5	13	29	61	125	

 */
public class Project4 {

	public static void main(String[] args) {

		System.out.println("Test Activity 4 & Project 4:");

		// Test factorial
		System.out.println("Factorial:");
		for (int ii = 0; ii<10; ii ++) {
			System.out.print(Recursion.fact(ii) + "   ");
		}

		// Test fibonacci
		System.out.println("\n\nFibonacci:");
		for (int ii = 0; ii<10; ii ++) {
			System.out.print(Recursion.fib(ii) + "   ");
		}

		// Test Euclid's GCD algorithm 
		System.out.println("\n\nGCD:");
		System.out.println ("GCD of 96 and 60 is " + Recursion.gcd(96, 60));
		System.out.println ("GCD of 30 and 10 is " + Recursion.gcd(30, 10));
		System.out.println ("GCD of 96 and 120 is " + Recursion.gcd(96, 120));
		System.out.println();

		// Test Power function
		System.out.println("Test Project 4:");
		System.out.println("Power:");
		for (int ii = 0; ii<4; ii ++) {
			for (int jj = 0; jj<6; jj ++)  {
				System.out.print(ii + "^" + jj + "=" + Recursion.power(ii,jj) + "   ");
			}
			System.out.println();
		}

		// Test the Ackerman function 
		System.out.println("\nAckerman:");
		for (int ii = 0; ii<4; ii ++)
		{
			for (int jj = 0; jj < 5; jj++)
			{
				System.out.print(Recursion.ack(ii,jj) + "\t");
			}
			System.out.println();
		}

	}

}
