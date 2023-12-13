package Leetcode;

public class Special_Positions_in_a_Binary_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][] = {{1,0,0},{0,0,1},{1,0,0}};
		System.out.println(numSpecial(mat));
	}
	public static int numSpecial(int[][] mat) {
        int result = 0;
        int[] rowSums = new int[mat.length];
        int[] colSums = new int[mat[0].length];

        // Calculate the sums of elements in each row and column
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                rowSums[i] += mat[i][j];
                colSums[j] += mat[i][j];
            }
        }

        // Check if each 1 is special using the precalculated sums
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1 && rowSums[i] == 1 && colSums[j] == 1) {
                    result++;
                }
            }
        }
        return result;
    }

}
