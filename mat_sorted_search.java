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
		int n =s.nextInt();int m =s.nextInt();
		int a[][]=new int[n][m];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				a[i][j]=s.nextInt();
			}
		}
		
		search(a,n,6);search(a,n,11);search(a,n,0);
	}
	
	public static void search(int[][] a, int n, int f){
		int i=0;int j=n-1;//start from top right element 
		int v=0;
		while(i<n && j>=0){
			if(a[i][j]==f) {System.out.println(f+" found at "+i+", "+j);v=9;}
			if(a[i][j]>f) j--;
			else i++;
			
		}
		if(v==0) System.out.println(f+" not found");
	}
}
