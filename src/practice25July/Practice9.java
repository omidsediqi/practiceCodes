package practice25July;

import java.util.HashMap;
import java.util.Map;

public class Practice9 {

	public static void main(String[] args) {
	// You are given a String, separate the words in the String and store them in the map
		// for each work, could the sum
		// the sum = for each alphabet in the word, add 5 to the sum, everything else add 10
		// the sum should go as the value of the word in the map
		// the words are separated with space
		
	// example: this is test5
		//output should be {"this": 20, "is":10, "test5":30}
		
		String str = "this is test5";
		System.out.println(sumChars(str));
		System.out.println(sumChars2(str));
		System.out.println(makeMap(str));
		
	}
	
	public static Map <String, Integer> makeMap(String str){
		HashMap<String, Integer> temp = new HashMap<String, Integer>();
		for (String word : str.split(" ")) {
			// we have to add the word to the map as key
			temp.put(word, sumChars(word));
			// we have to calculate the sum and add as value
			System.out.println(word);
			}
		return temp;	
		}	
		
			
		
	
	private static int sumChars(String str) { // 7
		int sum = 0;
		String alphabet = str.replaceAll("[^a-zA-Z]", "");
		sum += (alphabet.length()* 5);
		sum += (str.length()- alphabet.length()) * 10;
		
		return sum;
	}
	
	private static int sumChars2(String str) {
		int sum = 0;
		String chars = "abcdefghijklmnopqrstuvwxyz";
		for (int i = 0; i < str.length(); i++) {
			if(chars.contains(String.valueOf(str.charAt(i))) 
				|| chars.toUpperCase().contains(String.valueOf(str.charAt(i)))){
					sum += 5;
				}else {
					sum += 10;
			}
		}
		return sum;
	}
	
}
