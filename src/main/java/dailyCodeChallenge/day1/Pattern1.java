package dailyCodeChallenge.day1;

import java.util.Scanner;

public class Pattern1
{
    //output
    /*
        *
        # #
        * * *
        # #
        *
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<=i;j++)
            {
                if(i%2==0)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
        for(int i = n-1;i>=0;i--)
        {
            for(int j = i;j>=0;j--)
            {
                if(i%2==0)
                {
                    System.out.print("# ");
                }
                else
                {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
