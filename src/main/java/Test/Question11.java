package Test;

public class Question11
{
    public static void main(String[] args)
    {
        // 1. factorial program
        int num =  5;
        int fact = 1;
        for(int i = 1;i<=num;i++)
        {
            fact = fact * i ;
        }
        System.out.println("The factorial of "+num+"is "+fact);
    }
}
