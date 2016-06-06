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
		
		int c=bt.diameter(root);
		System.out.println(c);
	}
	public static int height(Node node){
		if(node==null) return 0;
		
		return (1+Math.max(height(node.right),height(node.left)));
	}
	
	 public static int diameter(Node root){
	 	if(root==null) return 0;
	 	int lh=height(root.left);
	 	int rh=height(root.right);
	 	
	 	int ld=diameter(root.left);
	 	int rd=diameter(root.right);
	 	
	 	return Math.max(Math.max((ld),(rd)),1+lh+rh);
	 	
	 }
    
	
}
