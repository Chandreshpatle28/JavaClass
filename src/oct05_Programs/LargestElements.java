package oct05_Programs;

public class LargestElements {

	public static void main(String[] args) 
	{
		int[] arr = {10, 20, 50, 40, 30};
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Largest element: " + largest);

	}

}
