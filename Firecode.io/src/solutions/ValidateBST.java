package solutions;

public class ValidateBST {
	
	private static boolean validateBST(TreeNode root)	{
		return validateBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	private static boolean validateBST(TreeNode root, Integer min, Integer max)	{
		if(root == null)
			return true;
		
		if(min != null && root.data < min || max != null && root.data > max)
			return false;
		
		return validateBST(root.left,min,root.data) && validateBST(root.right,root.data,max);
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(20,null,null);
		root.left = new TreeNode(15,null,null);
		root.right = new TreeNode(30,null,null);
		
		root.left.left = new TreeNode(14,null,null);
		root.left.right = new TreeNode(18,null,null);
		
		System.out.println(validateBST(root));

	}

}
