
//********************************************************************
// DistributionChart.java       
// Name: Dillan Poorman
// Date:04/18/2018
// 
// 
// Design and implement an application called DistributionChart
// that creates a chart/histogram so that you can visually inspect 
// the frequency distribution of a set of values.
//
// 
//********************************************************************
package ch8;
import java.util.Scanner;

public class DistributionChart 
{
	

   public static void main (String[] args) 
   {
      int size = 1000;
      int[] ranges = new int[size];  // each entry represents a range of values
	     
      getData(ranges);   //pass the entire array into the method
      
      displayChart(ranges);
      
      System.out.println("\nSee you later!!");
      
   } //end of main
   
   public static void getData(int[] someArray)
   {
	   
	   Scanner scan = new Scanner (System.in);
 
	   System.out.println ("Enter a series of numbers between 1 and 100. Separate each number with a space.");
	   System.out.println ("Signal the end by entering a number outside " +
	         "of that range and then press enter.");
	   System.out.print("Go: ");
	   scan.nextInt();
	   
	   //reads an arbitrary number of integers that are in the range 1 to 100 inclusive
	   //for each integer read in, determine which range it is in and increment the corresponding element in the array
	   int in = scan.nextInt();//to be determined
	  
	   
	   while(in < 100)
	   {
		   someArray[in]++;
		   in = scan.nextInt();
	   }
	    
	    scan.close(); 
	    
	    
   }//end of getData
   
   public static void displayChart(int[] someArray)
   {
	   //Print chart title with your name
	   System.out.println("Distribution Chart by Dillan Poorman\n" + "=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
	   //Print histogram.
	   int base = 0;
	   for(int count = 0; count <= 90; count+=10)
	   {
		 System.out.print(count + " - " + (base += 10) + " |");
		 
		 for(int index = 0; index < base; index++)
		 {
			 
			 while(someArray[index] > 0)
			 {
				 System.out.print("*");
				 someArray[index]--;
			 }	 
		 }
		System.out.println();		 
	   }
		   
		   
		   	
			   
		   
       }

	     
	      
   } //end of displayChart


// end of DistributionChart tester class

/* Example output.  
Enter a series of numbers between 1 and 100. Separate each number with a space.
Signal the end by entering a number outside of that range and then press enter.
Go: 43 54 65 76 87 76 65 22 31 2 3 4 5 4 3 22 3 4 32 1 45 45 25 6 5 4 7 888
Distribution Chart by Dillan Poorman
=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

0 - 10  |*************
10 - 20 |
20 - 30 |***
30 - 40 |**
40 - 50 |**
50 - 60 |*
60 - 70 |**
70 - 80 |**
80 - 90 |*
90 - 100|

See you later!!

 
 
 */