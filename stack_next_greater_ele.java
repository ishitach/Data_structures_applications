
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
		int[] c={5,4,90,25,8};
	max(c);
		//a.print();
	}
	public static void max(int[] c){
		Stack a=new Stack();
		int curr=0; int next=0;
		a.push(c[0]);
		
		for(int i=1;i<c.length;i++)
		{
			next=c[i];
			if(isempty()==false){
				curr=a.pop();
				while(curr<next){
				System.out.println(curr+"--> " +next);
				if(isempty()==true) break;
				curr=a.pop();
				}
				if(curr>next) a.push(curr);
				
			}
			a.push(next);
		}
		while(top!=-1){
			int u=a.pop();
			System.out.println(u+"-->"+-1);
		}
	}
 public static 	boolean isempty(){
		if (top==-1) return true;
		else return false;
	}
	public   void push(int n){
		if(top!=size){
			top+=1;
			p[top]=n;
		}
		else System.out.println("stack is full");
	}
	
	public  int pop(){
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
