/**
 * Program Name: Even or Odd Using Command-Line Arguments
 *
 * Description:
 * This program accepts a number as a command-line argument
 * and checks whether the given number is even or odd.
 *
 */

package pkg;

import java.util.Scanner;
class EvenOddUsingArgs
{
    public static void main(String[] args)
    {
        System.out.println("Number: " + args[0]);

        if(Integer.parseInt(args[0]) % 2 == 0)
        {
            System.out.println(args[0] + " is even number.");

        }
        else if(Integer.parseInt(args[0])% 2 == 1)
        {
            System.out.println(args[0] + " is odd number.");
        }
        else
        {
            System.out.println("Invalid Number ! ");
        }

    }
}
