package Assignment.day1;

public class Assignment2
{
    public static void makeCall()
    {
        //mobileModel (String),mobileWeight (float)
        String mobileModel = "Oppo A3x";
        float weight = 202.2F;
        System.out.println("My mobile is "+mobileModel+" and weight is "+weight);
    }
    public static void sendMsg()
    {
        //isFullCharged (boolean),mobileCost (int)
        boolean isfullcharged = true;
        int cost  = 13500;
        System.out.println((isfullcharged) ? "My mobile is fullycharged and cost is "+cost: "My mobile is not full changed and cose is "+cost);
    }
    //Assignment 2:
    //
    //- Create package name as week1.day1 under src/main/java
    //- Create a  new class as "Mobile" under week1.day1
    //- Create 2 methods (makeCall() , sendMsg()) with simple print statement
    //- In first method create variable  mobileModel (String),mobileWeight (float)
    //- In second method create variable  isFullCharged (boolean),mobileCost (int)
    //- Create main method
    //Create object for class and call  from main method and print them
    //- print a statement---->"This is my mobile";
    //-run and confirm the output printed in console
    public static void main(String[] args)
    {
       makeCall();
       sendMsg();
    }
}
