package practice002;

import java.util.Scanner;

public class task02 {
	
	private static Scanner scan;

	public static void main(String[] args) {
		
		System.out.println(sum());
		System.out.println(subt());
		System.out.println(mult());
		System.out.println(div());
		
	}
	
	
	static int sum() {
		
		scan = new Scanner(System.in);
		System.out.println("Для розрахунку суми введіть перше ціле число:");
		int a = scan.nextInt();
		
		scan = new Scanner(System.in);
		System.out.println("Введіть друге ціле число:");
		int b = scan.nextInt();
		
		return a+b;
		
	}
	
	static int subt() {
		
		scan = new Scanner(System.in);
		System.out.println("Для розрахунку різниці введіть перше ціле число:");
		int a = scan.nextInt();
		
		scan = new Scanner(System.in);
		System.out.println("Введіть друге ціле число:");
		int b = scan.nextInt();
		
		return a-b;
		
	}
	
	static int mult() {
		
		scan = new Scanner(System.in);
		System.out.println("Для розрахунку твору введіть перше ціле число:");
		int a = scan.nextInt();
		
		scan = new Scanner(System.in);
		System.out.println("Введіть друге ціле число:");
		int b = scan.nextInt();
		
		return a*b;
		
	}
	
	static int div() {
		
		scan = new Scanner(System.in);
		System.out.println("Для розрахунку ділення введіть перше ціле число:");
		int a = scan.nextInt();
		
		scan = new Scanner(System.in);
		System.out.println("Введіть друге ціле число:");
		int b = scan.nextInt();
		
		return a/b;
		
	}

}
