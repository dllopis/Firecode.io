package solutions;

import java.util.ArrayList;
import java.util.Stack;

public class IterativePreOrderTraversal {
	
	public static ArrayList<Integer> preorder(TreeNode root) {
	    ArrayList<Integer> list = new ArrayList<>();
	    
	    if(root == null)
	        return list;
	    
	    Stack<TreeNode> stack = new Stack<>();
	    stack.add(root);
	    
	    while(!stack.isEmpty())	{
	    	
	    	TreeNode temp = stack.pop();
	    	list.add(temp.data);
	    	
	    	if(temp.right != null)
	    		stack.push(temp.right);
	    	if(temp.left != null)
	    		stack.push(temp.left);
	    }
	    return list;
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
		
		System.out.println(preorder(root));
	}
}
