package practice002;

import java.util.Scanner;

public class task04 {
	
	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		System.out.println("Введіть ціле число:");
		int a = scan.nextInt();
		
		if (a <=10 && a>=0) {
			System.out.println("Позитивне число менше 10 або нуль");
		} else {
			System.out.println("Позитивне число більше 10 або негативне");
		}

	}

}
