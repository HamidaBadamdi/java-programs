/**
 * Program Name: Student Result Calculator
 *
 * Description:
 * This program calculates the total marks, percentage,
 * grade, and final result of a student based on
 * marks entered for four subjects.
 * 
 * Concepts Demonstrated:
 *  Arrays for storing subject marks
 */

package pkg;

import java.util.Scanner;

class StudentResultCalculator
{
	
	public static void main(String[] args)
	{
		int total=0;
		char grade;
		float perc;
		String result="PASS";
		int[] marks = new int[4];
		
		System.out.println("Enter 4 Subjects Marks......\n");
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i<=3; i++)
		{
			System.out.print("Enter Subject-" + (i+1) +" Marks: ");
			marks[i] = sc.nextInt();
			total+=marks[i];
		}
	
		System.out.println("\n*******Student Result*******");
		System.out.println("Total : " + total);
		perc =  total /4;
		System.out.println("Percentage : " + perc);
		
		if(perc >= 90)
		{	 grade = 'A';		
			System.out.println("Grade : " + grade);
			System.out.println("Result : " + result);
		}
		else if(perc >= 80)
		{	 grade = 'B';
			System.out.println("Grade : " + grade);
			System.out.println("Result : " + result);
		}
		else if(perc >= 70)
		{	 grade = 'C';
			System.out.println("Grade : " + grade);
			System.out.println("Result : " + result);
		}
		else if(perc >= 60)
		{	grade = 'D';
			System.out.println("Grade : " + grade);
			System.out.println("Result : " + result);
		}
		else if(perc >= 50)
		{	 grade = 'E';
			System.out.println("Grade : " + grade);
			System.out.println("Result : " + result);
		}
		else 
		{	 grade = 'F';
			 result="FAIL";
			 System.out.println("Grade : " + grade);
			 System.out.println("Result : " + result);
		}
	}
}