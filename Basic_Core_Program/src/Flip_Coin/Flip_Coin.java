package Flip_Coin;
import java.util.*;

public class Flip_Coin {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Scanner->class, scanner-> type object
		System.out.println("Enter the number to flip coin = ");
		int numberOfTimes = scanner.nextInt();
		int tail=0;
		int head=0;
		
		if (numberOfTimes >0) {
			for (int i = 0; i < numberOfTimes; i++) {
				double value = Math.random();
				if (value < 0.5) {
					tail++;
				}else {
					head++;
				}
			}
			double percentageOffHead = (head*100)/numberOfTimes;
			double percentageOfTails = (tail*100)/numberOfTimes;
			System.out.println("Head Count = " +head);
			System.out.println("Tail Count = "+tail);
			System.out.println(percentageOffHead);
			System.out.println(percentageOfTails);
			
			}
	}

}
