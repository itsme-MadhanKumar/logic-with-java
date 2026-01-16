package dailyCodeChallenge.day2;

import javax.naming.InsufficientResourcesException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindingSecondLowest {
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
                    List<Integer> l = Arrays.asList();
                    int temp = arr[i];
                    arr[i]= arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print(arr[1]);

    }
}
