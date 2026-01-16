package dailyCodeChallenge.day3;

import java.util.Scanner;

public class RemoveLeading_TrailingSpaceString
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1 = input.next();
        String s2 = input.next();
        s1 = s1.trim();
        s2 = s2.trim();
        System.out.println((Integer.parseInt(s1))+(Integer.parseInt(s2)));
    }
}
