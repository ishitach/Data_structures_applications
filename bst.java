/* package whatever; // don't place package name! */
//insert print delete functions of bst
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class BST
{
Node root;

void BST(){
	root=null;
}
class Node{
	int key;
	Node left,right;
public Node(int data)	{
	key=data;
	left=null;right=null;
}
		
		
}
void insert(int key){
	root=insertk(root,key);
}
	Node insertk(Node root, int key){
		if(root==null){
			
			root=new Node(key);
			return root;
		}
		if(root.key>key){
			root.left=insertk(root.left,key);
		}
		else root.right=insertk(root.right,key);
		return root;
		
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
	BST bt=new BST()	;
	bt.insert(20);bt.insert(30);bt.insert(40);bt.insert(50);bt.insert(60);bt.insert(70);
	bt.print(); System.out.println();
	bt.delete(20); bt.print(); System.out.println();
	bt.delete(30); bt.print(); System.out.println();
	bt.delete(50); bt.print(); System.out.println();
	}

void delete(int key){
	root=del(root,key);
}

Node del(Node n,int key){
	if(n==null) return n;
	//if(n.left==null && n.right==null) 
	if(key<n.key) n.left=del(n.left,key);
	else if (key>n.key) n.right=del(n.right,key);
	else{
	if(n.left==null)	 return n.right;
	else if(n.right==null) return n.left;
	
		n.key=suc(n.right);
		n.right=del(n.right,n.key);
	}
return n;
}

int suc(Node n){
	int k1=n.key;
	while(n.left!=null) {
		k1=n.left.key;
		n=n.left;
	}
	return k1;
}

void print(){
	print(root);
}
public static void print(Node root){
	if(root!=null)
	{
	print(root.left);
	System.out.print(root.key+" ");
	print(root.right);
	}
	
}
	
}
