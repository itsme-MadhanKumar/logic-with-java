package dailyCodeChallenge.day2;

import java.util.Scanner;

public class PrintingOnlyVowels
{
    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);
        int n = input.nextInt();
        char[] arr = new char[n];
        for(int i = 0;i<n;i++)
        {
            arr[i] = input.next().charAt(0);
        }
        for(int i = 0;i<n;i++)
        {
            char c = arr[i];
            if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
            {
                System.out.print(c);
            }
        }
    }
}
