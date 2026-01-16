package dailyCodeChallenge.day2;

import java.util.Scanner;

public class FindingIndexStartingEndingArray
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int target = input.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++)
        {
            arr[i] = input.nextInt();
        }
        int s = -1;
        int e = -1;
        for(int i = 0;i<n;i++)
        {
            int count = 0;
            for(int j = i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                    s = i;
                    e = j;
                    System.out.print("Positions are "+s+" "+e);
                    break;
                }
            }
            if(count!=0)
            {
                break;
            }
        }
        if(s==-1 || e==-1)
        {
            System.out.println("Positions are "+s+" "+e);
        }
    }
}
