package dailyCodeChallenge.day3;

import java.util.Scanner;

public class FindingStartingEndingPositionArray
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int t = input.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++)
        {
            arr[i] = input.nextInt();
        }
        int s = -1;
        int e = -1;
        for(int i = 0;i<n;i++)
        {
            int count =0;
            for(int j = i+1;j<n;j++)
            {
                if(arr[i]==t)
                {
                    count++;
                    s = (i+1);
                }
                if(arr[j]==t)
                {
                    e = (j+1);
                }
            }
            if(count!=0)
            {
                break;
            }
        }

        System.out.println("Positions are "+s+" "+e);
    }
}
