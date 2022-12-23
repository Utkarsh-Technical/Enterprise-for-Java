package Assignment3;

import java.util.*;
import java.util.Scanner;

// String is Anagram or not.-> An anagram of a string is 
// another string that contains the same characters, only the order of characters can be different.
public class q3 {

	public static boolean anagram(char str1[], char str2[]) {
		if(str1.length != str2.length)
			return false;
		
		Arrays.sort(str1);
		Arrays.sort(str2);
		for(int i=0; i<str1.length; i++) {
			if(str1[i] != str2[i])
				return false;
		}
		return true;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String str1 = sc.next();
		sc.close();
		char str3[] = (str).toCharArray();
        char str4[] = (str1).toCharArray();
		if(anagram(str3,str4)) {
			System.out.println(str+" & "+ str1+" are an anagram");
		}
		else {
			System.out.println(str+" & "+ str1+" not an anagram");
		}
	}

}
