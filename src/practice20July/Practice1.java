package practice20July;

import java.util.HashMap;

public class Practice1 {

	// this is a test
	// develop a function that would count the number of each character in a
	// given string

	// develop a function that takes the output of the first function
	// and return separate the characters with counts odd / even
	public static void main(String[] args) {

		String temp = "this is a test let is do this";
		charCount(temp);
	}

	public static void charCount(String str) {
		HashMap<Character, Integer> chars = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			if (chars.containsKey(str.charAt(i))) {
				//true - increase the count
				int newCount = chars.get(str.charAt(i)) + 1;
				chars.put(str.charAt(i), newCount);
			} else {
				//false - add the character to the map / count 1
				chars.put(str.charAt(i),1);
			}
		}
		System.out.println(chars);
	}
}
