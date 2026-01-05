package Assignment.week2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class MissingElement
{
    // Here is the input
    //		int[] arr = {1,2,3,4,7,6,8};
    //
    //		// Sort the array
    //
    //
    //		// loop through the array (start i from arr[0] till the length of the array)
    //
    //			// check if the iterator variable is not equal to the array values respectively
    //
    //				// print the number
    //
    //				// once printed break the iteration
    //
    //
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,7,6,8};
        List<Integer> list = new ArrayList<>();
        for(int n : arr)
        {
            list.add(n);
        }
        Collections.sort(list);
        System.out.println(list);
        int num = -1;
        for(int i = 0;i<list.size();i++)
        {
            if((i+1)!=list.get(i))
            {
                num = i+1;
                break;
            }
        }
        System.out.println((num==-1) ? "There is not missed element" : "The missed element is "+num);
    }
}
