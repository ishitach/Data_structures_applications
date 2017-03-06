/*
Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node RemoveDuplicates(Node head) {
 
Node p=head;
    
    while(head.next!=null){
        
        if(head.data==head.next.data)
        head.next=head.next.next;
        else head=head.next;
    }
   // Node  
    return p;
}
