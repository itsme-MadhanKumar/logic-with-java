package dailyCodeChallenge.day1;

import java.util.Scanner;

public class Pattern5
{
    /*
            ABCDEFGGFEDCBA
            ABCDEF FEDCBA
            ABCD    DCBA
            ABC      CBA
            AB        BA
            A          A
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        char c = 'A';
        int k = 0;
        for(int i = n;i>=0;i--)
        {
            for(int j = 1;j<=i;j++)
            {
                System.out.print(c);
                c++;
            }
            c--;
            for(int j = 1;j<=k;j++)
            {
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++)
            {
                System.out.print(c);
                c--;
            }
            k+=2;
            c='A';
            System.out.println();
        }
    }
}
