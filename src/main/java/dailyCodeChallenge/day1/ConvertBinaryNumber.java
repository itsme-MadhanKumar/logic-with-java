package dailyCodeChallenge.day1;
import java.util.Scanner;
public class ConvertBinaryNumber
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 0;i<n;i++)
        {
            int num = input.nextInt();
            for(int j = 1;j<=num;j++)
            {
                System.out.print(Integer.toBinaryString(j)+" ");
            }
            System.out.println();
        }
    }
}
