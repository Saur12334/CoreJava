package scanner;

import java.util.Scanner;

public class MathematicalCalculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value of a: ");
		byte a = sc.nextByte();
		System.out.println("Value of a :"+a);
		
		System.out.println("Enter value of b: ");
		byte b = sc.nextByte();
		System.out.println("Value of b:"+b);
		
		
		System.out.println("Enter value of c: ");
		byte c = sc.nextByte();
		System.out.println("Value of c :"+c);
		
		System.out.println("Enter value of d: ");
		byte d = sc.nextByte();
		System.out.println("Value of d:"+d);
		
		MathematicalCalculation mc = new MathematicalCalculation();
		mc.PrintSub(a,b);
		mc.PrintMul(c,d);
	}
	public void PrintSub(byte a, byte b) {
		byte sum = (byte) (a/b);
	    System.out.println("subtraction is: "+sum);
		
	}
	
	public void PrintMul(byte c, byte d) {
		byte sum = (byte) (c*d);
	    System.out.println("Multiplication is: "+sum);
		
	}


}
