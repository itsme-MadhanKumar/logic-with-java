package dailyCodeChallenge.day4;

import java.util.HashMap;
import java.util.Scanner;

public class FindingSecondLowestInArray
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++)
        {
            arr[i] = input.nextInt();
        }
        for(int i = 0;i<n;i++)
        {
            for(int j = i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(arr[1]);
        HashMap<Character,Integer> map = new HashMap<>();
        map.size();
    }
}
