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
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String str1="";
		while((line = br.readLine())!=null&&line.length()!=0){
			str1+=line;
		} 
		System.out.println(str1);
		int max=0;
		int p=0;
		for(int i=0;i<str1.length();i++){
			if(str1.charAt(i)=='{' || str1.charAt(i)=='[')
			{
				p++;
				if(p>max) max=p;
			}
			else if(str1.charAt(i)==']' || str1.charAt(i)=='}'){
				p--;
			}
		}
		System.out.println(max);
	}
}
