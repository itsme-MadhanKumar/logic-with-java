package dailyCodeChallenge.day3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VowelOccursEvenNumberOfTimes
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        s = s.toLowerCase();
        char[] arr = s.toCharArray();
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(char c : arr)
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        boolean flag = true;
        for(Map.Entry<Character,Integer> mapp : map.entrySet())
        {
            char c = mapp.getKey();
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
            {
                if(mapp.getValue()%2!=0)
                {
                    flag = false;
                }
            }
        }
        if(flag)
        {
            System.out.print("HAPPY");
        }
        else
        {
            System.out.println("NOT HAPPY");
        }
    }
}
