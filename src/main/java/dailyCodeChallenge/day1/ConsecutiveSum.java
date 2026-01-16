package dailyCodeChallenge.day1;

import java.util.Scanner;

public class ConsecutiveSum
{
    /*
        n1 = 5;
        n2 = 2;
        output = 11;
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int s = input.nextInt();
        int e = input.nextInt();
        int sum = 0;
        for(int i =0;i<e;i++)
        {
            sum = sum + s;
            s++;
        }
        System.out.println(sum--);
    }
}
