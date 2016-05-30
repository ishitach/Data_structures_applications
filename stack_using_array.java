
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Stack
{
	
private static int size=6;
int[] p=new int[size];
static int top=-1;

	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Stack a=new Stack();
		a.push(5);
		a.push(4);
		a.push(90);
		a.push(8);
		a.pop();
		a.print();
	}
	public  void push(int n){
		if(top!=size){
			top+=1;
			p[top]=n;
		}
		else System.out.println("stack is full");
	}
	
	public  void pop(){
		if(top!=-1) top-=1;
		else System.out.println("Stack is empty");
	}
	
	public  void print(){
			for(int i=0;i<=top;i++){
			System.out.println(p[i]);
		}
	}
}
