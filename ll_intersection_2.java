/* package whatever; // don't place package name! */
//using difference in length of linked list 
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
	ll.head =new Node(3);
	Node n2=new Node(6);
	Node n3 =new Node(9);
	Node n4=new Node(15);
	Node n6=new Node(30);
	Node n5=new Node(10);
	ll.head.next=n2;n2.next=n3;n3.next=n4;n4.next=n6;
	n5.next=n4;n5.next.next=n6;
	// Node n=ll.head;
	// while(n!=null){
	// 	System.out.println(n.data);
	// n=n.next;
	// }
int c1= count (ll.head);
 int c2=count(n5);
  int d=Math.abs(c1-c2);
	Node n=ll.head;
	for(int i=0;i<d;i++){
		n=n.next;
	}
	
	p:{while(n!=null || n5!=null){
		if(n==n5){
			System.out.println(n.data);
			break p;
		}
		n=n.next;n5=n5.next;
	}}
	}
	public static int count(Node n){
		
		int count1 =0;
		while(n!=null){
			count1++;n=n.next;
		}
		return count1;
	}
}
