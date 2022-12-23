package Assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class q6 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char ch[] = str.toLowerCase().toCharArray();
		sc.close();
		Arrays.sort(ch);
		for(int i=0; i<ch.length; i++) {
			System.out.print(ch[i]);
		}
	}
	
}
