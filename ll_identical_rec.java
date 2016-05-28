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
	
	ll.head.next=n2;n2.next=n3;
		
	LinkedList ll1=new LinkedList();
	Node n6 =new Node(10);
	Node n7=new Node(24);
	Node n8 =new Node(56);
	n6.next=n7;n7.next=n8;
	// Node n=n6;
	// while(n!=null){
	// 	System.out.println(n.data);
	// n=n.next;
	// }
boolean c=	identical(ll.head,n6);
if(c==true) 
System.out.println("identical");
else  System.out.println("not identical");
	}
	
	public static boolean identical(Node a,Node b){
		if(a==null && b==null ) return true;
		if(a!=null && b!=null){
			//System.out.println("x");
			return (a.data==b.data) && identical(a.next,b.next);
			
			//a=a.next;b=b.next;
		}
		return false;
	}
	
}
