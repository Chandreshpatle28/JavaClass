package oct05_Programs;

public class ReversString {

	public static void main(String[] args) 
	{
		String str = "Hello Chandresh";
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        System.out.println("Reversed string : " + reversed);

	}

}
