package LinkedList;
import java.util.*;


public class insertion {
	// 1 -> 2 -> 3 -> 4 -> 5 -> null
	// Data = 10 :: pos = 5
	public static Node insertValue(int data , int pos, Node head) {
		Node insert = new Node(data);
		Node cur = head;
		int currPos = 1;
		while(cur != null &&  pos>currPos+1) {
			cur = cur.next;
			currPos++;
		}
		insert.next = cur.next;
		cur.next = insert;
		return head;
	}
	public static void printlist(Node head) {
		Node cur = head;
		while(cur != null) {
			System.out.println(cur.data +"  "+cur.next);
			cur = cur.next;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Length of Linked List
		System.out.println("Enter the length of Linked List: ");
		int len = sc.nextInt();
		//First Node of Linked List
		System.out.println("Enter the data for Linked List: ");
		int d = sc.nextInt();
		Node prev = new Node(d);
		// Head of the Linked List
		Node head = prev;
		while(--len > 0) {
			d = sc.nextInt();
			Node curr = new Node(d);
			prev.next = curr;
			prev = prev.next;
		}
		// Inserted Value
		System.out.println("Enter the value to be Inserted: ");
		int insertedValue = sc.nextInt();
		// At what to be Position searched
		System.out.println("Enter the position to be Inserted: ");
		int pos = sc.nextInt();
		sc.close();
		head = insertValue(insertedValue,pos,head);
		printlist(head);
	}
}
