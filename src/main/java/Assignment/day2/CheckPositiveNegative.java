package Assignment.day2;
import java.util.Scanner;
public class CheckPositiveNegative
{
    //Assignment:4
    //
    //Problem statement: Check if the number is positive or negative
    //---------------------------------------------------------------Pseudocode:----------
    //1. Initialize a number, say, int number= 35;
    //2. If a number is positive, print "The number is positive"
    // If a number is negative, print "The number is negative"
    //If it nether negative nor positive, print as "The number is neither positive nor negative"
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number =  input.nextInt();
        if(number>0)
        {
            System.out.println("The number is positive number");
        }
        else
        {
            System.out.println("The number is negative number");
        }
    }
}
