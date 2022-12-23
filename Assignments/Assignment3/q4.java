package Assignment3;

import java.util.Scanner;

//  String is a Pangram or not.-> A string is a pangram string if it contains all 
//  the character of the alphabets ignoring the case of the alphabets.
public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char arr[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		String str = sc.nextLine();
		char st1[] = str.toCharArray();
		sc.close();
		int count =0,flag =0;
		for(int i=0; i<arr.length; i++) {
			count =0; flag=0;
			for(int j=0; j<st1.length; j++) {
				if(arr[i] == st1[j]) {
					count++;
					break;
				}
			}
			if(count == 0) {
				flag =1;
				System.out.println("Not a Pangram");
				break;
			}
		}
		if(flag == 0)
			System.out.println("It is a Pangram");;
	}
}
