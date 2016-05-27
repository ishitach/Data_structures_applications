
/* package whatever; // don't place package name! */
import java.io.*;
/* Name of the class has to be "Main" only if the class is public. */
class LinkedList
{ static Node head;
 static class Node{
	int data;
	Node next;
		Node(int d) {
			data=d;next=null;
	}
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	//	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	LinkedList ll =new	LinkedList();
	ll.head =new Node(11);
	Node n2=new Node(5);
	Node n3 =new Node(12);
	Node n4=new Node(2);
	Node n6=new Node(12);
	Node n5=new Node(5);
	ll.head.next=n2;n2.next=n3;n3.next=n4;n4.next=n6;
	n6.next=n5;
	
ll.removedup(ll.head);
	Node n=ll.head;
	while(n!=null){
		System.out.println(n.data);
	n=n.next;
	}
}

public static void removedup(Node n){
	Node p=n;Node q=null;Node dup=null;
	while(p!=null && p.next!=null){
		q=p;
		while(q.next!=null){
			if(p.data==q.next.data)
			{dup=q.next;
			q.next=q.next.next;
			System.gc();}
			else q=q.next;
			
		}
		p=p.next;
	}
}
	
	}
