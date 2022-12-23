// WAP to reverse a String.
// Input: “iNeuron”
// Output: “norueNi”

package Assignment3;
import java.util.*;
public class q1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		String str1 = "";
		for(int i=0; i<str.length(); i++) {
			str1 =  str.charAt(i) + str1;
		}
		System.out.println(str1);
	}

}
