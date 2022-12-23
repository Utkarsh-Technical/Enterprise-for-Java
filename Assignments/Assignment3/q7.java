// WAP to count the number of Vowels and Consonants of a String value.

package Assignment3;

import java.util.Scanner;

public class q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int vowel=0, constant=0;
		sc.close();
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e'	 || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
				vowel++;
			else
				constant++;
		}
		System.out.println("Vowels Count : " + vowel+"\n"+"Constant Count : "+constant);
	}

}
