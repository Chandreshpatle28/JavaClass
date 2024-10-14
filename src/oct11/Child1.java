package oct11;

public class Child1 extends Parent {
	
	public void multiplication()
	{
		System.out.println("multiplication : "+(100*10));
	}

	public static void main(String[] args) 
	{
		Child1 obj=new Child1();
		
		obj.addition(); //parent method calling
		obj.substraction(); //parent method calling
		
		obj.multiplication(); //self method

	}

}
