package oct03_assignment;
/*
 * Q..What will be the output of following program and why ?(explanation)
 for(int i=1; i<10; i++)
 {
 if(i==5)
 {
 break;
 }
 SOP(i);
 }
 */
public class Assign_10 {

	public static void main(String[] args) 
	{
		for(int i=1; i<10; i++)
		 {
			if(i==5)
		 {
				break;
		 }
			System.out.println(i);
		 }

	}

}
