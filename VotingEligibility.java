/**
 * Program Name: Voting Eligibility Check
 *
 * Description:
 * This program checks whether a user is eligible to vote
 * based on the age entered from the console.
 *
 */
 
package pkg;

import java.util.Scanner;
class VotingEligibility
{
    public static void main(String[] args)
    {

        System.out.print("Enter Your Age : ");
        Scanner sc = new Scanner(System.in);
        int age =sc.nextInt();

       if(age >= 18)
       {
            System.out.println("Your age is : " + age + "\nYou are eligible to vote...");

       }
       else
       {
              System.out.println("Your age is : " + age + "\nYou can't vote !");

       }


    }
}
