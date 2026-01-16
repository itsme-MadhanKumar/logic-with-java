package dailyCodeChallenge.day1;

import java.util.Scanner;

public class Pattern7
{
    /*
            1         *
            1 2     * *
            1 2 3 * * *
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int num = 1;
        for(int i = 1;i<=n;i++)
        {
            for(int j = 1;j<=i;j++)
            {
                System.out.print(num+" ");
            }
            for(int j = 1;j<=2*n-2*i;j++)
            {
                System.out.print("  ");
            }
            for(int j = 1;j<=i;j++)
            {
                System.out.print("* ");
            }
            num++;
            System.out.println();
        }
    }
}
