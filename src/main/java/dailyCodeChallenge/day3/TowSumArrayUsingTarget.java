package dailyCodeChallenge.day3;

import java.util.Scanner;

public class TowSumArrayUsingTarget {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++)
        {
            arr[i] = input.nextInt();
        }
        int t = input.nextInt();
        int s = -1;
        int e = -1;
        for(int i = 0;i<n;i++)
        {
            int c = 0;
            for(int j = i+1;j<n;j++)
            {
                if((arr[i]+arr[j])==t)
                {
                    c++;
                    s = i;
                    e = j;
                    break;
                }
            }
            if(c!=0)
            {
                break;
            }
        }
        if(s==-1)
        {
            System.out.println("No two sum solution");
        }
        else
        {
            System.out.println("Index1: "+s);
            System.out.println("Index2: "+e);
        }
    }
}
