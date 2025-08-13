package Statickeyword;

public class Animal {

	static int age = 12;
	
	static {
		System.out.println("static block");
	}
	
	static {
		System.out.println("static block -1");
	}

	public Animal () {
		System.out.println("Constructor");
	}
	
	public void getName() {
		System.out.println("I am getName Method");
	}
	
}
