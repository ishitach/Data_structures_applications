/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class BinaryTree
{static Node root;
	static class Node
{
    int key;
    Node left, right;
 
    public Node(int item)
    {
        key = item;
        left = right = null;
    }
}
BinaryTree(int key){
	root=new Node(key);
}
BinaryTree(){
	root=null;
}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		BinaryTree bt=new BinaryTree();
		bt.root=new Node(1);
		bt.root.left=new Node(2);
		bt.root.right=new Node(3);
		bt.root.left.left=new Node(4);
		bt.root.left.right=new Node(5);
		
		bt.levelorder();
	}
	public static int height(Node root)
    {
        if (root == null)
           return 0;
        else
        {
            
            int lh= height(root.left);
            int rh = height(root.right);
             
            
            if (lh > rh)
                return(lh+1);
            else return(rh+1); 
        }
    }
	 public static void levelorder()
    {
        int h = height(root);
        int i;
        for (i=1; i<=h; i++)
            givenlevel(root, i);
    }
    public static void givenlevel(Node root,int level){
    	if(root==null) return;
    	if(level==1) System.out.println(root.key);
    	else if(level>1){
    		givenlevel(root.left,level-1);
    		givenlevel(root.right,level-1);
    	}
    	
    }
	
}
