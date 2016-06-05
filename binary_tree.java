/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class BinaryTree
{Node root;
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
	
	}
}
