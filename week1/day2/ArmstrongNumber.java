package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
			int input = 153; // (1*1*1)+(5*5*5)+(3*3*3) -> 153
			int orgNum = input;
			int sum = 0;
			
			while (input > 0) {
				int rem = input % 10;
				
				sum = sum + (rem*rem*rem);
				
				input  = input /10;
			}
			if(sum == orgNum) {
				System.out.println("Given number is Armstrong");
			}else {
				System.out.println("Given number is not Armstrong");
				
	}

}
	
}
