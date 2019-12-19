package generics_and_collections;
/*
 * Dillan Poorman
 * CSC205
 * 10/25/2019
 * Driver Class 
 */
public class BagTester {
	
	public static void main(String[] args) {
		
		MyBag<Integer> bag1 = new MyBag<>();
		MyBag<String> bag2 = new MyBag<>();
		bag1.add(1);
		bag1.add(2);
		bag1.add(3);
		bag1.add(4);
		bag1.add(5);
		
		bag1.displayArray();
		
		System.out.println();
		
		bag2.add("Condoms");
		bag2.add("Book on how to use condoms");
		bag2.add("More Condoms");
		bag2.add("Candy Wrapper");
		bag2.add("Laptop");
		bag2.add("Book on how to read called \"Irony\"");
		
		bag2.displayArray();
	}

}
