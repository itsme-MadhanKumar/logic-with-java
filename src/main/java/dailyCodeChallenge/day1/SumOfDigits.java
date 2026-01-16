package dailyCodeChallenge.day1;

import java.util.Scanner;

public class SumOfDigits
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int temp = n;
        int sum = 0;
        while(temp!=0)
        {
            sum += temp %10;
            temp /= 10;
        }
        System.out.println(sum);
    }
}
