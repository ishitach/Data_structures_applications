/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Queue
{
	int []p=new int[8];
 int size; //current size of the queue

	 int front=0;
	  int rear=0;
	 
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	Queue q=new Queue();
	q.add(5);q.add(12);q.add(3);
	q.dequeue();
//	q.add(67);q.add(45);q.dequeue();q.add(89);q.dequeue();
	
	q.print();
	
	}
	public boolean isempty(){
		return size==0;
	}
	public  void add(int n ){
		
		if(size!=8){
			size++;
	
			rear=(rear+1)%8;
	p[rear]=n;		
	
		}
		else System.out.println("queue full");
	}
	public  void dequeue(){
		if(!isempty()){
			
			size--;
			front=(front+1)%8;
			
		}
		else{
			System.out.println("empty");
	}
		
	}
	public  void print(){
		//for(int i=0;i<8;i++)
		System.out.println(p[front+1]+" "+p[rear]);
		//System.out.println(front+" "+rear);
	}
	
}
