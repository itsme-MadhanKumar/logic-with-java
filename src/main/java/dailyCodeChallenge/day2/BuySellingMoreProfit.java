package dailyCodeChallenge.day2;

import java.util.Scanner;

public class BuySellingMoreProfit
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++)
        {
            arr[i] = input.nextInt();
        }
        int profit = 0;
        int buy = -1;
        int sell = -1;
        for(int i = 0;i<n;i++)
        {
            for(int j = i+1;j<n;j++)
            {
                int sum = arr[j] - arr[i];
                if(sum>0)
                {
                    if(profit<sum)
                    {
                        profit = sum;
                        buy = i;
                        sell = j;
                    }
                }
            }
        }
        System.out.println("Day of buying : "+(buy+1));
        System.out.println("Day of Selling : "+(sell+1));
        System.out.println("Profit: "+profit);
    }
}
