package dailyCodeChallenge.day1;

import java.util.Scanner;

public class FindDivisibleNumbers
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++)
        {
            arr[i] = input.nextInt();
        }
        int count =0;
        for(int i = 0;i<n;i++)
        {
            int num = arr[i];
            for(int j = 0;j<n;j++)
            {
                if(arr[j]%num==0)
                {
                    count++;
                }
            }
            if(count==arr.length)
            {
                System.out.print(arr[i]);
                count=-1;
                break;
            }
            count=0;
            // System.out.println(count);
        }
        if(count==0)
        {
            System.out.println("-1");
        }
    }
}
