package oct05_Programs;

public class SwapNumbers {

	public static void main(String[] args) 
	{
		//int a = 10, b = 20;
		int a = 20, b = 40;

        System.out.println("Before swap: a = " + a + ", b = " + b);

        a = a + b;  // a --> 30
        b = a - b;  // b --> 10
        a = a - b;  // a --> 20

        System.out.println("After swap: a = " + a + ", b = " + b);

	}

}
