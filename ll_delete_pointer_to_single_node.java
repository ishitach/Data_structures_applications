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
	Node n4=new Node(75);
	ll.head.next=n2;n2.next=n3; n3.next=n4;
ll.delete(n2);
	Node p=ll.head;
	 while(p!=null){
		System.out.println(p.data);
		p=p.next;
	}

	}
	public static void delete(Node node){
		Node temp=node.next;
		node.data=temp.data;
		node.next=temp.next;
		temp=null;
	}
}
