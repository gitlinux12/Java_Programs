package Functinal;
import java.util.*;

public class TwoDArray {
	public static void main(String[] args) {
		System.out.println("2 D Array Program");
		
		Scanner scanner = new Scanner(System.in);
		int M = 0;
		System.out.println("Enter No. Of Rows :");
		M=scanner.nextInt();
		
		int N = 0;
		System.out.println("Enter No. Of Columns :");
		N=scanner.nextInt();
		
		System.out.println("You Have to enter "+M+" * "+N+" matrix");

		int[][] array=new int[M][N];
		// Read Values for array
	
		System.out.println("Enter values of array");
		for (int m = 0;m < M; m++) {
			for (int n = 0; n < N; n++) {
				System.out.println("Enter Value For "+m+" * "+n+" :");
				array[m][n]=scanner.nextInt();
			}
		}
		
		for (int m = 0;m < M; m++) {
			for (int n = 0; n < N; n++) {
				System.out.print(array[m][n]+"\t");
			}
			System.out.println("");
		}
	}

}
