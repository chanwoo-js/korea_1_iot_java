package chapter03;

public class B_Array {

	public static void main(String[] args) {
		int[][] matrix2 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} , {10, 11, 12} }; // 4행 3열
		for (int[] row : matrix2) {
		    for (int value : row) {
		        System.out.println(value + " ");
		    }
		    System.out.println(); // 줄바꿈
		}
	}

}
