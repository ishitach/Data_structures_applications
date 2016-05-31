
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Stack
{
	
private static int size=6;
char[] p=new char[size];
static int top=-1;

	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s =new Scanner(System.in);
		Stack a =new Stack();
		String str=s.next(); int d=0;
		o:{for(int i=0;i<str.length();i++)
		
		if(str.charAt(i)=='{' ||str.charAt(i)=='(' || str.charAt(i)=='[' )
		a.push(str.charAt(i));
	else {
	if(a.pop()!=str.charAt(i)){
		d++; break o;}
	}
	
	
	}
	int c=0; 
	
	if(top==-1) c=0;
	else c=1;
	 if(c==0 && d==0) System.out.println("true");
	 else System.out.println("false");
	
	}
	public  void push(char n){
		if(top!=size){
			top+=1;
			p[top]=n;
		}
		else System.out.println("stack is full");
	}
	
	public  char pop(){
		// if(top!=-1) top-=1;
		// else System.out.println("Stack is empty");
		return p[top--];
	}
	
	public  void print(){
			for(int i=0;i<=top;i++){
			System.out.println(p[i]);
		}
	}
}
