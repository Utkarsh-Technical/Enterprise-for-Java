// Special Characters(32–47 / 58–64 / 91–96 / 123–126): 
// WAP to count number of special characters.

package Assignment3;

import java.util.Scanner;

public class q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		int count=0;
		for(int i=0; i<str.length(); i++) {
			int x = (int)str.charAt(i);
			if(x>=32 && x<=47 || x>=58 && x<=64 || x>=91 && x<=96 || x>=123 && x<=126)
				count++;
		}
		System.out.println("Special Count :" + count);
		
	}

}
