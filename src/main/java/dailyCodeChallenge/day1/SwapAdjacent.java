package dailyCodeChallenge.day1;

import java.util.Scanner;

public class SwapAdjacent
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String n = input.next();
        if(n.length()%2!=0)
        {
            System.out.println("-1");
        }
        else
        {
            char[] arr = n.toCharArray();
            for(int i = 0;i<arr.length;i+=2)
            {
                char temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
            System.out.println(String.valueOf(arr));
        }
    }
}
