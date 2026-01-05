package Assignment.day2;
class First
{
    public int findfirst(int[] arr)
    {
        int min = arr[0];
        for(int i = 0;i<arr.length;i++)
        {
            if(min>arr[i])
            {
                min = arr[i];
            }
        }
        return min;
    }
}
class Find
{
    public int findindsecond(int[] arr)
    {
        First obj  = new First();
        int min = obj.findfirst(arr);
        int sec_min = arr[0];
        for(int j = 0;j<arr.length;j++)
        {
            if(min!=arr[j] && sec_min>arr[j])
            {
                sec_min = arr[j];
            }
        }
        return sec_min;
    }
}
public class SecondLargest
{

    //Assignment.week2.Find the Second smallest number in the array {23,45,67,32,89,22 }
    public static void main(String[] args)
    {
        int[] arr = {23,45,67,32,89,22 };
        Find obj = new Find();
        System.out.println(obj.findindsecond(arr));
    }
}
