package chapter03;

import java.util.ArrayList;
import java.util.Arrays;

public class D_Array {

	public static void main(String[] args) {
		int[] numbers = {3, 2, 5, 4, 1};
		
	      int target = 5;
	        int index = Arrays.binarySearch(numbers, target);
	        System.out.println("Element found at index: " + index);

	}

}
