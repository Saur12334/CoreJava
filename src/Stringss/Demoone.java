package Stringss;

public class Demoone {

	public static void main(String[] args) {
		// String is immutable in java
		
		String s = "irise";
		System.out.println(System.identityHashCode(s));  // point to lower i rise
		
		s = s.toUpperCase();
		System.out.println(System.identityHashCode(s));

		s = s.toLowerCase();
		System.out.println(System.identityHashCode(s));
		
		System.out.println(s);
		
	}

}
