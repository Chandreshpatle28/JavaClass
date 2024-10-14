package oct07;

public class MethodAdd {
	
	public void add() 
	{
		System.out.println(10+12);
		
	}

	public static void main(String[] args) 
	{
		MethodAdd obj=new MethodAdd(); //Creating object
		
		obj.add(); //calling Method by object reference

	}
}
