package lec_14;

public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		transpose(arr);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
//	public static void transpose(int arr[][]) {
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr[0].length;j++) {
//				int temp = arr[i][j];
//				arr[i][j] = arr[j][i];
//				arr[j][i] = temp;
//			}
//		}
//	}
	public static int[][] transpose(int[][] matrix) {
    for(int i=0;i<matrix.length;i++){
        for(int j=i+1;j<matrix[0].length;j++){
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
    }
    return matrix;
}
}
