package LinkedList;


import java.util.*;

public class inputLinkedList {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		Node prev = new Node(x);
        Node head = new Node(0);
		head.next = prev;
		
		
		while(--n > 0) {
			int temp = sc.nextInt();
			Node curr = new Node(temp);
			prev.next = curr;
			prev = prev.next;
		}
		sc.close();
		Node traverse = head.next;
        while(traverse != null) {
			System.out.println("Node Value : "+ traverse.data + "\tNode memory : " + traverse.next + "\tMy Address : "+traverse);
			traverse = traverse.next;
		}
	}
}

 class Node
	{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}
	

