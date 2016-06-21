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
		int m =s.nextInt();
		 int n =s.nextInt();
		 int [][]a=new int[m][n];
		  for(int i=0;i<m;i++){
		  	for(int j=0;j<n;j++){
		  		a[i][j]=s.nextInt();
		  	}
		  }
		  
		  // for(int i=0;i<m;i++){
		  //	for(int j=0;j<n;j++) System.out.print(a[i][j]+"   ");
		  //	System.out.println();
		  //}
		  for(int i=0;i<3;i++)
		  rotate(a,m,n);
		  for(int i=0;i<m;i++){
		  	for(int j=0;j<n;j++) System.out.print(a[i][j]+"   ");
		  	System.out.println();
		  }
	}
	
	public static void rotate(int[][] a,int m, int n){
		int r=0;int c=0;
		int prev; int curr=0;
		
	j:{	while(r<m && c<n){
			if(r+1==m || c+1==n) break j; 
			
			prev=a[r+1][c];
			for(int i=c;i<n;i++){
				curr=a[r][i];
				a[r][i]=prev;
				prev=curr;
			}
			r++; //System.out.print(r+" row");
			for(int i=r;i<m;i++){
				curr=a[i][n-1];
				a[i][n-1]=prev;
				prev=curr;
			}
			n--;
			
			if(r<m){
				for(int i=n-1;i>=c;i--){
					curr=a[m-1][i];
					a[m-1][i]=prev;
					prev=curr;
				}
				
			}m--;
			
			if(c<n){
				
				for(int i=m-1;i>=r;i--){
					curr=a[i][c];
					a[i][c]=prev;
					prev=curr;
				}
			}c++;// System.out.print(c+" col");
			
			
		}
	}
	}
}
