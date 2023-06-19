package ArrayAssignment;

import java.util.Scanner;

public class FindIndexOfElm {

	public static void main(String[] args) {
		
		int nums[] = { 3,7,5,4,1};
		
		System.out.println("Enter the elment to find index");
		Scanner scan = new Scanner(System.in);
		int elm = scan.nextInt();
		for(int i=0;i<nums.length;i++) {
			if(nums[i] == elm) {
				System.out.println("Index of "+elm+" is :"+i);
			}
		}
		
		

	}

}
