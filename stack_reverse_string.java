
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
		String str=s.next();
		for(int i=0;i<str.length();i++)
		a.push(str.charAt(i));
		String str1="";
		for(int i=0;i<str.length();i++)
		str1+=a.pop();
		System.out.println(str1);
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
