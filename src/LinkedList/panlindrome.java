package LinkedList;

import java.util.*;

public class panlindrome {
	
	public static Node reverse(Node head) {
		Node prev = null;
		Node curr = head;
		Node next = curr.next;
		curr.next = prev;
		prev = curr;
		curr = next;
		next = next.next;
		while(curr != null) {
			curr.next = prev;
			prev = curr;
			curr = next;
			next = next.next;
		}
		return curr;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int temp = sc.nextInt();
		Node prev = new Node(temp);
		Node head = prev;
		while(--len > 0){
			temp = sc.nextInt();
			Node curr = new Node(temp);
			prev.next = curr;
		}
		sc.close();
		Node l2 = reverse(head);
		System.out.println(l2.data);
	}
}
