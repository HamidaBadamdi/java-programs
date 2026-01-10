// Package declaration
// 'pkg' is a user-defined package created to organize Java programs
package pkg;

import java.util.Scanner;

class UserInformation
{
    public static void main(String[] args)
    {
        // Create Scanner object for reading input from console
        Scanner sc = new Scanner(System.in);

        // Read user's first name
        System.out.print("Enter Your Name : ");
        String name = sc.next();

        // Read user's surname
        System.out.print("Enter Surname : ");
        String surname = sc.next();

        // Read user's city
        System.out.print("Enter City : ");
        String city = sc.next();

        // Read user's contact number
        System.out.print("Enter Your Contact No.: ");
        int ph_no = sc.nextInt();

        // Display the collected user information
        System.out.println("\n\n----- User Information -----\n");
        System.out.println("Name       : " + name);
        System.out.println("Surname    : " + surname);
        System.out.println("City       : " + city);
        System.out.println("Contact No.: " + ph_no);

        // Close the Scanner to release system resources
        sc.close();
    }
}
