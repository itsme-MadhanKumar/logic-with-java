package dailyCodeChallenge.day4;

import java.util.Scanner;

public class IncreaseEveryDigitByOneExceptCharacter
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        for(int i = 0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(Character.isDigit(c))
            {
                int n = c -'0';
                if(n>=0 && n<=8)
                {
                    System.out.print((n+1));
                }
                else
                {
                    System.out.print(n);
                }

            }
            else
            {
                System.out.print(c);
            }
        }
    }
}
