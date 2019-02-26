package level2;

public class FindMaxBinaryTree {

	public static int findMax(TreeNode root) {
        
	    if (root == null) 
	            return Integer.MIN_VALUE; 
	  
	        int max = root.data; 
	        int leftMax = findMax(root.left); 
	        int rightMax = findMax(root.right); 
	  
	        if (leftMax  > max) max = leftMax; 
	        if (rightMax > max) max = rightMax; 
	            
	        return max; 
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1,null,null);
		root.left = new TreeNode(2,null,null);
		root.left.left = (new TreeNode(4,new TreeNode(6,null,null),new TreeNode(7,null,null)));
		root.left.right = (new TreeNode(5,null,null));
		
		root.right = new TreeNode(3,new TreeNode(8,new TreeNode(9,null,null),null),null);
		
		System.out.println(findMax(root));
	}

}
