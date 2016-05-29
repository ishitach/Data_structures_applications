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
	
	ll.head.next=n2;n2.next=n3; //n3.next=n4;//n4.next=n2;
	n4.next=n5;n5.next=n6;
	//////ll.findloop(head);	
	//Node n=n4;
	
Node n = add(ll.head,n4);
while(n!=null){
		System.out.print(n.data);
	n=n.next;
	}
		}
	public static Node add(Node a,Node b){
		Node result=null;
		Node prev=null;
		Node temp=null; int sum=0; int carry=0;
		while(a!=null || b!=null){
			
			sum=carry+(a!=null?a.data:0)+(b!=null?b.data:0);
			carry=sum>=10?1:0;
			sum%=10;
			temp=new Node(sum);
			if(result==null) result=temp;
			else prev.next=temp;
			prev=temp;
			if(a!=null) a=a.next;
			if(b!=null) b=b.next;
		
		}
		if(carry>0) temp.next=new Node(carry);
		return result;
		
	}
	
}
