package week1.assignments;

public class Intersection {

	public static void main(String[] args) {
		int[] arr = {3,2,11,4,6,7};
		int[] num = {1,2,8,4,9,7};
		for(int i =0;i<arr.length;i++) 
		{
			for(int j=0;j<num.length;j++) {
				if (arr[i] == num[j]) {
					System.out.println(arr[i]);
				}
				
			}
		}
			
		}

	}

