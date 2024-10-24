package oct22_Recording;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		
		int number = 10;
		
		int a [] = {10, 20, 30, 40};
		
		//array
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[3]);
		System.out.println(a[2]);
		
		
		try
		{
			System.out.println(a[9]);
		}
		catch(Exception e){
			System.out.println("Please check the index value..");
		}
		
		//System.out.println(a);
		
		System.out.println(Arrays.toString(a)); //First approach
		System.out.println(" ");
		System.out.println("Length "+a.length);
		
		System.out.println();
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]+" ");
		}
		System.out.println('\n');
		
	   //2nd approach
		for(int p:a)
		{
			System.out.println(p);
		}
		
		//3rd approach
		System.out.println();
		
		String name[] = {"Chandresh","Anshu", "pintu","Chintu"};
		
		for(String k: name )
		{
			System.out.println(k);
		}
	}

}
