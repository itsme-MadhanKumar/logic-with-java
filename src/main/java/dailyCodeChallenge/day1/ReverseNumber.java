package dailyCodeChallenge.day1;

import java.util.Scanner;

public class ReverseNumber
{
    // 123 - > 321
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int temp = n;
        while(temp!=0)
        {
            int t = temp%10;
            System.out.print(t);
            temp = temp / 10;
        }

    }
}
