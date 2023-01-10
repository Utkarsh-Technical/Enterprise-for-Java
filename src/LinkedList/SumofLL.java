package LinkedList;

import java.util.*;

public class SumofLL {

	public static void add(Node head) {
		Node traverse = head.next;
		int sum = 0;
		while(traverse != null) {
			sum += traverse.data;
			//System.out.println(sum);
			traverse = traverse.next;
		}
		System.out.println("Sum of Linked List " + sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of Linked List");
		int len = sc.nextInt();
		Node head = new Node(0);
		int x = sc.nextInt();
		Node prev = new Node(x);
		head.next = prev;
		while(--len>0) {
			x = sc.nextInt();
			Node curr = new Node(x);
			prev.next = curr;
			prev = prev.next;
		}
		sc.close();
		add(head);
	}
}

