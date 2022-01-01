package week1.day2;

import java.util.Arrays;

public class ArrayFindSecondSmallest {

	public static void main(String[] args) {
		
		int[] num = {3,2,11,4,6,7};
		Arrays.sort(num); // 2,3,4,6,7,11
        int secondSmallest = num.length-5;
		
		System.out.println(num[secondSmallest]);

	}

}
