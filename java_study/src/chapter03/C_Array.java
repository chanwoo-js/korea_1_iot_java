package chapter03;

import java.util.Arrays;

public class C_Array {

	public static void main(String[] args) {
		int[] numbers1 = {3, 2, 5, 4, 1};
		int[] numbers2 = {3, 2, 5, 4, 1};
		int[] numbers3 = {4, 2, 5, 4, 1};

		boolean numbersEquals1 = Arrays.equals(numbers1, numbers2);
		boolean numbersEquals2 = Arrays.equals(numbers2, numbers3);
		boolean numbersEquals3 = Arrays.equals(numbers1, numbers3);

		System.out.println(numbersEquals1);
		System.out.println(numbersEquals2);
		System.out.println(numbersEquals3);
	}

}
