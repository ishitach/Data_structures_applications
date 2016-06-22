/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
//recursive code for dfs

class Ideone
{static int count=0;
static int n;
static int m;

	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		// Scanner s=new Scanner(System.in);
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
//		 int t=s.nextInt();
int t=Integer.parseInt(br.readLine());
		 for(int ui=0;ui<t;ui++){
//		 	 n=s.nextInt();
		 	 //m =s.nextInt();
		 	 String[] s1=br.readLine().split(" ");
		 	 n=Integer.parseInt(s1[0]);
		 	 m=Integer.parseInt(s1[1]);
		 	int[][] a=new int[n][m];
		 	int[][] vis=new int[n][m];
		 	// boolean vis[][] = new boolean[n][m];
		 	for(int i=0;i<n;i++){
		 		String[] s2=br.readLine().split(" ");
		 		for(int j=0;j<m;j++){
		 			// a[i][j]=s.nextInt();
		 			a[i][j]=Integer.parseInt(s2[j]);
		 		}
		 	}
		 	int group=0;
		 	 count=0;
		 	int largest=0;
		 	for(int i=0;i<n;i++){
		 		for(int j=0;j<m;j++){
		 			if(a[i][j]==1 && vis[i][j]==0){
		 				count=0;
		 				
		 				dfs(a,i,j,vis);
		 				if(count>group) group=count;
		 				largest++;
		 		//		System.out.print(count+" ");
		 			}
		 		}
		 	}
		 	System.out.print(largest+" "+group);
		 	System.out.println();
		 	
		 }
	}
	
	public static void dfs(int[][] a, int i,int j,int[][] vis){
		vis[i][j]=1;
		count++;
		
		if(  (i+1<n) && (a[i+1][j]==1&& vis[i+1][j]==0 )){
					dfs(a,i+1,j,vis);
		}
		if((i+1<n && j-1>=0) &&(a[i+1][j-1]==1 && vis[i+1][j-1]==0)){
					dfs(a,i+1,j-1,vis);
		}
		if((i+1<n && j+1<m) &&(a[i+1][j+1]==1 && vis[i+1][j+1]==0)){
					dfs(a,i+1,j+1,vis);
		}
		if((i-1>=0)&&(a[i-1][j]==1 && vis[i-1][j]==0)){
					dfs(a,i-1,j,vis);
		}
		if((i-1>=0&& j+1<m)&&(a[i-1][j+1]==1 &&vis[i-1][j+1]==0)){
					dfs(a,i-1,j+1,vis);
		}
		if((i-1>=0 && j-1>=0)&&(a[i-1][j-1]==1&& vis[i-1][j-1]==0)){
					dfs(a,i-1,j-1,vis);
		}
		if((j+1<m)&& (a[i][j+1]==1&&vis[i][j+1]==0)){
					dfs(a,i,j+1,vis);
		}
		if((j-1>=0)&&(a[i][j-1]==1&& vis[i][j-1]==0)){
					dfs(a,i,j-1,vis);
		}
		
	}
}
