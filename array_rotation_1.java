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
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int d=Integer.parseInt(br.readLine());
//int b[]=new int[n];	
int a[]=new int[n];
		String[] str=br.readLine().split(", ");int s1=0;
	//		String[] str1=br.readLine().split(", ");int s2=0;
		for(int i=0;i<n;i++){
			a[i]=Integer.parseInt(str[i]);//s1=s1^a[i];
		}
	
		// for(int i=0;i<m;i++){
		// 	b[i]=Integer.parseInt(str1[i]);//s1=s1^a[i];
		// }
	
	int temp[]=new int[d];
	for(int i=0;i<d;i++){
		temp[i]=a[i];
	}
	for(int i=0;i<n-d;i++){
		a[i]=a[i+d];
	}
	
	for(int i=n-d;i<n;i++) a[i]=temp[i-n+d];
	for(int i=0;i<n;i++) System.out.println(a[i]);
	
	}
}
