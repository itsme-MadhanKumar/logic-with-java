package Assignment.day2;

public class Findintersection
{
    ///*
    //	 * Pseudo Code
    //
    //	 * a) Declare An array for {3,2,11,4,6,7};
    //	 * b) Declare another array for {1,2,8,4,9,7};
    //	 * c) Declare for loop iterator from 0 to array length
    //	 * d) Declare a nested for another array from 0 to array length
    //	 * e) Compare Both the arrays using a condition statement
    //
    //	 *  f) Print the first array (shoud match item in both arrays)
    //	 */
    public static void main(String[] args)
    {
        int[] arr1 = {3,2,11,4,6,7};
        int[] arr2 = {1,2,8,4,9,7};
        int count = 0;
        for(int i : arr1)
        {
            for(int j : arr2)
            {
                if(i==j)
                {
                    System.out.print(i+" ");
                    count++;
                    break;
                }
            }
        }
        if(count==0)
        {
            System.out.println("No common numbers in both array");
        }
    }
}
