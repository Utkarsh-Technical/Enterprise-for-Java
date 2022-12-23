package Collections;

import java.util.*;
public class alternatePrime {

	static boolean isPrime(int num)
    {
        for(int i=2; i<num; i++){
            if (num % i == 0)
                return false;
        }
        return true;
    }
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        System.out.print("Enter a number : ");
	        int num = scan.nextInt();
	        System.out.println("The alternate prime numbers within "+num+" are :");
	        scan.close();
	        int cycle = 2;
	        for(int i=2; i<=num; i++)
	        {
	            if(isPrime(i))
	            {
	                if(cycle%2==0)
	                    System.out.print(i+" ");
	                cycle++;
	            }
	        }
	}
}
