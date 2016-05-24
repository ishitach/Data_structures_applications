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
	ll.head.next=n2;n2.next=n3; n3.next=n4;n4.next=n2;
	
	Node n=ll.head;
	for(int i=0;i<5;i++){
		System.out.println(n.data);
	n=n.next;
	}
	ll.findloop(head);
		}
	public static void findloop(Node node){
		Node slow=node; Node fast=node;
		while(slow!=null && fast!=null && fast.next!=null){
			slow=slow.next;fast=fast.next.next;
			if(slow==fast) {
				System.out.println("Loop found");break;
			}
		}
	}
}
