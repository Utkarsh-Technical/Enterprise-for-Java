package Pattern;

import java.util.Scanner;

public class rombus {

	static void emptyRombus(int n) {
		for(int i=0; i<n ; i++) {
			for(int j=0; j<n ;j++) {
				if(i==0 || j==0 || j==n-1 || i==n-1 || (i+j)<=(n-1)/2 || (j-i >=(n-1)/2) || i-j >=(n-1)/2  || i+j>=(n-1+n/2))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	static void fillRombus(int n) {
		for(int i=0; i<n ; i++) {
			for(int j=0; j<n ;j++) {
				if(i==0 || j==0 || j==n-1 || i==n-1 || (i+j)>=(n-1)/2 || (j-i <=(n-1)/2) || i-j <=(n-1)/2  || i+j<=(n-1+n/2))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		emptyRombus(n);
		System.out.println();
		fillRombus(n);
	}

}
