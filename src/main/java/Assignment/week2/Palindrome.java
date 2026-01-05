package Assignment.week2;

public class Palindrome
{
    //Assignment:2
    //
    //Check the given number is palindrome or not
    //
    //Int num =34343
    //
    //Initialize a  temporary variable.
    //
    //Reverse the number (using for loop and add to the temporary variable)
    //
    //Compare the temporary number with reversed number
    //
    //If both numbers are same, print "palindrome number"
    //
    //Else print "not palindrome number"
    public static void main(String[] args)
    {
        int num = 34343;
        int t = num;
        int rem = 0;
        while (num!=0)
        {
            int temp = num%10;
            rem = rem * 10 + temp;
            num = num/10;
        }
        System.out.println((t==rem) ? "The given number is Palindrome" : "The given Number is not a Palindrome");
    }
}
