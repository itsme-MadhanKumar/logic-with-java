package dailyCodeChallenge.day1;

import java.util.Scanner;

public class Pattern3
{
    public static void main(String[] args)
    {
        /* n = 3;
                1         1
                1 2     2 1
                1 2 3 3 2 1
         */
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int num = 1;
        for(int i = 1;i<=n;i++)
        {
            for(int j = 1;j<=i;j++)
            {
                System.out.print(num+" ");
                num++;
            }
            num--;
            for(int j = 1;j<=2*n-2*i;j++)
            {
                System.out.print("  ");
            }
            for(int j = 1;j<=i;j++)
            {
                System.out.print(num+" ");
            }
            num=1;
            System.out.println();
        }
    }
}
