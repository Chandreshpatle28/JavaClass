package Sep30;

/*
 * 4. 	Grade Assignment Based on Marks
		Write a program that takes a student's marks as input and 
		assigns a grade based on the following criteria:
		Marks >= 90: Grade A
		Marks >= 80: Grade B
		Marks >= 70: Grade C
		Marks >= 60: Grade D
		Marks < 60: Fail
Use nested if-else statements to determine the grade.
 */

public class Assignment_4 {

	public static void main(String[] args) 
	{
		int Student_marks=70;
		
		if(Student_marks>=90)
		{
			System.out.println("Grade A ");
		}
		
		else if(Student_marks>=80)
		{
			System.out.println("Grade B");
		}
		
		else if(Student_marks>=70)
		{
			System.out.println("Grade C");
		}
		
		else if(Student_marks>=60)
		{
			System.out.println("Grade D");
		}
		
		else if(Student_marks < 60)
		{
			System.out.println("Fail");
		}
	}

}
