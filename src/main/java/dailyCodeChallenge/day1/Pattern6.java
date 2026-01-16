package dailyCodeChallenge.day1;

import java.util.Scanner;

public class Pattern6
{
    /* n = 4;
            1010
            0101
            1010
            0101
     */
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                if(i%2==0)
                {
                    System.out.print((j%2==0)? "1" : "0");
                }
                else
                {
                    System.out.print((j%2==1) ? "1" : "0");
                }
            }
            System.out.println();
        }
    }
}
