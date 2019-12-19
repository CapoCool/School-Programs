package hashing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* Dillan Poorman
 * 12/07/2019
 * CSC205
 * Dictionary Class that stores dictionary words into hash map with the same words as the key 
 */

public class Dictionary {
	
	/**
	 * Map interface is used to define dictionary hashmap
	 */
	private static Map<String, String> dictionary;
	
	static {
		try {
			dictionary = getDictionary(); 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//This method is creating the hashmap of words
	//It also calculates the time to create a hashmap
	//Use System.nanaoTime() method to get the start and end
	//time
	
	/**
	 * 
	 * @return a map with both keys and values as string
	 * @throws IOException
	 */
	private static Map<String, String> getDictionary() throws IOException {
		
		Map<String, String> wordList = new HashMap<>();
		String fileName = "C:\\Users\\Dillan\\eclipse-workspace\\hgjf\\src\\hashing\\dictionary.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(fileName));
				Scanner reader = new Scanner(br);) {
			//get the start time as a long variable 
			long start = System.nanoTime();
			
			long insertTime = 0;
			
			while(reader.hasNext()) {
				
				String word = reader.next();
				//get the time when insertion start for a word
				
				long insertStart = System.nanoTime();
				//put the key and word into the hashmap
				//Here our key is the same as the word
				//public V put(K key,  V value)
				wordList.put(word, word);
				
				//get the insetStop time
				long insertStop = System.nanoTime();
				
				//calculate the total insertion time
				insertTime += insertStop - insertStart; 
			}
			
			long stop = System.nanoTime();
			
			StringBuilder builder = new StringBuilder();
			builder.append("It took ");
			//display total insertion time
			builder.append(insertTime);
			builder.append("ns to populate the HashMap with ");
			builder.append(wordList.size());
			builder.append(" values out of a total process time of ");
			
			//append the total time, by subtracting the start from stop
			long totalTime = stop - start;
			builder.append(totalTime);
			builder.append("ns.");
			System.out.println(builder);
			
		}
		
		return wordList;
		
	}
	
	public static boolean contains(String key) {
		return dictionary.containsKey(key.toLowerCase());
	}

}
