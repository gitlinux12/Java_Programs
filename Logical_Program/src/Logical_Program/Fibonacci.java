package Logical_Program;
import java.util.*;
public class Fibonacci {
	
	public static void main(String[] args) {
		System.out.println(" Febonacci Series Program");

		System.out.print("Enter number: ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if (number < 0) {
			number = -number;
		}
		
		System.out.println("You enterd "+number);
		
		int number1 = 0;
		int number2 = 1;
		if (number >= 1) System.out.println(number1);
		if (number >= 2) System.out.println(number2);
		
		int sum;
		while (number > 2) {
			sum = number1 + number2;
			number1 = number2;
			number2 = sum;
			System.out.println(sum);
			number--;
		}
		
		scanner.close();
	}

}
