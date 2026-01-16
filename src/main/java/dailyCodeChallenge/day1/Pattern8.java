package dailyCodeChallenge.day1;

import java.util.Scanner;

public class Pattern8
{
    /* n = 3;
            A B C
            1 2
            A
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        char c = 'A';
        int num = 1;
        int temp = 0;
        for(int i = n;i>0;i--)
        {
            for(int j = 0;j<i;j++)
            {
                if(temp%2==0)
                {
                    System.out.print(c+" ");
                    c++;
                }
                else
                {
                    System.out.print(num+" ");
                    num++;
                }
            }
            c='A';
            num=1;
            temp++;
            System.out.println();
        }
    }
}
