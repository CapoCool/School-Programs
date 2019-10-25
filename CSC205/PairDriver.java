package CSC205;

public class PairDriver {
	
	public static void main(String[] args) {
		
		Pair<String> myPair = new Pair<>("Mother", "Fudger");
		Pair<String> myPair2 = new Pair<>("Mother", "Fudger");
		
		System.out.println("Here is the states of each object " + "Object 1: " + myPair.toString() +
							" Object 2: " + myPair2.toString() + " " + 
				                   "\nAre the objects equal? " + myPair.equals(myPair2));
		
		Pair<Integer> myPair3 = new Pair<>(1, 2);
		myPair.setFirst("1");
		myPair.setSecond("2");
		
		System.out.println("\n\nHere is the states of each object " + "Object 1: " + myPair.toString() +
				" Object 2: " + myPair3.toString() + " " + 
	                   "\nAre the objects equal? " + myPair.equals(myPair3));
	}

}
