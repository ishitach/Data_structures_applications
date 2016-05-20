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
	
ll.delete(2);
	Node n=ll.head;
	while(n!=null){
		System.out.println(n.data);
	n=n.next;
	}
		}
	public static void delete(int position){
		Node temp=head; 
		
		
		if(position==0) {head=temp.next;return;}
		
		for(int i=0;temp!=null && i<position-1;i++) temp=temp.next;
		if(temp==null && temp.next==null) return;
		
		Node next=temp.next.next;
		temp.next =next;
			}
}
