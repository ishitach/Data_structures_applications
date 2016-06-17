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
		int n =Integer.parseInt(br.readLine());
		int a[]=new int[n];
		String[] str=br.readLine().split(" ");
		for(int i=0;i<n;i++) a[i]=Integer.parseInt(str[i]);
		
		radix(a);
	
		 //for(int i=0;i<n;i++){
		 //	 System.out.println(a[i]);
		 //}
	}
	
	public static void radix(int[] a){
	int n =a.length;
	 int m =max(a);
	 for(int exp=1;m/exp>0;exp*=10){
	 	countsort(a,exp);
	 }
		
	}
	
	public static void countsort(int[] a,int exp){
		int n =a.length;
		int out[]=new int[n];
		int i=0; 
		int count[]=new int[10];
		
	}
	
	public static int max(int[] a){
		int max=a[0];
		for(int i=1;i<n;i++){
			if(a[i]>max) max=a[i];
		}
		return max;
	}
	
}
