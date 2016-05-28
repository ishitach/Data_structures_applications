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
	LinkedList ll =new	LinkedList();
	ll.head =new Node(10);
	Node n2=new Node(24);
	Node n3 =new Node(56);
	ll.head.next=n2;n2.next=n3;
		
	Node n6 =new Node(1);
	Node n7=new Node(4);
	Node n8 =new Node(96);
	Node n9=new Node(100);
	n3.next=n6;
	n6.next=n7;n7.next=n8;n8.next=n9;
	Node x = reverse(ll.head,2);
	while(x!=null){
		System.out.println(x.data);
	x=x.next;
	}
	}
	public static Node reverse(Node n, int k){
		Node curr=n;
		Node prev=null; Node next=null;
		int count=0;
		
		while(curr!=null && count<k){
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
			count++;
		}
		if(n!=null){
			n.next=curr;
		}
		count = 0;
        while (count < k - 1 && curr != null) {
            curr = curr.next;
            count++;
        }
		
		if(curr!=null){
			curr.next=reverse(curr.next,k);
		}
		return prev;
	}
}
