package Assignment.day2;
import java.util.Scanner;
public class ConvertPositive
{
    //Assignment:3
    //Problem statement: Convert a negative number to positive number
    //-----------------------------------------------Pseudocode:
    //1. Initialize an integer with a negative number like, int number = -40;2. Check if the number is a negative number Hint : any number that is lesser than zero is a negative number3. If so, convert the number to a positive numer
    //
    //4. Print as below "The number -40 is converted to 40"
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num>0)
        {
            System.out.println("The given number is already positive");
        }
        else
        {
            System.out.println("The number "+num+" is converted to "+(num*-1));
        }
    }
}
