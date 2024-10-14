package oct03_assignment;
/*
 * Q..What will be the output of following program and why ?(explanation)
 for(int i=1; i<10; i++)
 {
 if(i==5)
 {
 continue;
 }
 SOP(i);
 }
 */
public class Assign_11 {

	public static void main(String[] args) 
	{
		for(int i=1; i<10; i++)
		 {
			if(i==5)
		 {
			continue;
		 }
			System.out.println(i);
		 }

	}

}
