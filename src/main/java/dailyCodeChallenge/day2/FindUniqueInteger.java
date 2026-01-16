package dailyCodeChallenge.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindUniqueInteger
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
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : arr)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int count = 0;
        for(Map.Entry<Integer,Integer> mapp : map.entrySet())
        {
            if(mapp.getValue()==1)
            {
                System.out.println(mapp.getKey());
                count++;
                break;
            }
        }
        if(count==0)
        {
            System.out.println("No unique elements");
        }
    }
}
