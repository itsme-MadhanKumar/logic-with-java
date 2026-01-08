package Test;

public class Question14
{
    public static void main(String[] args)
    {
        String s = "changeme";
        s = s.toLowerCase();
        for(int i = 0;i<s.length();i++)
        {
            if(i%2==0)
            {
                System.out.print(Character.toLowerCase(s.charAt(i)));
            }
            else
            {
                System.out.print(Character.toUpperCase(s.charAt(i)));
            }
        }
    }
}
