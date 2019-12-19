package sorting;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.sql.Time;
import java.util.Random;


/**
 * 
 * @author 
 * First 10 of 50000
1143138235
2047119790
1786310502
925502326
346564851
766465833
257598475
217716935
277333193
2112488089
Integer[] Selection Sort StopWatch [getElapsedTime()=2168, getMode()=MILLI]
Integer[] Insertion Sort StopWatch [getElapsedTime()=2659, getMode()=MILLI]
Integer[] Bubble Sort StopWatch [getElapsedTime()=7830, getMode()=MILLI]
Integer[] Quick Sort StopWatch [getElapsedTime()=18, getMode()=MILLI]
Integer[] Merge Sort StopWatch [getElapsedTime()=1111, getMode()=MILLI]
Done!


Dillan Poorman edit
12/7/2019
CSC205
Edit Output:
First 10 of 50000
509435829
638646920
786079553
368547348
1725510409
728882811
724172605
2054381140
1886879276
1915578573
Selection Sort
null StopWatch [getElapsedTime()=1825, getMode()=MILLI]
Insertion Sort
null StopWatch [getElapsedTime()=2294, getMode()=MILLI]
Bubble Sort
null StopWatch [getElapsedTime()=7113, getMode()=MILLI]
Merge Sort
null StopWatch [getElapsedTime()=801, getMode()=MILLI]
quick sort
null StopWatch [getElapsedTime()=13, getMode()=MILLI]
Done!
 *
 */

public class SortingTester {

	public static void main(String[] args) {

		final int SIZE = 50000;
		Random gen = new Random();
		StopWatch sw = new StopWatch();
		
		SortingUtility ob = new SortingUtility();
		
		Integer[] control = new Integer[SIZE];
		//Double[] control = new Double[SIZE];
		//String[] control = new String[SIZE];
	
	
		for (int x = 0; x < SIZE; x++ ) {
			control[x] = gen.nextInt(Integer.MAX_VALUE);
			//control[x] = gen.nextDouble() * Integer.MAX_VALUE;
			//control[x] = new BigInteger(130, random).toString(32);
			
		}

		// Pre-sort Display
		
		System.out.println("First 10 of " + control.length);
		for (int x = 0; x < 10; x++) {
			System.out.println(control[x]);
		}
	
		Integer[] target = new Integer[SIZE];
		//Double[] target = new Double[SIZE];
		//String[] target = new String[SIZE];
		
		
		//Keep a copy of the original array using System.arraycopy			
		System.arraycopy(control, 0, target, 0, control.length);	
		//reset the stop watch
		sw.reset();
		//start the stop watch
		sw.start();
		
		
		//sort the target using slectionSort
		
		ob.selectionSort(target);
		
		//stop the watch
		sw.stop();
		
		//print out the time elapse. Invoke stopwatch's toString method
		//An expected output is given below for just Integer array.
		System.out.println("Selection Sort");
		System.out.println(sw.toString());
		/*
		for (int i = 0; i <= 10; i ++) {
			System.out.print(target[i] + " ");
		}
		*/
//Repeat all the above steps for the other four sorting algorithms
		
		//insertion sort
		System.arraycopy(control, 0, target, 0, control.length);
		
		sw.reset();
		sw.start();
		
		ob.insertionSort(target);
		
		sw.stop();
		System.out.println("Insertion Sort");
		System.out.println(sw.toString());
		
		
		//bubble sort
		System.arraycopy(control, 0, target, 0, control.length);
		
		sw.reset();
		sw.start();
		
		ob.bubbleSort(target);
		
		sw.stop();
		System.out.println("Bubble Sort");
		System.out.println(sw.toString());
		
		//merge sort
		System.arraycopy(control, 0, target, 0, control.length);
		
		sw.reset();
		sw.start();
		
		//for this one I am using the given SortingUtilies class because the
		//class I made was doing it as fast as quick sort, so idk what I did wrong
		//when I wrote it
		ob.mergeSort(target, 0, target.length-1);
		
		sw.stop();
		System.out.println("Merge Sort");
		System.out.println(sw.toString());
		
		//quick sort
		System.arraycopy(control, 0, target, 0, control.length);
	
		sw.reset();
		sw.start();
		
		ob.quickSort(target, 0, target.length-1);
		
		sw.stop();
		System.out.println("quick sort");
		System.out.println(sw.toString());
		System.out.println("Done!");
		
		
	}

}