package Pattern;

import java.util.Scanner;

public class hash {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0; i<n;i++) {
			for(int space =0;space<(n-i);space++) {
				System.out.print(" ");
			}
			for(int hash =0; hash <=(i-1); hash++) {
				System.out.print("#");
			}
			System.out.print("*");
			for(int hash =0; hash <=(i-1); hash++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
}
