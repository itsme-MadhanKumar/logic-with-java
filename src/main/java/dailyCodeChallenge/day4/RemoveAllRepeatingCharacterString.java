package dailyCodeChallenge.day4;

import java.util.Scanner;

public class RemoveAllRepeatingCharacterString
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        StringBuilder str  = new StringBuilder();
        for(int i = 0;i<s.length();i++)
        {
            int count = 0;
            for(int j = 0;j<s.length();j++)
            {
                if(i!=j)
                {
                    char c1 = s.charAt(i);
                    char c2 = s.charAt(j);
                    if(c1==c2)
                    {
                        count++;
                    }
                }
            }
            if(count==0)
            {
                str.append(s.charAt(i));
            }
        }
        System.out.println(str);
    }
}
