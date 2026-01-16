package dailyCodeChallenge.day1;

import java.util.Scanner;

public class AmstrongNumber
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String n = input.next();
        int num = Integer.parseInt(n);
        int sum = 0;
        for(int i = 0;i<n.length();i++)
        {
            int temp = num%10;
            sum += Math.pow(temp,n.length());
            num = num/10;
        }
        System.out.println((Integer.parseInt(n)==sum) ? "Armstrong Number" : "Not an Armstrong number");
    }
}
