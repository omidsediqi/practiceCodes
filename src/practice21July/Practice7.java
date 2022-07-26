package practice21July;

import java.util.HashMap;
import java.util.Map;

public class Practice7 {
	
	//count the number of occurance of each character in a geven String
	
	

	public static void main(String[] args) {
		String str = "this is a test";
		System.out.println(countChars(str));

	}
	
	public static Map<Character, Integer> countChars(String str){
		Map<Character , Integer> chars = new HashMap<Character , Integer>();
		for (int i = 0; i < str.length(); i++) {
			if(chars.containsKey(str.charAt(i))) {
				// we aleady have the char, increase the count
				chars.put(str.charAt(i), chars.get(str.charAt(i))+1);
			}else {
				// first time that we see the char, add it , count 1
				chars.put(str.charAt(i), 1);
			}
			
		}
		return chars;
	}

}
