package oct21;

public class Exception_Handling {

	public static void main(String[] args) 
	{
		
		try {
		System.out.println(10/0); //ArithmeticException occurs
		}
		catch (ArithmeticException e) {
			System.err.println("Handling Code...!!");
		}

	}

}
