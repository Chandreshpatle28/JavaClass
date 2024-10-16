package oct16;

public class Child extends Parent {
	
	public void marriage()
	{
		System.out.println("Wedding session gone...!");
	}

	public static void main(String[] args) 
	{
		Child ch=new Child();
		
		ch.property();
		ch.marriage();
		

	}

}
