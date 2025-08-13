package scanner;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value of a : ");
		int a = sc.nextInt();
		System.out.println("Value of a " +a);		
				
		System.out.println("Enter value of b : ");
		int b = sc.nextInt();
		System.out.println("Value of b " +b);
		
		System.out.println("Enter value of e : ");
		int e = sc.nextInt();
		System.out.println("Value of e " +e);	
		
		System.out.println("Enter value of d : ");
		int d = sc.nextInt();
		System.out.println("Value of d " +d);
				
		
	    Calculator c = new Calculator();
	    c.printSum(a, b);
	    c.printMinus(e, d);
	}
	
	public void printSum(int a, int b) {
		int sum = a+b;
    System.out.println("Addition is: "+sum);
    
	} 
	public void printMinus(int e, int d) {
		int sum = e-d;
    System.out.println("Subtraction is: "+sum);
	}
}
