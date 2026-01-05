package Assignment.week1;
class Student
{
    String name = "Madhan";
    String roll = "21CE008";
    String college = "Sri Shakthi Institute of Engineering and Technology";
    float marks = 81f;
    float cgpa = 8.07f;
}
public class Assignment5
{
    //Assignment:5
    //=========
    //Create Class Student
    //declare variables
    //studentName
    //rollNo
    //collegeName
    //markScored
    //cgpa
    //
    //Create a class Report and create object for student class in main method and print all the variables
    public static void main(String[] args)
    {
        Student obj = new Student();
        System.out.println(obj.name);
        System.out.println(obj.roll);
        System.out.println(obj.college);
        System.out.println(obj.cgpa);
        System.out.println(obj.marks);
    }
}
