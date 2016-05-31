
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

Stack a=new Stack();
 a.push(1);a.push(2);a.push(3);a.push(4);
 reverse(top);
		a.print();
	}

public  static void reverse(int top){
	if(!isempty()){
	int temp=pop();
	reverse(top);
	
	insert(top,temp);
	
	}
}
	 static void insert(int top, int obj){
		if(isempty()) push(obj);
		else{
			int temp=pop();
			insert(top,obj);
			push(temp);
		}
		
	}


	
 public static 	boolean isempty(){
		if (top==-1) return true;
		else return false;
	}
	public  static void push(int n){
		if(top!=size){
			top+=1;
			p[top]=n;
		}
		else System.out.println("stack is full");
	}
	
	public static int pop(){
		// if(top!=-1) {
			return p[top--];
		// }
		// else System.out.println("Stack is empty");
	}
	
	public  void print(){
			for(int i=0;i<=top;i++){
			System.out.println(p[i]);
		}
	}
}
