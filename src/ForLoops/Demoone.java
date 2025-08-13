
// 1. Write a program to print all natural numbers from 1 to n (n is a user input).

package ForLoops;

import java.util.Scanner;

public class Demoone {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//  Taking input from user 
		System.out.println("Enter a number (n) + ");
        int n = sc.nextInt();
        
        System.out.println("Natural numbers from 1 to "+n+";");
        
        // using a for loop to print numbers from 1 to n
        for (int i = 1; i<=n; i++ ) {
        	System.out.println(i+ "");
        }
        sc.close();
	}
	

}
