package oct16;

public class A {
	
	public void add(int x)
	{
		System.out.println(x);
	}
	
	/*public void add(int x)
	{
		System.out.println("A para method...!");
	}*/
	
	public void sub(double d)
	{
		System.out.println("Hello Baba.., This is Double method!");
	}

	public static void main(String[] args) 
	{
		A obj=new A();
		
		obj.add(10);
		
		obj.add('z');
		
		obj.sub(90);
		
		obj.sub('t');
		
	}

}
