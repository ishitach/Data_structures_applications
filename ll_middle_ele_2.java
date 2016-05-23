/* package whatever; // don't place package name! */

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
	ll.head =new Node(1);
	Node n2=new Node(24);
	Node n3 =new Node(56);
	Node n4=new Node(5);
	ll.head.next=n2;n2.next=n3; n3.next=n4;
	//ll.find(1);
	Node n=ll.head;
	while(n!=null){
		System.out.println(n.data);
	n=n.next;
	}
	Node a=head; Node b=head;
	while(b!=null && b.next!=null){
		a=a.next;b=b.next.next;
	}
	System.out.println(a.data);
	
	}
	
}
