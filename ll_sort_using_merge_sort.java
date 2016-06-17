/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class LinkedList

{Node head;
	static class Node{
		int data; 
		Node next;
		 Node(int item){
			data=item;
			next=null;
		}
		
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	LinkedList l =new	LinkedList();
	l.head =new Node(12);
		Node a=new Node(9);
		Node b=new Node(3);
		Node c=new Node(8);
		Node d=new Node(1);
		
		l.head.next=a;a.next=b;b.next=c;c.next=d;//d.next=e;
		Node p=l.sort(l.head);
		//Node p=l.head;
		while(p!=null){
			System.out.println(p.data);p=p.next;
		}
	}
	
	public static Node sort(Node n){
		if(n==null|| n.next==null) return n;
		Node mid=getmid(n);
		Node midnext=mid.next;
		mid.next=null;
		Node left=sort(n);
		Node right=sort(midnext);
		
		Node sortl=mergerec(left,right);
		return sortl;
	}
	public static Node mergerec(Node left,Node right){
		if(left==null) return right;
		if(right==null) return left;
		Node temp=null;
		if(left.data<right.data){
		temp=left;
		temp.next=(mergerec(left.next,right));
		}
		else{
			temp=right;
		temp.next=(mergerec(left,right.next));
		
	}
		return temp;
	}
	public static Node getmid(Node n){
		
		if(n==null) return n;
		Node p1=n;
		Node p2=n;
		
		while(p2!=null && p2.next!=null && p2.next.next!=null){
			p1=p1.next;
			p2=p2.next.next;
			
			
		}return p1;
	}
	
}
