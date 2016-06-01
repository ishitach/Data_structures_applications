
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
		int a[]={100, 80, 60, 70, 60, 75, 85};
		 int[] arr = span(a);
	for(int i=0;i<arr.length;i++) System.out.println(arr[i]);
		
	}
	
	
	public static int[] span(int[] a){
		Stack s=new Stack();
		s.push(0);
		int arr[]=new int[a.length];
		arr[0]=1;
		for(int i=1;i<a.length;i++){
			while(!isempty() &&  a[s.peek()]<=a[i]) s.pop();
			// if(isempty())
			// arr[i]=  i+1;
			// else arr[i] = i-s.peek();
			//S[i] = (st.empty())? (i + 1) : (i - st.top());
			arr[i] = s.isempty() ? (i+1) : (i-s.peek());
			s.push(i); //1s.print();
			//System.out.println();
		}
		return arr;
		
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
			System.out.print(p[i]+" ");
		}
	}
}
