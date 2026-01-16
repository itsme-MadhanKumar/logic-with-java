package dailyCodeChallenge.day1;

import java.util.Scanner;

public class Pattern2
{
    public static void main(String[] args)
    {
        //output
        /*
            1
            1 *2
            1 *2 *3
            1 *2
            1
         */
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int num = 1;
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<=i;j++)
            {
                if(j==0)
                {
                    System.out.print(num+" ");
                }
                else
                {
                    System.out.print("*"+num+" ");
                }
                num++;
            }
            num = 1;
            System.out.println();
        }
        for(int i = n-1;i>=0;i--)
        {
            for(int j = i;j>=0;j--)
            {
                if(j==i)
                {
                    System.out.print(num+" ");
                }
                else
                {
                    System.out.print("*"+num+" ");
                }
                num++;
            }
            num = 1;
            System.out.println();
        }
    }
}
