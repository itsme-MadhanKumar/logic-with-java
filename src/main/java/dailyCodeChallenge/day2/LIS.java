package dailyCodeChallenge.day2;

import java.util.Arrays;
import java.util.Scanner;

public class LIS
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++)
        {
            arr[i] = input.nextInt();
        }
        int longest = 1;
        int[] dp = new int[n];
        Arrays.fill(dp,1);
        for(int i = 1;i<n;i++)
        {
            for(int j = 0;j<i;j++)
            {
                if(arr[i]>arr[j])
                    dp[i] = Math.max(dp[i],dp[j]+1);
            }
            longest = Math.max(longest,dp[i]);
        }

        System.out.println(longest);
    }
}
