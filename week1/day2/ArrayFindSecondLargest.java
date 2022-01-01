package week1.day2;

import java.util.Arrays;

public class ArrayFindSecondLargest {

	public static void main(String[] args) {
		
		int [] num = {3,2,11,4,6,7}; // 0,1,2,3,4,5
		Arrays.sort(num); //2,3,4,6,7,11
		int secondLargest = num.length-2;
		
		System.out.println(num[secondLargest]);
		

  }
}