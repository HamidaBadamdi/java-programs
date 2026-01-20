/**
 * Program Name: Print Username Multiple Times
 *
 * Description:
 * This program accepts a username from the user using the Scanner class
 * and prints the username ten times using a for loop.
 */


package pkg;

import java.util.Scanner;

class PrintUsernameMultipleTimes
{
    public static void main(String[] args)
    {
    	
        System.out.print("Enter Username : ");
        Scanner sc = new Scanner(System.in);
        String username =sc.next();

        for(int i=0; i<10; i++)
        {
            System.out.println(i +1 + ". " + username);

        }

    }
}
