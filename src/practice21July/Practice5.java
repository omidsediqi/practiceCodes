package practice21July;

public class Practice5 {

	public static void main(String[] args) {
		
		
		System.out.println(isSumEven2(20,23));

	}
	
	public static boolean isSumEven(int num1,int num2) {
		int sumOfNums = num1+num2;
		if(sumOfNums%2==0)
			return true;
		else
			return false;
	}
	public static boolean isSumEven2(int number1,int number2) {
		return number1 + number2 % 2 == 0 ? true:false;
	
	}
}

