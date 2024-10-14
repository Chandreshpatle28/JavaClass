package oct08;

public class MethodDemo {
	
	public void newmethod(int x) 
	{
		System.out.println("Hello Tuseday..!!");
		
	}

	public static void main(String[] args) 
	{
		MethodDemo obj=new MethodDemo(); //Creating object
		
		obj.newmethod(50); //calling Method by object reference

	}

}
