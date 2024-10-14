package oct01;

/*
 * 4. 	Grade Assignment Based on Marks
	    Write a program that takes a student's marks as input and 
		assigns a grade based on the following criteria:
		Marks >= 90: Grade A
		Marks >= 80: Grade B
		Marks >= 70: Grade C
		Marks >= 60: Grade D
		Marks < 60: Fail
		Use Switch Case statements to determine the grade.
 */

public class Assignment_01_Switch_Case {

	public static void main(String[] args) 
	{
        int marks = 65; 
        
        switch (marks / 10) 
        {
        
            case 10:  System.out.println("Grade A+");
            		break;
            case 9:
                System.out.println("Grade A");
                break;
            case 8:
                System.out.println("Grade B");
                break;
            case 7:
                System.out.println("Grade C");
                break;
            case 6:
                System.out.println("Grade D");
                break;
            default:
                System.out.println("Fail");
                break;
		 }

	}

}
