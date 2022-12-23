package CodingHackathon;
import java.util.*;
public class linearSearch {
	
	public static int linearSearch(int ele[], int x, int i)
	{
		if(i>= ele.length)
			return -1;
		if(ele[i] == x)
			return i;
		
		return linearSearch(ele,x,i+1);
		
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int arr[] = new int[len];
		for(int j=0; j<len; j++) {
			arr[j] = sc.nextInt(); 
		}
		System.out.println("Enter the Search Element");
		int x = sc.nextInt();
		
		int result = linearSearch(arr,x,0);
		
		if(result>=0)
			System.out.println("Element Found at index: "+ (result+1));
		else
			System.out.println("Not Found");
			
	}

}
