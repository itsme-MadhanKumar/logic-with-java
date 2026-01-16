package dailyCodeChallenge.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindingIntersectionOfThreeArrays
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        List<Integer> l1 = new ArrayList<>();
        for(int i = 0;i<n1;i++)
        {
            l1.add(input.nextInt());
        }
        List<Integer> l2 = new ArrayList<>();
        int n2 = input.nextInt();
        for(int i = 0;i<n2;i++)
        {
            l2.add(input.nextInt());
        }
        List<Integer> l3 = new ArrayList<>();
        int n3 = input.nextInt();
        for(int i = 0;i<n3;i++)
        {
            l3.add(input.nextInt());
        }
        l1.retainAll(l2);
        l1.retainAll(l3);
        if(l1.isEmpty())
        {
            System.out.println("NO Elements");
        }
        else
        {
            l1.forEach(a->{
                System.out.print(a+" ");
            });
        }
    }
}
