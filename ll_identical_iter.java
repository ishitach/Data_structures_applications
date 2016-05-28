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
	ll.head =new Node(10);
	Node n2=new Node(24);
	Node n3 =new Node(56);
//	LinkedList ll1=new LinkedList();
	ll.head.next=n2;n2.next=n3;
		
	Node n6 =new Node(10);
	Node n7=new Node(24);
	Node n8 =new Node(56);
	n6.next=n7;n7.next=n8;
	// Node n=ll.head;
	// while(n!=null){
	// 	System.out.println(n.data);
	// n=n.next;
	// }
	identical(ll.head,n6);
	}
	
	public static void identical(Node a,Node b){
		
		while(a!=null && b!=null){
			if(a.data!=b.data)
			{System.out.println("not identical");
				return;}
			
			a=a.next;b=b.next;
		}
		System.out.println("identical");
	}
	
}
