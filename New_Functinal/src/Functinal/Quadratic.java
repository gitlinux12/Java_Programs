package Functinal;
import java.util.*;
public class Quadratic {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			System.out.println("enter a ");
			int a = scanner.nextInt();
			System.out.println("enter b");
			int b = scanner.nextInt();
			System.out.println("enter c");
			int c = scanner.nextInt();
			int delta = Math.abs(b * b - 4 * a * c);
			double x1 = (-b + Math.pow(delta, 1 / 2)) / (2 * a);
			double x2 = (-b - Math.pow(delta, 1 / 2)) / (2 * a);
			System.out.println("Root of X1  : " +x1);
			System.out.println("Root of X2  : " +x2);
scanner.close();
}

}
