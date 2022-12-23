//WAP to reverse a sentence while preserving the position.
//Input : “Think Twice”
//Output : “kniht eciwt”

package Assignment3;

import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		String str1 = "";
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == ' ') {
				System.out.print(str1 + " ");
				str1 = "";
				
			}
			else
				str1 = str.charAt(i)+ str1;
		}
		System.out.print(str1);
	}

}
