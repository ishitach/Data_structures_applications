/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
class Node
{
char data;
Node left, right;

public Node(char item)
{
    data = item;
    left = right = null;
}
}
/* Name of the class has to be "Main" only if the class is public. */
class BinaryTree
{static Node root;
static int  index=0;

BinaryTree(char key){
root=new Node(key);
}
BinaryTree(){
root=null;
}

public static void main (String[] args) throws java.lang.Exception
{
	// your code goes here
	
	BinaryTree bt=new BinaryTree();

 char in[] = new char[]{'D', 'B', 'E', 'A', 'F', 'C'};
    char pre[] = new char[]{'A', 'B', 'D', 'E', 'C', 'F'};
int len = in.length;
    Node a  = bt.build(in, pre, 0, len - 1);
    
    bt.print(a);
}
public static void print(Node a){
	if(a==null) return;
    print(a.left);System.out.println(a.data);
    print(a.right);
}

public static Node build(char[] in,char[] pre, int s, int e){
	if(s>e) return null;
	
	Node tn=new Node(pre[index++]);
	if(s==e) return tn;
	
	int pi=search(in,s,e,tn.data);
	
	tn.left=build(in,pre,s,pi-1);
	tn.right=build(in,pre,pi+1,e);
	
	return tn;
}
public static int search(char[] a, int s,int e , char value){
	
	for(int i=s;i<=e;i++){
		if(a[i]==value) return i;
	} return -1;
}


}
