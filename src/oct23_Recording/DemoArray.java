package oct23_Recording;

import java.util.Arrays;

public class DemoArray {

	public static void main(String[] args) 
	{	
		int a [] = {10, 20, 30, 40};
		
		System.out.println(a[1]);
		
		a[1]=99;
		
		System.out.println(Arrays.toString(a));
		
//		a[4]=98;
		
		System.out.println(Arrays.toString(a));
		
		//2nd approach to declare the array
		int a1[] =new int[2];
		
		a1[0]=56;
				
	    a1[1]=78;
//	    System.out.println(Arrays.toString(a1));
	    for(int z:a1)
	    {
	    	System.out.println(z);
	    }
	    
//	    for(int i=0; i<a1.length; i++)
//	    {
//	       System.out.println(a1[i]);
//	    }
//	    a1[2]=45;
		
	    System.out.println(Arrays.toString(a1));
//	}


	}

}
