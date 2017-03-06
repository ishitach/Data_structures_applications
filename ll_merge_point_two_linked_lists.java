/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int FindMergeNode(Node a, Node b) {
  
int lena=0; int lenb=0;
    
    Node p=a;
    Node q=b;
    
    while(p!=null){
        p=p.next;
        lena++;
    }
    while(q!=null){
        q=q.next;
        lenb++;
    }
    
    while(lena>lenb){
        lena--;
        a=a.next;
    }
    
    
    while(lena<lenb){
        lenb--;
        b=b.next;
    }
    
    while(a!=null){
        if(a==b){
            return a.data;
        }
        b=b.next;
        a=a.next;
    }
    return -1;
}
