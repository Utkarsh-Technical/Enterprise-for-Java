package CodingHackathon;

import java.util.*;
public class findPairs {
	
	public static int findPairs(int[] arr, int x) {
		
		int diff = 0, count=0;
		for(int i=0;i<arr.length;i++) {
			diff = x - arr[i];
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j] == diff)
					count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int arr[] = new int[len];
		for(int j=0; j<len; j++) {
			arr[j] = sc.nextInt(); 
		}
		int x = sc.nextInt();
		System.out.println(findPairs(arr,x));
	}

}
