package solutions;

public class RotateImage {
/*
 * Transposed matrix first and then flipped horizontally to get counter-clock rotation
 */
	public static void rotateSquareImageCCW(int[][] matrix) {
		displayMatrix(matrix,"Original matrix");
		
	    transposeMatrix(matrix);
	    displayMatrix(matrix, "Transposed first");
	    
	    flipMatrix(matrix);
	    displayMatrix(matrix, "Rotated counter-clockwise");
	}
	
	private static void transposeMatrix(int[][] matrix) {
	    for(int i = 0;i<matrix.length-1;i++)	{
	    	for(int j = i+1;j<matrix[i].length;j++)	{
	    		swapTranspose(matrix,i,j);
	    	}
	    }
	}
	
	private static void flipMatrix(int[][] matrix)	{
		for(int i = 0;i<matrix.length/2;i++)	{
			for(int j = 0;j<matrix[i].length;j++)	{
				swapHorizontal(matrix,i,j,matrix.length - 1 - i, j);
			}
		}
	}
	public static void swapTranspose(int[][] matrix,int i, int j)	{
		int temp = matrix[i][j];
		matrix[i][j] = matrix[j][i];
		matrix[j][i] = temp;
	}
	public static void swapHorizontal(int[][] matrix, int i, int j, int k, int l) {
	    int temp = matrix[i][j];
	    matrix[i][j]= matrix[k][l];
	    matrix[k][l]= temp;
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
			int[][] matrix2 =	{	
					{1 ,2 ,3 ,4},
					{5 ,6 ,7 ,8},
					{9 ,10,11,12},
					{13,14,15,16}
			};
			
			int[][] matrix1 =	{	
					{1 ,2, 3 },
					{4 ,5, 6 },
					{7 ,8, 9 }

			};
			rotateSquareImageCCW(matrix1);
			rotateSquareImageCCW(matrix2);
	}
}