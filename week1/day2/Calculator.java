package week1.day2;

public class Calculator {

	public int add (int num1, int num2) {
		return num1+num2;
	}
	
	public double sub (double num1, double num2) {
		return num1-num2;
	}
	public int mul (int num1, int num2) {
		return num1*num2;
	}
	public int div (int num1, int num2) {
		return num1/num2;
	}
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int add = calc.add(10,20);
		double sub = calc.sub(20.5,10.3);
		int mul = calc.mul(10,20);
		int div = calc.div(20,10);
		
		System.out.println(+ add);
		System.out.println(+ sub);
		System.out.println(+ mul);
		System.out.println(+ div);
}
}
