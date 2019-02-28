package solutions;

import java.util.LinkedList;
import java.util.Queue;

public class FindNodeInTree {

	/*
	 * My solution with iteration using queue
	 */
	public static TreeNode findNode(TreeNode root, int val) {
	    if(root == null)
	    	return null;
	    Queue<TreeNode> queue = new LinkedList<>();
	    
	    queue.add(root);
	    
	    while(!queue.isEmpty())	{
	    	TreeNode current = queue.poll();
	    	
	    	if(current.data == val)
	    		return current;
	    	
	    	if(current.left != null)	{
	    		queue.add(current.left);
	    	}
	    	
	    	if(current.right != null)	{
	    		queue.add(current.right);
	    	}
	    }
	    return null;
	}
	
	/*
	 * My solution with recursion
	 */
	public static TreeNode findNode2(TreeNode root, int val) {
	    if(root == null)
	    	return null;
	    TreeNode left = findNode(root.left,val);
	    if(left != null)
		    if(left.data == val)
		    	return left;
	    TreeNode right = findNode(root.right,val);
	    if(right != null)
		    if(right.data == val)
		    	return right;
	    
	    return null;
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1,null,null);
		TreeNode n2 = new TreeNode(2,null,null);
		TreeNode n3 = new TreeNode(3,null,null);
		TreeNode n4 = new TreeNode(4,null,null);
		TreeNode n5 = new TreeNode(5,null,null);
		TreeNode n6 = new TreeNode(6,null,null);
		TreeNode n7 = new TreeNode(7,null,null);
		
		// left subtree
		root.left = n2;
		root.left.left = n4;
		root.left.right = n5;
		
		// right subtree
		root.right = n3;
		root.right.left = n6;
		root.right.right = n7;
		
		int n = 1;
		TreeNode node1 = findNode(root,n);
		System.out.println("Does [" + n + "] exist in tree: " + (node1 != null));
		
		n = 7;
		TreeNode node2 = findNode(root,n);
		System.out.println("Does [" + n + "] exist in tree: " + (node2 != null));
		
		n = 20;
		TreeNode node3 = findNode(root,n);
		System.out.println("Does [" + n + "] exist in tree: " + (node3 != null));
	}

}
