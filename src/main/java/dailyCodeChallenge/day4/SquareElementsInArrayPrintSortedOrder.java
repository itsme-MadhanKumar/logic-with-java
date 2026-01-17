package dailyCodeChallenge.day4;

import java.util.Arrays;
import java.util.Scanner;

public class SquareElementsInArrayPrintSortedOrder
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr  = new int[n];
        for(int i = 0;i<n;i++)
        {
            arr[i] = input.nextInt();
        }
        for(int i = 0;i<n;i++)
        {
            if(arr[i]>0)
            {
                int temp = (int) Math.pow(arr[i],2);
                arr[i] = temp;
            }
            else
            {
                int temp = arr[i] * -1;
                arr[i] = (int) Math.pow(temp,2);
            }
        }
        Arrays.sort(arr);
        for(int i = 0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
