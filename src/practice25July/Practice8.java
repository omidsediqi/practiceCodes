package practice25July;

public class Practice8 {

	public static void main(String[] args) {

		// you are given a string. for every number you see add 5,
		// for every alphabet add 10 and for every other character, add 15
		// at the end return the sum
		// the function take on string as input and returns on integer
		
		// example   1a$		5	+	10	+	15	=	30
		String str = "this is a test213123421 @!$*(&$!$kjbfs(qwmen<fck(*";
		System.out.println("Sum of All String is: "+countTheString(str));
		
		
	}
	
	
	// 1st Way
	public static int countTheString(String str) {
		String chars = "abcdefghijklmnopqrstuvwxyz"; //add 10
		String numbers = "1234567890"; //add 5
		int sum = 0;
		
		for (int i =0;i< str.length(); i++) {
			if(chars.contains(String.valueOf(str.charAt(i)))){
				sum += 10;
			}else if(numbers.contains(String.valueOf(str.charAt(i)))){
					sum += 5;
				}else
					sum+= 15;
			
			}
		
		return sum;
		}
	
	
	// 2nd Way
	public static int countChars(String str) {
		String chars = "abcdefghijklmnopqrstuvwxyz"; //add 10
		String numbers = "1234567890"; //add 5
		// other things add 15
		int sum=0;
		for (int i = 0; i < str.length(); i++) {
			if(chars.contains(String.valueOf(str.charAt(i)))
					|| chars.toUpperCase().contains(String.valueOf(str.charAt(i)))) {
				sum +=10;	
			}else if(numbers.contains(String.valueOf(str.charAt(i)))) {
				sum +=5;
			}else {
				sum +=15;
				
			}
			
		}
		return sum;
	}
	

}
