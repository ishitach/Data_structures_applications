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
	ll.head =new Node(1);
	Node n2=new Node(24);
	Node n3 =new Node(55);
	ll.head.next=n2;n2.next=n3;
		
	Node n6 =new Node(18);
	Node n7=new Node(41);
	Node n8 =new Node(96);
	Node n9=new Node(100);
	n3.next=n6;
	n6.next=n7;n7.next=n8;n8.next=n9;
	//Node x = reverse(ll.head,2);

	ll.segre();
		Node x=head;
		while(x!=null){
		System.out.println(x.data);
	x=x.next;
	}
	}
	
public static void segre(){
	Node end=head;
	Node curr=head;
	Node prev=null;
	while(end.next!=null){
		end=end.next;
	}
	
	Node new_end=end;
	while(curr.data %2 !=0 && curr!=end){
		new_end.next=curr;
		curr=curr.next;
		new_end.next.next=null;
		new_end=new_end.next;
	}
	if(curr.data%2==0){
		head=curr;
		
		while(curr!=end){
			if(curr.data%2==0){
				prev=curr;
				curr=curr.next;
			}
			
			else{
				prev.next=curr.next;
				curr.next=null;
				new_end.next=curr;
				new_end=curr;
				curr=prev.next;
				
			}
			
		}
		
	}
	else prev=curr;
	if(new_end!=end && (end.data)%2!=0){
		prev.next=end.next;
		end.next=null;
		new_end.next=end;
		
	}
	return;
	
}
}
