package dailyCodeChallenge.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlternatePrime_Fib
{ public static List<Integer> findingFib(int n)
{
    int a = 0;
    int b = 1;
    int c = 1;
    List<Integer> fib = new ArrayList<Integer>();
    fib.add(a);fib.add(b);
    for(int i = 2;i<n;i++)
    {
        a = b;
        b = c;
        fib.add(c);
        c = a+b;
    }
    return fib;
}
    public static List<Integer> findingPrime(int n)
    {
        List<Integer> prime = new ArrayList<Integer>();
        for(int i =2;i<20;i++)
        {
            boolean flag = true;
            for(int j = 2;j<i;j++)
            {
                if(i%j==0)
                {
                    flag = false;
                    break;
                }
            }
            if(flag)
            {
                prime.add(i);
            }
        }
        return prime;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<Integer> fib = findingFib(n);
        List<Integer> prime = findingPrime(n);
        for(int i = 0;i<n;i++)
        {
            System.out.print(prime.get(i)+" "+fib.get(i)+" ");
        }
        // System.out.println(fib);
        // System.out.println(prime);
    }
}
