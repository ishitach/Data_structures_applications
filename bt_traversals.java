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
		
		bt.inorder(root); System.out.println();
		bt.preorder(root);System.out.println();
		bt.postorder(root);System.out.println();
	}
	
	public static void inorder(Node node){
		if(node==null) return;
		
		inorder(node.left);
		System.out.println(node.key);
		inorder(node.right);
	}
	public static void preorder(Node node){
			if(node==null) return;
		System.out.println(node.key);
		preorder(node.left);
		
		preorder(node.right);
	}
	public static void postorder(Node node){
			if(node==null) return;
		postorder(node.left);
		
		postorder(node.right);
		System.out.println(node.key);
	}
}
