package practice01;

import java.util.Scanner;

public class task01 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		System.out.println("Ведіть два цілих, позитивних числа, що не перевищують 1000:");
		
		int a, b;
		
		a = scan.nextInt();
	    b = scan.nextInt();
	    
	    System.out.println (Math.sqrt(square(a) + square(b)));
	}
	
	
	static int square(int a) {
		int result = a*a;
		return result;
	}
	
}
