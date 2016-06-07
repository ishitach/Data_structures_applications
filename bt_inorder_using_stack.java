/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

class Node
{
    int key;
    Node left, right;
 
    public Node(int item)
    {
        key = item;
        left = right = null;
    }
}

class BinaryTree{
	
	static Node root;
	
	void inorder()
	{
		if(root==null) return;
		Stack<Node> st=new Stack<Node>();
		Node node=root;
		
		while(node!=null){
			st.push(node);
			node=node.left;
			
		}
		//System.out.println("hi");
		while(st.size()>0){
			node=st.pop();
			System.out.println(node.key);
			if(node.right!=null){ node=node.right;
			//System.out.println("hi");
			while(node!=null){
				st.push(node);
				node=node.left;
			}
		}
		}
		
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
	bt.inorder();
	}
	
}
