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
heapsort(a)		;
	
		 for(int i=0;i<n;i++){
		 	 System.out.println(a[i]);
		 }
	}
	public static void heapsort(int[] a){
		int n=a.length;
		for(int i=n/2 -1;i>=0;i--){
			heapify(a,n,i);
		}
		for(int i=n-1;i>=0;i--){
		int temp=a[0];
		a[0]=a[i];
		a[i]=temp;
		heapify(a,i,0);
		}
	}
	
	public static void heapify(int[] a, int n,int i){
		
		int largest=i;
		int l=2*i+1;
		int r=2*i+2;
		if(l<n&& a[l]>a[largest]) largest=l;
		if(r<n && a[r]>a[largest]) largest=r;
		if(largest!=i){
			
			int temp=a[i];
			a[i]=a[largest];
			a[largest]=temp;
			heapify(a,n,largest);
		}
	}
}
