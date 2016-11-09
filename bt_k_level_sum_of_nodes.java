/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		int kl=3;
		int n =s1.length();
		 int k=0;int sum=0;
		for(int i=0;i<n;i++){
			if(s1.charAt(i)=='(') k+=1;
		else if(s1.charAt(i)==')') k-=1;
		else if(k==kl) sum=sum+ (int)(s1.charAt(i)-(char)48);
		}
		System.out.println(sum);
	}
}
