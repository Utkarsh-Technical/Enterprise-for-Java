package Pattern;
import java.util.*;
public class crossSquare {

	static void cornerStarts(int n) {
		for(int i=0;i<n;i++) {
			for(int j = 0 ;j<n;j++) {
				if((i==0 && j>0 &&j< n-1)||(j==0 && i>0 && i<n-1) || (i==n-1 && j>0 && j<n-1)|| (j==(n-1) && i>0 && i<n-1))
					System.out.print("*");
				else
					System.out.print(" ");
				}
				System.out.println();
			}
		}
	
	static void properSquare(int n) {
		for(int  i =0 ;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0||j==0||j==(n-1)||i==(n-1))
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
		properSquare(n);
		cornerStarts(n);
	}
}
