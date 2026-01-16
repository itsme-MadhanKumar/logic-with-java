package dailyCodeChallenge.day1;

import java.util.Scanner;

public class Pattern4
{
    public static void main(String[] args)
    {
        /* n = 3;
                    A
                  C C C
                E E E E E
         */
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        char c = 'A';
        for(int i = 0;i<n;i++)
        {
            for(int j = n-i-1;j>0;j--)
            {
                System.out.print("  ");
            }
            for(int j = 0;j<2*i+1;j++)
            {
                System.out.print(c+" ");
            }
            c+=2;
            System.out.println();
        }

    }
}
