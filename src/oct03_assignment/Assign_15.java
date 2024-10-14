package oct03_assignment;
/*
 * Q..Write a program to print following pattern
 1 2 3 4
 1 2 3 4
 1 2 3 4 
 1 2 3 4
 */
public class Assign_15 {

	public static void main(String[] args) 
	{
		for(int i=0; i<=3; i++)
		{
			for(int j=1; j<=4; j++)
			{
				System.out.print(j+" " );
			}
			System.out.println();
		}

	}

}
