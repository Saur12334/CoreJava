package LadderifElse;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 1 t o 7");
		int input = sc.nextInt();
		
		if (input ==1) {
			System.out.println("Monday");
			
		}
		else if (input ==2) {
			System.out.println("Tuesday");
		}
		else if (input ==3) {
			System.out.println("Wednesday");
	}
		else if (input ==4) {
			System.out.println("Thursday");
			
}
		else if (input ==5) {
			System.out.println("Friday");
		}
			else if (input ==6) {
				System.out.println("Saturaday");
				
			}else if (input ==7) {
				System.out.println("Sunday");
				
				
			} else {
				System.out.println("Invalid Input");
			}
	}
}