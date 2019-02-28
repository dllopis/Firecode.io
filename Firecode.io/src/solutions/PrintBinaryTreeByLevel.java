package solutions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PrintBinaryTreeByLevel {

	public static ArrayList<ArrayList<Integer>> printLevelByLevel(TreeNode root) {
		// return empty list
		if(root == null)
			return new ArrayList<>();
		
		// result list which will hold each level of tree
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		
		// Queue structure used to hold nodes for next level
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		
		//
		queue.add(root);
		int nodesInLevel = queue.size(); 
		int level = 0;
		
	   while(queue.size() > 0) 
	   {
		   // nodes for each level will be stored here before adding to result list
		   ArrayList<Integer> temp = new ArrayList<>();
		   
		    while(nodesInLevel > 0) 
		    { 
		        TreeNode node = queue.poll();
		        // add each node's data to our temp list
		        temp.add(node.data);
		        
		        // check for child nodes to add to queue
		        if(node.left != null) 
		        	queue.add(node.left);
		        
		        if(node.right != null) 
		        	queue.add(node.right);
		        
		        nodesInLevel--; 
		    }
		    // add this level's list and increment level
		    list.add(level++,temp);
		    
		    // set the current number of nodes in the next level
		    nodesInLevel = queue.size();
	    }  
		return list;
	}
	public static void displayTree(ArrayList<ArrayList<Integer>> list)	{
		for(int i = 0;i<list.size();i++)	{
			System.out.println("Level " + (i+1) + ": " + list.get(i));
		}
	}
	
	public static void main(String[] args) {
		TreeNode root =
		// ROOT
		new TreeNode(1, // level 1
				
		// LEFT SUBTREE
		new TreeNode(2, // level 2
				new TreeNode(4,
						new TreeNode(8,null,null), 		// level 4
						new TreeNode(9,null,null)),		// level 4
				new TreeNode(5,	// level 3
						new TreeNode(10,null,null),		// level 4
						new TreeNode(11,null,null))),	// level 4
		// RIGHT SUBTREE
		new TreeNode(3, // level 2
				new TreeNode(6, // level 3
						new TreeNode(12,null,null),		// level 4
					new TreeNode(13,null,null)),		// level 4
				new TreeNode(7, // level 3
						new TreeNode(14,null,null),		// level 4
						new TreeNode(15,null,null)))	// level 4
		); // END OF TREE
		
		displayTree( printLevelByLevel(root) );
	}
}
