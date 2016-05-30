
import java.util.*;
import java.lang.*;
import java.io.*;

class Node{
	int data;
	Node next;
		Node(int d) {
			data=d;next=null;
	}
 }
 class LinkedList{
 private Node head=null;

 	public boolean isempty(){
 		return head==null;
 	}
 	public void insert(int n){
 		Node a=new Node(n);
 		a.next=head;
 		head=a;
 		
 	}
 	public void delete(){
 		
        Node temp = head;
        head = head.next;
 	}
 	public void printl(){
 		Node first=head;
 		while(first!=null) {
 			System.out.println(first.data);
 			first=first.next;
 		}
 	}
 }
class StackLinked
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Stack a=new Stack();
		a.push(5);
		a.push(4);
		a.push(90);
			a.pop();
		a.push(8);
	
		a.print();
	}
}
	class Stack
	{ LinkedList ll=new LinkedList();
		
		public  void push(int n){
		ll.insert(n);
		}
	
	public  void pop(){
		ll.delete();
	}
	
	public  void print(){
		ll.printl();
		}
	}
