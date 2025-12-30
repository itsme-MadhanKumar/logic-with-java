import java.util.ArrayList;
public class ReverseString
{
    public static void main(String[] args)
    {
        String name = "Madhan kumar B";
        System.out.print("Reverse Order : ");
        ArrayList<Character> list = new ArrayList<>();
        for(int i = name.length()-1;i>=0;i--)
        {
            list.add(name.charAt(i));
        }
        list.forEach(System.out::print);
    }
}
