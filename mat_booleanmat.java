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
int row[]		=new int[n];
int col[]=new int[m];

for(int i=0;i<n;i++){
	for(int j=0;j<m;j++){
		if(a[i][j]==1) {
			row[i]=1;
			col[j]=1;
		}
	}
}
	for(int i=0;i<n;i++){
		for(int j=0;j<m;j++){
			if(row[i]==1 || col[j]==1)
			a[i][j]=1;
		}
	}
for(int i=0;i<n;i++){
	for(int j=0;j<m;j++)
	System.out.print(a[i][j]);
	System.out.println();
}

	}

}
