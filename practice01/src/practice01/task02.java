package practice01;

import java.util.Scanner;

public class task02 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		System.out.println("Ведіть ціле, позитивне число, що не перевищує 10000:");
		
		int a = scan.nextInt();
		int b = a + 1;
		
		System.out.println("The next number for the number " + a + " is " + b);

	}

}
