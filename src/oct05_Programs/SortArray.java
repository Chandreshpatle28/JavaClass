package oct05_Programs;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) 
	{
		int[] arr = {5, 3, 8, 4, 1};

        Arrays.sort(arr);

        System.out.println("Sorted array in ascending order: " + Arrays.toString(arr));

	}

}
