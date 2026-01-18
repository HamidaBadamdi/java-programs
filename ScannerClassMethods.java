/**
 * Program Name: Scanner Class Methods
 *
 * Description:
 * This program demonstrates the use of different methods of the
 * Scanner class such as next(), nextInt(), nextLine(), nextDouble(),
 * and nextFloat() to read various types of user input.
 */

package pkg;
import java.util.Scanner;
class ScannerClassMethods
{
    public static void main(String[] args)
    {

        System.out.print("Enter Your Name : ");
        Scanner sc1= new Scanner(System.in);
        String name =sc1.next();


        System.out.print("Enter Ages : ");
        Scanner sc2= new Scanner(System.in);
        int age =sc2.nextInt();

        System.out.print("Enter City : ");
        Scanner sc3 = new Scanner(System.in);
        String city =sc3.nextLine();

        System.out.print("Enter Your Salary: ");
        Scanner sc4 = new Scanner(System.in);
        double salary =sc4.nextDouble();
		
		System.out.print("Enter Your Previous Semester Percentage: ");
		Scanner sc5 = new Scanner(System.in);
        float perc =sc5.nextFloat();

         System.out.println("\n\n-----User Information-----\n\n");
         System.out.println("Name : " + name);
         System.out.println("Age : " + age);
         System.out.println("City : " + city);
         System.out.println("Salary : " + salary);
		 System.out.println("Percentage : " + perc);


    }
}
