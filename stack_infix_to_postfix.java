
import java.util.*;
import java.lang.*;
import java.io.*;


class fix{
	
	static Stack a=new Stack();
	public static void main (String[] args) throws java.lang.Exception
	{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String in=br.readLine();
		// your code goes here
	System.out.println(topost(in));
		//for(int i=0;i<in.length;i++) a.push(in.charAt(i));
		// a.push(5);
		// a.push(4);
		// a.push(90);
		// a.push(8);
		// a.pop();
		// a.peek();
		// a.print();
	}	
public static String topost(String in)	{
String output="";
char ab;
for(int i=0;i<in.length();i++)
{
	ab=in.charAt(i);
	if(Character.isLetter(ab)) {output+=ab;
	//System.out.println("hgjgh");
	}
	else if (ab=='(') a.push(ab);
	else if( ab==')'){
		while(a.peek()!='('){
			output=output+a.pop();
		
		}
		a.pop();
	}
	else {
	while( (!a.isEmpty()) && !(a.peek()=='(') && prec(ab)<=prec(a.peek()))
	{
	output+=a.pop();
	
		}
	
	a.push(ab);	}//System.out.println(output+"hi");
	
}
while (!a.isEmpty()) {
         output = output + a.pop();
      }
//      System.out.println(output);
return output;
}
public static int prec(char a){
	if(a=='+' || a=='-') return 1;
	else if(a=='*' || a=='/' || a=='%') return 2;
	else return 0;
}

}
class Stack
{
private static int size=8	;
char[] p=new char[size];
static int top=-1;
	
	public  void push(char n){
		if(top!=size){
			top+=1;
			p[top]=n;
		}
		else System.out.println("stack is full");
	}
	public boolean isEmpty(){
		return top==-1;
	}
	public  char pop(){
		// if(top!=-1) top-=1;
		// else System.out.println("Stack is empty");
		return p[top--];
	}
	public char peek(){
		//System.out.println("top element is "+p[top]);
		return p[top];
	}
	public  void print(){
			for(int i=0;i<=top;i++){
			System.out.println(p[i]);
		}
	}
}

