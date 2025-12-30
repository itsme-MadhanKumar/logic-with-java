public class Factorial
{
    public void findFactorial(int num)
    {
        System.out.print("Factorial of "+num+" is : ");
        int fact = 1;
        for(int i = num;i>=1;i--)
        {
            fact = fact * i;
        }
        System.out.print(fact);
    }
    public static void main(String[] args)
    {
        Factorial obj = new Factorial();
        obj.findFactorial(5);
    }
}
