/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Queue

{	int []p=new int[8];
 int size; //current size of the queue

	 int front=0;
	  int rear=0;

	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		 int n =s.nextInt();
		  binary(n);
		  
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
	public  int dequeue(){
		if(!isempty()){
		int temp=	p[front+1];
			size--;
			front=(front+1)%8;
			return temp;
		}
		else{	System.out.println("empty");
			return -1;
		
	}
		
	}
	public  void print(){
		//for(int i=0;i<8;i++)
		System.out.println(p[front+1]+" "+p[rear]);
		//System.out.println(front+" "+rear);
	}

	public static void binary(int n ){
		Queue q=new Queue();
		
q.add(1)		;
for(int i=1;i<=n;i++){
	int temp =q.dequeue();
	System.out.println(temp);
	//String a=temp+""+0;
	int a =10*temp+0;int b =10*temp+1;
	//String b=temp+""+1;
	//System.out.println(a);System.out.println(b);
	q.add(a);q.add(b);
	
	
}
		
	}
}
