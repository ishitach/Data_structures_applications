import java.util.*;
import java.lang.*;
import java.io.*;

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
	
	void levelorder(Node root)
	{
		if(root==null) return;
	
		Queue<Node> q=new LinkedList<Node>();
	
	q.add(root);
		
		while(true){
			int nodecount=q.size();
			if(nodecount==0) break;
			
			while(nodecount>0){
				Node node=q.element();
				System.out.print(q.element().key+" ");
				//q.dequeue();
				q.remove();
				if(node.left!=null)  q.add(node.left);
				if(node.right!=null)  q.add(node.right);
				nodecount--;
				
			}System.out.println();
			
		}
		
	}
	

	public static void main (String[] args) throws java.lang.Exception
	{

		BinaryTree bt=new BinaryTree();
		bt.root=new Node(1);
		bt.root.left=new Node(2);
		bt.root.right=new Node(3);
		bt.root.left.left=new Node(4);
		bt.root.left.right=new Node(5);
		bt.root.right.right=new Node(6);
	bt.levelorder(root);
	}
	
}
