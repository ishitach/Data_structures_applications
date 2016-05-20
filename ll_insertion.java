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
	
	ll.head.next=n2;n2.next=n3;
	
	//at the front 
	add1(6);
		// in the middle 
	add2(n2,7);
		//at the end 
	add3(78);
	Node n=ll.head;
	while(n!=null){
		System.out.println(n.data);
	n=n.next;
	}
	
	}
	public static void add1(int data){
		//ll.head.data=data;
		Node new_node=new Node(data);
		new_node.next=head;
		head=new_node;
	}
	public static void add2(Node prev_node, int data  ){
	
	if(prev_node==null)	 System.out.println("Previous node can't be null");
	Node new_node=new Node(data)	;
	new_node.next=prev_node.next;
	prev_node.next=new_node;
	
	}
	public static void add3(int data){
		Node new_node=new Node(data);
	Node	last=head;
		while(last.next!=null) last=last.next;
		last.next=new_node;
		new_node.next=null;
	}
}
