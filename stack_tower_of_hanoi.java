
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Stack
{
	
private static int size=3;
int[] p=new int[size];
static int top=-1;

	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Stack src=new Stack();Stack dest=new Stack();Stack mid=new Stack();
		char s='s',d='d',m='m';
		for(int i=size;i>0;i--) src.push(i);
		int moves=(int)Math.pow(2,size)-1;
//		System.out.println(moves);
		for(int i=0;i<moves;i++){
			if(i%3==1)  {movedisk(src,dest,s,d);//System.out.println("1i");
			}
			else if(i%3==2) {movedisk(src,mid,s,m);//System.out.println("2i");
			}
			else if(i%3==0){movedisk(mid,dest,m,d);//System.out.println("0i");
			}
		}
		
		
		
	}
	
	public static void movedisk(Stack src, Stack dest, char s,char d){
		int top1=src.pop();int top2=dest.pop();
		if(top1==-10000) 
		{
			src.push(top2);
			System.out.println("moved from "+d+"to "+s);
		}
		else if(top2==-10000) 
		{
			dest.push(top1);
			System.out.println("moved from "+s+"to "+d);
			
		}
		else if(top2<top1){
			src.push(top1);src.push(top2);
			System.out.println("moved from "+d+"to "+s);
		}
else if(top2>top1){
			dest.push(top2);dest.push(top1);
			System.out.println("moved from "+s+"to "+d);
		}
		
	}
	
	
	public  void push(int n){
		if(top!=size){
			top+=1;
			p[top]=n;
		}
		else System.out.println("stack is full");
	}
	
	public  int pop(){
		if(top!=-1) return p[top--];//top-=1;
		else return -10000;
		//System.out.println("Stack is empty");
	}
	
	public  void print(){
			for(int i=0;i<=top;i++){
			System.out.println(p[i]);
		}
	}
}
