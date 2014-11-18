import java.util.*;
import javax.swing.*;
import java.awt.*;


class Day
{
    public static int day;
    public static String days;

    public Day()
    {
        setDay(1); 
    }

    public Day (int day)
    {
        if( (day >0) &&(day <8))
        {
            this.day=day;
           setDay(day);
       }
       else
       {
           day =(day%7);
           if(day ==0)
              day =7;
       this.day =day;
       setDay(day);
       }
              
     
    }

    public String toString()
    {
        return (days);
    }
  
  
    public void setDay(int daycal)
    {
        /**
         * Set the day of the week.
         */
        if (daycal == 1)
           days = "Sun";
        if (daycal ==2)
           days = "Mon";
        if (daycal ==3)
           days = "Tue";
        if (daycal ==4)
           days = "Wed";
        if (daycal ==5)
           days = "Thur";
        if (daycal ==6)
           days = "Fri";
        if (daycal ==7)
           days = "Sat";
     }
     public Day setNameDay(String day)
     {
     /**
      * Return the day.
      */
         days = day;
      
         return this;
     }
  
     public void printDay()
     {
         /**
          * Print the day. 
          */
         if (day <8)
            System.out.print(days);
     }
  
     public void nextDay()
     {
         /**
          * Return the next day. 
          */
         int daynext =day;
       daynext++;
      
         if (daynext <8)
                setDay(daynext);
   else
   {
       setDay(daynext-7);
   }//end of else
     }
  
     public void previousDay()
     {
         /**
          * Return the previous day. 
          */
          int dayprev=day;
   dayprev--;
      
         if(dayprev <1)
         {
            dayprev = 7;
         }
   setDay(dayprev);
     }
  
     public void calculateDay()
     {
         /**
          * Calculate and return the day by adding certain days to the current day.
    	  * Add the appropriate constructors.
    	  */
         int calc = 0;
         String str;
         int dayAdd =0;
      
         str =JOptionPane.showInputDialog("Enter number of days to add");
         calc =Integer.parseInt(str);
      
         dayAdd = day +calc;
      
         dayAdd = dayAdd %7;
   if(dayAdd ==0)
       dayAdd = 7;
      
        setDay(dayAdd);

         printDay();
     }
}
