package dailyCodeChallenge.day2;

import java.util.Scanner;

public class FirstRepeatingElements
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++)
        {
            arr[i] = input.nextInt();
        }
        int c = 0;
        for(int i =0;i<n;i++)
        {
            int count = 0;
            for(int j = i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println(arr[i]);
                    count++;
                    c++;
                    break;
                }
            }
            if(count!=0)
            {
                break;
            }
        }
        if(c==0)
        {
            System.out.println("No repeating elements");
        }
    }
}
