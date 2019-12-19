package hashing;

/* Dillan Poorman
 * 12/07/2019
 * CSC205
 * Dictionary.java tester
 * It took 101689023ns to populate the HashMap with 351050 values out of a total process time of 338534099ns.
[hello] is a word.
It took 85163864ns to populate the HashMap with 351050 values out of a total process time of 348703300ns.
[boolean] is a word.
It took 87710288ns to populate the HashMap with 351050 values out of a total process time of 337466100ns.
[butttaare] is nota word.


 * 
 */
public class WordChecker {

	public static void main(String[] args) {
		
		String testWord = "butttaare";
		boolean isAWord = Dictionary.contains(testWord);
		
		System.out.println("[" + testWord + "]" + (isAWord ? " is " : " is not") + "a word.");

	}

}