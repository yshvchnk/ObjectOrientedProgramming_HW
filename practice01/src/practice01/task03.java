package practice01;

import java.util.Scanner;

public class task03 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Ведіть кількість школярів:");
		int n = scan.nextInt();
		
		System.out.println("Ведіть кількість яблук:");
		int k = scan.nextInt();
		
		int a = k / n;
		
		System.out.println(a);
	}

}
