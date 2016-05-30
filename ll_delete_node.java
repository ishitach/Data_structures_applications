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
	Node n2=new Node(8);
	Node n3 =new Node(6);
	
	Node n4=new Node(3);
	Node n5=new Node(7);
	Node n6=new Node(9);
	
	ll.head.next=n2;n2.next=n3; n3.next=n4;//n4.next=n2;
	n4.next=n5;n5.next=n6;
	delete(ll.head,n4);
	Node n=ll.head;

while(n!=null){
		System.out.println(n.data);
	n=n.next;
	}
	
		}
	public static void delete(Node n, Node x){
		if(n==x){//when the node is head node 
			n.data=n.next.data;
			x=n.next;
			n.next=n.next.next; System.gc(); return;
		}
		//System.out.println("HI");
		Node p=n;
		while(p.next!=null && p.next!=x) p=p.next;
		p.next=p.next.next; System.gc();
		return;
	}
}
