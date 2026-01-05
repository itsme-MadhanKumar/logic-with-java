package Assignment.week2;

import java.util.Scanner;

public class PrimeNumber
{
    ///*
    //	 * Goal: To find whether a number is a Prime number or not
    //	 *
    //	 * input: 13
    //	 * output: 13 is a Prime Number
    //	 *
    //	 * Shortcuts:
    //	 * 1) Print : type: syso, followed by: ctrl + space + enter
    //	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
    //	 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter
    //	 *
    //	 * What are my learnings from this code?
    //	 * 1)
    //	 * 2)
    //	 * 3)
    //	 *
    //	 */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num<=1)
        {
            System.out.println("The given number is not a prime number");
        }
        else
        {
            boolean flag = true;
            for(int i =2;i<num;i++)
            {
                if(num%i==0)
                {
                    flag = false;
                    break;
                }
            }
            System.out.println((flag) ? "Prime Number" : "Not a Prime Number");
        }
    }
}
