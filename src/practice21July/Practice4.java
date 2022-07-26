package practice21July;

public class Practice4 {

	public static void main(String[] args) {

//		String vowel = "afghanistan";
//		int vowelCount = 0;
//		for (int i = 0; i < vowel.length(); i++) {
//			if (vowel.charAt(i) == 'a' || vowel.charAt(i) == 'e' || vowel.charAt(i) == 'i' || vowel.charAt(i) == 'o'
//					|| vowel.charAt(i) == 'u') {
//
//				vowelCount++;
//
//			}
//
//		}
//		System.out.println("Total vowel is " + vowelCount);
		
		String sentence = "Afghanistan";
		System.out.println(vowels(sentence));
		System.out.println(countVowel(sentence));
		
	}
// one way with for loop
	public static int countVowel(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if ("aeiouAEIOU".contains(""+str.charAt(i))) 
 {
				count++;
			}
		}
		return count;
	}
// second way with for each loop
	public static int vowels (String sen) {
		int counts = 0;
		for (char c: sen.toCharArray()) {
			if("aeiouAEIOU".contains(""+c)) {
				counts++;
			}
			
		}
		return counts;
	}
}
