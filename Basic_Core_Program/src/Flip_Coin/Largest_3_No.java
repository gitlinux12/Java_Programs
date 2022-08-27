package Flip_Coin;
import  java.util.*;

public class Largest_3_No {
	public static void main(String[] args) {
		int a, b, c, largest; 
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter the first number:");  
		a = scanner.nextInt();  
		System.out.println("Enter the second number:");  
		b = scanner.nextInt();  
		System.out.println("Enter the third number:");  
		c = scanner.nextInt();  
		largest = c > (a > b ? a : b) ? c : ((a > b) ? a : b);  
		System.out.println("The largest number is: "+largest);  
		scanner.close();
		}  

}
