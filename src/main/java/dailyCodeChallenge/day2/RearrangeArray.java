package dailyCodeChallenge.day2;

import java.util.Arrays;
import java.util.Scanner;

public class RearrangeArray
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++)
        {
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);
        int max = arr[n-1];
        for(int i = 0;i<=max;i++)
        {
            int c = 0;
            for(int j = 0;j<n;j++)
            {
                if(arr[j]==i)
                {
                    c++;
                }
            }
            if(c!=0)
            {
                System.out.print(i+" ");
            }
            else
            {
                System.out.print(-1+" ");
            }
        }
    }
}
