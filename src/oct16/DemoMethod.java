package oct16;

public class DemoMethod {
	
	public void add()
	{
		System.out.println("A normal method...!!");
	}
	
	public void add(int x)
	{
		System.out.println("method with int argument");
	}
	
	public void add(int y, int z)
	{
		System.out.println("method with int, int argument");
	}

	public static void main(String[] args) {
		
		DemoMethod dm=new DemoMethod();
		
		dm.add(10, 10);
		

	}

}
