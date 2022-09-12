package lab01;

import java.util.Scanner;

public class variant07 {
	
	private static Scanner scan;

	public static void main(String[] args){
		
		scan = new Scanner(System.in);
		
		ComplexNumber complex1;
		ComplexNumber complex2;
		ComplexNumber complex3;
		
		float a;
		float b;
		
		int ch = 0;
		
		//Меню
		System.out.println("Операції з комплексними числами");
		while(ch != 6){
			
			System.out.println("Що зробити?");
			System.out.println("1: Додати");
			System.out.println("2: Відняти");
			System.out.println("3: Помножити");
			System.out.println("4: Поділити");
			System.out.println("5: Знайти модуль");
			System.out.println("6: Вийти");
			
			ch = scan.nextInt();
			
			//Додавання
			if(ch == 1){
				//System.out.println("\nWhere i = (-1)^1/2,\n");
				System.out.println("Виконуємо операцію (a + bi) + (c + di)\n");
				System.out.println("Введи a: ");
				a = scan.nextFloat();
				System.out.println("Введи b: ");
				b = scan.nextFloat();
				complex1 = new ComplexNumber(a, b);
				System.out.println("Введи c: ");
				a = scan.nextFloat();
				System.out.println("Введи d: ");
				b = scan.nextFloat();
				complex2 = new ComplexNumber(a, b);
				complex3 = complex1.add(complex2);
				System.out.println("Результат: " + complex3.toString());
			}
			
			//Віднімання
			if(ch == 2){
				//System.out.println("\nWhere i = (-1)^1/2,\n");
				System.out.println("Виконуємо операцію (a + bi) - (c + di)\n");
				System.out.println("Введи a: ");
				a = scan.nextFloat();
				System.out.println("Введи b: ");
				b = scan.nextFloat();
				complex1 = new ComplexNumber(a, b);
				System.out.println("Введи c: ");
				a = scan.nextFloat();
				System.out.println("Введи d: ");
				b = scan.nextFloat();
				complex2 = new ComplexNumber(a, b);
				complex3 = complex1.subtract(complex2);
				System.out.println("Результат: " + complex3.toString());
			}
			
			//Множення
			if(ch == 3){
				//System.out.println("\nWhere i = (-1)^1/2,\n");
				System.out.println("Виконуємо операцію (a + bi)*(c + di)\n");
				System.out.println("Введи a: ");
				a = scan.nextFloat();
				System.out.println("Введи b: ");
				b = scan.nextFloat();
				complex1 = new ComplexNumber(a, b);
				System.out.println("Введи c: ");
				a = scan.nextFloat();
				System.out.println("Введи d: ");
				b = scan.nextFloat();
				complex2 = new ComplexNumber(a, b);
				complex3 = complex1.multiply(complex2);
				System.out.println("Результат: " + complex3.toString());
			}
			
			//Ділення
			if(ch == 4){
				//System.out.println("\nWhere i = (-1)^1/2,\n");
				System.out.println("Виконуємо операцію (a + bi)/(c + di)\n");
				System.out.println("Введи a: ");
				a = scan.nextFloat();
				System.out.println("Введи b: ");
				b = scan.nextFloat();
				complex1 = new ComplexNumber(a, b);
				System.out.println("Введи c: ");
				a = scan.nextFloat();
				System.out.println("Введи d: ");
				b = scan.nextFloat();
				complex2 = new ComplexNumber(a, b);
				complex3 = complex1.divide(complex2);
				System.out.println("Результат: " + complex3.toString());
			}
			
			//Модуль числа
			if(ch == 5){
				//System.out.println("\nWhere i = (-1)^1/2,\n");
				System.out.println("Виконуємо операцію |(a + bi)|");
				System.out.println("Введи a: ");
				a = (float) Math.pow(scan.nextFloat(), 2);
				System.out.println("Введи b: ");
				b = (float) Math.pow(scan.nextFloat(), 2);
				double module = (float) Math.sqrt(a + b);
				System.out.println("Результат: " + module);
			}
		}
		System.out.println("\nДо зустрічі!\n");
	}

}
