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
	ll.swap(56,24);
	Node n=ll.head;
	while(n!=null){
		System.out.println(n.data);
	n=n.next;
	}
	
	}
	
	public static void swap(int x, int y){
		if(x==y) return;
		Node prev_x=null;Node curr_x=head;
		while(curr_x!=null && curr_x.data!=x){
			prev_x=curr_x;
			curr_x=curr_x.next;
		}
		
		Node prev_y=null; Node curr_y=head;
		while(curr_y!=null && curr_y.data!=y){
			prev_y=curr_y;
			curr_y=curr_y.next;
		}
		
		if(prev_x!=null) prev_x.next=curr_y;
		else head=curr_y;
		if(prev_y!=null) prev_y.next=curr_x;
		else head=curr_x;
		Node temp=curr_x.next;
		curr_x.next=curr_y.next;
		curr_y.next=temp;
	}
}
