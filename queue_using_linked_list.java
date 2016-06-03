/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Queue

{static Node head; 
Node front=null;
 Node rear=null;
 int size=0;
	static class Node{
		
		Node next;
		 int data;
		 
		 Node(int x){
		 	data=x; next=null;
		 }
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Queue q=new Queue();
		q.enqueue(9);q.enqueue(3);q.enqueue(43);
	q.enqueue(36);q.enqueue(99);q.enqueue(23);q.dequeue();
	q.enqueue(90);q.enqueue(97);q.enqueue(12);
		q.dequeue();
		q.print();
	}
	public boolean isempty(){
	return front==null;
	}
	public void enqueue(int n){
		Node temp=new Node(n);

		if(isempty()){

		front=temp;
		rear=front;
		}
		else{
			rear.next=temp;
			rear=temp;
			rear.next=null;
			
		}
		size++;
	}
	public void dequeue(){
		
		if(isempty()) rear=null;
		else front=front.next;
		size--;
	}
	public void print(){

		Node i=front;
		while(i!=null){
			System.out.println(i.data);
			i=i.next;
		}
	}
}
