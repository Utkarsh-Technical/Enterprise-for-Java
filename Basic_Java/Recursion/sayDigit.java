package Recursion;
import java.util.*;
public class sayDigit {

	public static void sayDigit1(int n) {
		String arr[]= {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
		if(n<=0)
			return ;
		int idx = n%10;
		sayDigit1(n/10);
		System.out.print(arr[idx]+ " ");
	}

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		var sc = new Scanner(System.in)) {
			int number = sc.nextInt();
			sayDigit1(number);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
