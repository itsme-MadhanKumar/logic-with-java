package Assignment.week1;
class car
{
    public void applyBreak()
    {
        System.out.println("Break applied");
    }
    public void soundHorn()
    {
        System.out.println("Sound horn");
    }
}
public class Assignment4
{
    //Assignment 4:
    //==========
    //Create package name as week1.day1 under src/main/java
    //- Create a  new class as "Car" under week1.day1
    //- Create 2 methods(applyBreak(),soundHorn())
    //applyBreak(){print as Applied break}
    //soundHorn(){print as sound horn}
    //-Create another class as Bike
    //-Call the methods of Car class in BikeClass by creating object for Car class and Bike Class
    //Hint Create two objects for the two classess
    public static void main(String[] args)
    {
        car obj = new car();
        obj.applyBreak();
        obj.soundHorn();
    }
}
