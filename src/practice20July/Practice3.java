package practice20July;

public class Practice3 {
	
	//find out if the given string is palindrome
	
	
	

	public static void main(String[] args) {

//		String str = "dad";
//		String reverse = "";
//		
//		for(int i=str.length()-1;i>=0;i--) {
//			reverse = reverse+str.charAt(i);
//	
//		}
//		if(str.equals(reverse)) {
//			System.out.println(str+" is Palindrome");
//		}else
//			System.out.println(str+ " is not Palindrome");
		String str = "mom";
		System.out.println(isPalindrome(str));

	}
	
	public static boolean isPalindrome(String str) {
		String reverse = "";
		for(int i = str.length()-1; i>=0;i--) {
			reverse = reverse+str.charAt(i);
			
		}
		
			if(str.equals(reverse)) {
				return true;
				
			}
			
			else {
		
				return false;
			}	
	}
	
}

