
import java.util.Scanner;

public class DriverDay
{
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        Day myDay = new Day(2);
        System.out.print("The day of the week is ");
        myDay.printDay();
       System.out.println();

        System.out.print("The next day is ");
        myDay.nextDay();
        myDay.printDay();
       System.out.println();
  
   System.out.print("The previous day is ");
        myDay.previousDay();
        myDay.printDay();
       System.out.println();

       myDay.calculateDay();
       System.out.println();
    }
}
