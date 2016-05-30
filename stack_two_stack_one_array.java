/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Stack
{int top2=4;
int top1=-1;
int a[]=new int[4];
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Stack s=new Stack();
		//Stack s2=new Stack();
		s.push1(2);
		s.push2(9);
		s.push2(6);
		s.push1(5);
		s.push1(3);
	//	s.print();
		s.pop1();
			s.print();
		s.pop2();
		s.print();
		
	}
	public void push1(int n){
		if(top1<top2-1){
			top1++;
		a[top1]=n;
		}
	}
	public void push2(int n){
		if(top1<top2-1){
			top2--;
			a[top2]=n;
		}
	}
	public void pop1(){
		if(top1>=0)
//a[top1--];
top1--;
else System.out.println("System underflow");
	}
	public void pop2(){
		if(top2<4)
	//	a[top2++];
	top2++;
	else System.out.println("System underflow");
	}
	public void print(){
		for(int i=0;i<=top1;i++){
			System.out.println(a[i]);
		}
		for(int i=top2;i<4;i++){
			System.out.println(a[i]);
		}
	}
}
