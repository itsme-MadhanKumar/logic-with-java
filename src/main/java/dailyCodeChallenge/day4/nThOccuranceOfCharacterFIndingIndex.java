package dailyCodeChallenge.day4;

import java.util.Scanner;

public class nThOccuranceOfCharacterFIndingIndex
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        char c = input.next().charAt(0);
        int t = input.nextInt();
        int count = 0;
        for(int i = 0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch==c)
            {
                count++;
            }
            if(count==t)
            {
                System.out.print(i);
                break;
            }
        }
        if(count==0)
        {
            System.out.print(-1);
        }
    }
}
