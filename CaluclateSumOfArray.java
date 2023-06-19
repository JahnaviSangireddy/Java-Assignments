package ArrayAssignment;

public class CaluclateSumOfArray {

	public static void main(String[] args) {
		
		int nums[] = { 3,7,5,4,1};
		int sum=0;
		
		for (int i : nums) {
			
			sum = sum+i;
		}
		
		System.out.println("Sum of all elements in nums :"+sum);

	}

}

