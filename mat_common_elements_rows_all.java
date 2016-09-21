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
		int[][] a={{1,2,7},{5,7,3},{6,9,7}};
		
		Map<Integer,Integer> mp=new HashMap<Integer,Integer>();
		
		for(int j=0;j<a[0].length;j++) mp.put(a[0][j],1);
		
		//for(int i=0;i<mp.size();i++ ) System.out.println(mp.get(a[0][i]));
		
		
		for(int i=1;i<a.length;i++){
			
			for(int j=0;j<a[0].length;j++)
			{
				//System.out.println(a[i][j]);
				
				if((mp.get(a[i][j]))==null)
				{
					continue;
				}
				if((mp.get(a[i][j]))==i)
				{mp.put(a[i][j],i+1);
				
				if(i==a[0].length-1) 
				System.out.println(a[i][j]);
				}
			}
			
			
		}
		
		
		
	}
}
