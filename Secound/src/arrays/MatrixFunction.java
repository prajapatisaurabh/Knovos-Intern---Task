package arrays;

public class MatrixFunction {

	public int[][] sumMatrix(int[][] matrix, int[][] matrix1) {
		int newMatrix[][] = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				newMatrix[i][j] = matrix[i][j] + matrix1[i][j];
			}
			System.out.println("");
		}
		printMatrix(newMatrix);
		return newMatrix;
	}

	public int[][] mulMatrix(int[][] matrix, int[][] matrix1) {
		int newMatrix[][] = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				newMatrix[i][j] = matrix[i][j] * matrix1[i][j];
			}
			System.out.println("");
		}
		printMatrix(newMatrix);
		return newMatrix;
	}

	public void printMatrix(int[][] matrix) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("");
		}
	}

	public void rightShiftArray(int[] matrix, int index, int data) {
		for (int i = matrix.length; i > index; i--) {

		}
	}

}
