// Package declaration
// 'pkg' is a user-defined package created to organize Java programs
package pkg;

import java.util.Scanner;

// Class to demonstrate basic input and output in Java
class ReadUserName
{
    public static void main(String[] args)
    {
        // Prompt user to enter their name
        System.out.print("Enter Your Name : ");

        // Create Scanner object to read input from console
        Scanner sc = new Scanner(System.in);

        // Read user input (single word) from the console
        String username = sc.next();

        // Display the entered name
        System.out.println("Your Name : " + username);

        // Close the Scanner to release resources
        sc.close();
    }
}
