package practice21July;

public class Practice6 {
	//group a = abcdefg = 10
	//group b = xwyzt = 20
	
	// you are given a String, for every time that one character in a group is mentioned,
	//add the value to that group
	//at the end the function should print sum of group a and b
	// example output ---- Group A: 45, Group B: 564

	public static void main(String[] args) {
		String temp = "this is a sample text xyz";
		sumOfGroups(temp);

	}
	
	
	public static void sumOfGroups(String str) {
		int sumA = 0,sumB = 0;
		for (int i =0;i< str.length(); i++) {
			if("abcdefg".contains(String.valueOf(str.charAt(i)))){
				sumA += 10;
			}else if("xwyzt".contains(""+str.charAt(i))){
					sumB += 20;
				}
			
			}
		System.out.println("Group A: "+ sumA + " Grup B: "+ sumB);
		}
		
		

}
