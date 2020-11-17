package arrays;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] matrix1 = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };

//		System.out.println("Enter Matrix in (3,3) Format !!");
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 3; j++) {
//				matrix[i][j] = sc.nextInt();
//			}
//		}

		MatrixFunction mf = new MatrixFunction();

//		mf.printMatrix(matrix);
//		mf.sumMatrix(matrix, matrix1);
		mf.mulMatrix(matrix, matrix1);

		sc.close();
	}

}
