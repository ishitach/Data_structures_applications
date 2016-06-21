public class Solution {
	public void rotate(ArrayList<ArrayList<Integer>> a) {
	    int[][] ar=new int[a.size()][a.get(0).size()];
	    int n=a.size(); int m =a.get(0).size();
	    for(int i=0;i<n;i++){
	        for(int j=0;j<m;j++){
	            ar[i][j]=a.get(i).get(j);
	        }
	    }
	    //for(int i=0;i<n-1;i++)
	   ar=  rot(ar,n);
	    for(int i=0;i<n;i++){
	        for(int j=0;j<m;j++){
	           a.get(i).set(j,ar[i][j]);
//System.out.println(ar[i][j]);
	        }
	    }
	     
	}
	public static int[][] rot(int[][]a, int n){
	    int[][] ret=new int[n][n];
	    for(int i=0;i<n;i++){
	        for(int j=0;j<n;j++){
	            ret[i][j]=a[j][i];
	            //swap(a[i][j],a[j][i]);
            //a[i][j] =a[i][j] ^ a[j][i] ^ (a[j][i] = a[i][j]);
	        }
	    }
	   //  for(int i=0;i<n;i++){
		  //	for(int j=0;j<n;j++) System.out.print(ret[i][j]+"   ");
		  //	System.out.println();
		  //}
	    int temp=0;
	    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n/2;j++) {
           //temp=ret[i][j];
           // ret[i][j] = ret[i][n - j - 1];
           // ret[i][n-1-j]=temp;
           //swap(a[i][j],a[i][n-j-1]);
           ret[i][j]=ret[i][j]^ret[i][n-1-j]^(ret[i][n-1-j] = ret[i][j]);
        }
    }
    
    //  for(int i=0;i<n;i++){
		  //	for(int j=0;j<n;j++) System.out.print(a[i][j]+"   ");
		  //	System.out.println();
		  //}
    return ret;
	    
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

