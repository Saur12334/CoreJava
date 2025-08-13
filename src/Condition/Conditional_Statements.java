package Condition;

public class Conditional_Statements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// find if it is even or odd. If it is even then it is divisible by 10 or not
		
		int a = 44;
		 
		if(a % 2 == 0) {
			System.out.println("it is even number");
		
		if (a % 10 == 0) {
			System.out.println("Number is divisible by 10");
		}
		else {
			System.out.println("it is not divisible by 10");
		}
		}
		else {
			System.out.println("it is odd number");
		}
		
	}

}
