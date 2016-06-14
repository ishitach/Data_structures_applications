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
		
spiral(a,n,m);
	}
	public static void spiral(int[][] a,int n, int m){
		int i=0;//for the iterations
		int k=0; int l=0;//k for rows and l for columns
		while(k<n && l<m){
			
			for(i=l;i<m;i++) System.out.print(a[k][i]+" ");// row ko forward me
			k++;// next row now
			
			for(i=k;i<n;i++) System.out.print(a[i][m-1]+" ");//last column
			m--;//coulmn ko decrease
			
			if(k<n){//last row
				for(i=m-1;i>=l;i--) System.out.print(a[n-1][i]+" ");
				
				n--;
			}
			if(l<m){
				for(i=n-1;i>=k;i--) System.out.print(a[i][l]+" ");
				l++;
			}
		}
		
	}

}
