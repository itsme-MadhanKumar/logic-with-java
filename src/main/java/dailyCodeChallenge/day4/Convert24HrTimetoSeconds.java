package dailyCodeChallenge.day4;

import java.util.Scanner;

public class Convert24HrTimetoSeconds
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String s =input.nextLine();
        String[] arr = s.split(":");
        int hr = Integer.parseInt(arr[0]) * 3600;
        int min = Integer.parseInt(arr[1]) * 60;
        int sec= Integer.parseInt(arr[2]);
        System.out.println((hr+min+sec));

    }
}
