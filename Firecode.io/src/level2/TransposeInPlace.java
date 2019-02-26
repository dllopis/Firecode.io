package level2;

public class TransposeInPlace {

	public static void transposeMatrix(int[][] matrix) {
	    for(int i = 0;i<matrix.length-1;i++)	{
	    	for(int j = i+1;j<matrix[i].length;j++)	{
	    		int temp = matrix[i][j];
	    		matrix[i][j] = matrix[j][i];
	    		matrix[j][i] = temp;
	    	}
	    	displayMatrix(matrix, "updated");
	    }
	}
	public static void displayMatrix(int[][] a, String msg)	{
		
		System.out.println(msg);
		for(int i = 0;i<a.length;i++)	{
			for(int j = 0;j<a[i].length;j++)	{
				System.out.print(a[i][j] + " ");
			}System.out.println("");
		}System.out.println("");
	}
	
	public static void main(String[] args) {
		int[][] matrix =	{	
				{1 ,2 ,3 ,4},
				{5 ,6 ,7 ,8},
				{9 ,10,11,12},
				{13,14,15,16}
		};
		
		displayMatrix(matrix, "Original Matrix: ");
		transposeMatrix(matrix);
		displayMatrix(matrix, "Transposed -InPlace- Matrix");
	}
}
/*
	Original
	1  2  3  4
	5  6  7  8
	9  10 11 12
	13 14 15 16
	
	Solution
	1 5 9  13
	2 6 10 14
	3 7 11 15
	4 8 12 16
	
	1st iteration
	1 5  9  13
	2 6  7  8
	3 9  10 11
	4 13 14 15
	- 1st already in place (1)
	)
	(0,1) --> (1,0)
	(0,2) --> (2,0)
	(0,3) --> (3,0)
	
	
	2nd Iteration
	1 5 8 12
	2 6 9 13
	3 7 10 11
	4 8 14 15
	1st and 2nd in-place 2,6)
	(1,2) --> (2,1)
	(1,3) --> (3,1)
	
	3rd iteration
	1 5 8 12
	2 6 9 13
	3 7 10 14
	4 8 11 15
	
	- 1-3 in place (3,7,10)
	(2,3) --> (3,2)
	
	-last row in-place(4,8,11,15
	DONE
*/