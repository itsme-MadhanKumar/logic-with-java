package dailyCodeChallenge.day2;

import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String s = input.next();
        int f = 0;
        int l = s.length()-1;
        boolean flag = true;
        while(f<l)
        {
            if(s.charAt(f)!=s.charAt(l))
            {
                flag = false;
                break;
            }
            f++;
            l--;
        }
        if(flag)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a palindrome");
        }
    }
}
