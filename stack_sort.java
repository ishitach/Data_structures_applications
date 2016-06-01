
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Stack
{
	
private static int size=6;
static int[] p=new int[size];
static int top=-1;

	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Stack a=new Stack();
		a.push(5);
		a.push(4);
		a.push(90);
		a.push(-8);
//		a.pop();
a.sort();

		a.print();
	}

public static void sort(){
	//System.out.println("HI");
	int temp=0;
	if(!isempty())
	{
	temp = pop();
	sort();
	sortinsert(temp);
	}
}

public static void sortinsert(int n){
int temp;
//System.out.println("HI");
	if(isempty() || n>p[top]) {push(n);
	//System.out.println(n);
	}
	else {//System.out.println("HI");
		temp =pop();
		sortinsert(n);
		push(temp);//pop();
	//	System.out.println("HI");
	}
}

public static boolean isempty(){
	return top==-1;
}

	public  static  void push(int n){
		if(top!=size){
			top+=1;
			p[top]=n;
		}
		else System.out.println("stack is full");
	}
	
	public static int peek(){
		return p[top];
	}
	public static int pop(){
		// if(top!=-1) top-=1;
		return p[top--];
		// else System.out.println("Stack is empty");
	}
	
	public static void print(){
			for(int i=0;i<=top;i++){
			System.out.println(p[i]);
		}
	}
}
