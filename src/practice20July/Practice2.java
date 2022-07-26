package practice20July;

public class Practice2 {
	
	// find the sum, count,average,min and max of a given array of numbers
	

	public static void main(String[] args) {

		
		int[]numbers = {10,5,6,5,7,5,4,8,7,4,5,4,8,4,5,6,9,9,5};
		int sum = 0;
		int max = numbers[0];
		int min = numbers[0];
		int count = numbers.length;
		double avg = 0;
		
		for (int i = 0; i < numbers.length; i++) {
		sum+=numbers[i]; // sum+= numbers
		if(numbers[i]> max) {
			max = numbers[i];
		}
		if(numbers[i]< min) {
			min = numbers[i];
		}
		avg = avg /100*numbers[i];
			
		}
		avg = (double) sum/ count;
		System.out.println("Sum: "+ sum);
		System.out.println("Average: "+ avg);
		System.out.println("Max: "+ max);
		System.out.println("Min: "+ min);
		System.out.println("Count: "+ count);
		
		
	}

}
