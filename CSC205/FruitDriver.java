package CSC205;

import java.util.ArrayList;
import java.util.Collections;


/**
 * 
 * @author Dillan Poorman
 * Date Written: 09/13/2019
 * Brief Description: 
 * Driver class for fruit
 * 
 * Your Output:
 * 
 * 
 *
 */

//import appropriate classes for this program

public class FruitDriver {
	/**
	 * 
	 * @param args to the main method
	 */
	
	public static void main (String[] args) {
		
		Fruit f1 = new Fruit("Apple","Good", 100);
		Fruit f2 = new Fruit("Apple","Good", 1000);
		Fruit f3 = new Fruit("Pear","Good", 640);
		Fruit f4 = new Fruit("Pear","Good", 222);
		Fruit f5 = new Fruit("Pear","Good", 100);
		Fruit f6 = new Fruit("Pineapple","Good", 1000);
		Fruit f7 = new Fruit("Tomato","Good", 10);
		Fruit f8 = new Fruit("Apple","Excellent", 100);
		
	//Create an ArrayList to store Fruit objects and follow instructions 
    // in the activity documents. 
		ArrayList<Fruit> fr = new ArrayList<Fruit>();
		
		fr.add(f1);
		fr.add(f2);
		fr.add(f3);
		fr.add(f4);
		fr.add(f5);
		fr.add(f6);
		fr.add(f7);
		fr.add(f8);
		
		System.out.println("Unsorted:");
		
		for(Fruit fru : fr) {
			
			System.out.print(fru);
		}
		
		System.out.println("");
		Collections.sort(fr);
		
		System.out.println("SORTED LIST");
		
		for(Fruit fru : fr) {
			
			System.out.print(fru);
		}
		
		
		
	}

}

/*
Unsorted:
Fruit [fruitName=Apple, fruitDesc=Good, fruitQty=100]
Fruit [fruitName=Apple, fruitDesc=Good, fruitQty=1000]
Fruit [fruitName=Pear, fruitDesc=Good, fruitQty=640]
Fruit [fruitName=Pear, fruitDesc=Good, fruitQty=222]
Fruit [fruitName=Pear, fruitDesc=Good, fruitQty=100]
Fruit [fruitName=Pineapple, fruitDesc=Good, fruitQty=1000]
Fruit [fruitName=Tomato, fruitDesc=Good, fruitQty=10]
Fruit [fruitName=Apple, fruitDesc=Excellent, fruitQty=100]

SORTED LIST
Fruit [fruitName=Apple, fruitDesc=Good, fruitQty=100]
Fruit [fruitName=Apple, fruitDesc=Excellent, fruitQty=100]
Fruit [fruitName=Apple, fruitDesc=Good, fruitQty=1000]
Fruit [fruitName=Pear, fruitDesc=Good, fruitQty=100]
Fruit [fruitName=Pear, fruitDesc=Good, fruitQty=222]
Fruit [fruitName=Pear, fruitDesc=Good, fruitQty=640]
Fruit [fruitName=Pineapple, fruitDesc=Good, fruitQty=1000]
Fruit [fruitName=Tomato, fruitDesc=Good, fruitQty=10]

*/