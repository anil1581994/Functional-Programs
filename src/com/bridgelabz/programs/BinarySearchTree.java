package com.bridgelabz.programs;

import java.util.Scanner;

class BSTNode
{
    BSTNode left, right;
    int data;
    public BSTNode()
    {
        left = null;
        right = null;
        data = 0;
    }
    public BSTNode(int n)
    {
        left = null;
        right = null;
        data = n;
    }
    public void setLeft(BSTNode n)
    {
        left = n;
    }
    public void setRight(BSTNode n)
    {
        right = n;
    }
    public BSTNode getLeft()
    {
        return left;
    }
    public BSTNode getRight()
    {
        return right;
    }
    public void setData(int d)
    {
        data = d;
    }
    public int getData()
    {
        return data;
    }  
}
class BST
{
    private BSTNode root;
    public BST()
    {
        root = null;
    }
    public boolean isEmpty()
    {
        return root == null;
    }
    public void insert(int data)
    {
        root = insert(root, data);
    }
    private BSTNode insert(BSTNode node, int data)
    {
        if (node == null)
            node = new BSTNode(data);
        else
        {
            if (data <= node.getData())
                node.left = insert(node.left, data);
            else
                node.right = insert(node.right, data);
        }
        return node;
    }
    public int countNodes()
    {
        return countNodes(root);
    }
    private int countNodes(BSTNode r)
    {
        if (r == null)//if root-(ref)->null
            return 0;
        else
        {
            int l = 1;
            l += countNodes(r.getLeft());
            l += countNodes(r.getRight());
            return l;//count of node
        }
    }
    //normal search
    public boolean search(int val)
    {
        return search(root, val);
    }
    //recursive search
    private boolean search(BSTNode r, int val)
    {
        boolean found = false;
        while ((r != null) && !found)
        {
            int rval = r.getData();
            if (val < rval)
                r = r.getLeft();
            else if (val > rval)
                r = r.getRight();
            else
            {
                found = true;
                break;
            }
            found = search(r, val);
        }
        return found;
    }
}
public class BinarySearchTree {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		
		 BST bst = new BST(); 
	     System.out.println("Binary Search Tree Test\n");          
	     char ch;
	     do    
	        {
	            System.out.println("\nBinary Search Tree Operations\n");
	            System.out.println("1. insert ");
	            System.out.println("2. search");
	            System.out.println("3. count nodes");
	            System.out.println("4. check empty");
	            int choice = scanner.nextInt();            
	            switch (choice)
	            {
	            case 1 : 
	                System.out.println("Enter integer element to insert");
	                bst.insert( scanner.nextInt() );                     
	                break; 
	            case 2 : 
	                System.out.println("Enter integer element to search");
	                System.out.println("Search result : "+ bst.search( scanner.nextInt() ));
	                break;                                          
	            case 3 : 
	                System.out.println("Nodes = "+ bst.countNodes());
	                break;     
	            case 4 :  
	                System.out.println("Empty status = "+ bst.isEmpty());
	                break;            
	            default : 
	                System.out.println("Wrong Entry \n ");
	                break;   
	            }
	            System.out.println("\nDo you want to continue (Type y or n) \n");
	            ch = scanner.next().charAt(0);                        
	        } while (ch == 'Y'|| ch == 'y'); 
	}

}
