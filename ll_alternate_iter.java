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
Node n4=new Node(78);Node n5=new Node(90);
	ll.head.next=n2;n2.next=n3;n3.next=n4;n4.next=n5;
	ll.alternate();
	Node n=ll.head;
	while(n!=null){
		System.out.println(n.data);
	n=n.next;
	}
	
	}
	public static void alternate(){
		if(head==null) return;
		Node temp=head;Node temp1=head.next;
		while(temp!=null && temp1!=null){
			
			temp.next=temp1.next;
			temp1=null;
			temp=temp.next;
			if(temp!=null)
			temp1=temp.next;
		}
	}
}
