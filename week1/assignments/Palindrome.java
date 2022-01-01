package week1.assignments;

public class Palindrome {

	public static void main(String[] args) {
		
		int num = 34343;
		int rem = 0 ;
		int temp = num ;
		while(num>0){
			int rev = num%10 ;
		        rem = rem*10 + rev ;
			num = num / 10 ;
			
		}
		if (temp==num) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
	}
			
		

	

}

