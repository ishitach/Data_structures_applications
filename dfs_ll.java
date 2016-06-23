/* package whatever; // don't place package name! */

// import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.*;
/* Name of the class has to be "Main" only if the class is public. */
class Graph
{int V;
	LinkedList<Integer> adj[];
	
	Graph(int v){
		V=v;
		adj=new LinkedList[v];
		for(int i=0;i<v;i++){
			adj[i]=new LinkedList();
		}
	}
		
		void add(int v,int w){
			adj[v].add(w);
		}
		void dfs(int v, boolean[] vis){
			vis[v]=true;
			System.out.print(v+" ");
			Iterator<Integer> i=adj[v].listIterator();
			while(i.hasNext()){
				int p=i.next();
				if(!vis[p]) dfs(p,vis);
				
			}
			
		}
		void dfs(){
			boolean vis[]=new boolean[V];
			for(int i=0;i<V;i++){
				if(!vis[i]) dfs(i,vis);
			}
			
		}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	Graph g=new Graph(5);
	//g.add(0,1);
	g.add(2,3);
	g.add(0,2);g.add(0,3);//g.add(4,3);
	g.dfs();
	}
}
