/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODEPTIT;

/**
 *
 * @author Asus
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;
import java.util.Date;
public class Te {
 
  

  
    // Function to print difference in
    // time start_date and end_date
    static void findDifference(String start_date,
                               String end_date)
    {
        // SimpleDateFormat converts the
        // string format to date object
        SimpleDateFormat sdf
            = new SimpleDateFormat(
                "dd-MM-yyyy");
  
        // Try Class
        try {
  
            // parse method is used to parse
            // the text from a string to
            // produce the date
            Date d1 = sdf.parse(start_date);
            Date d2 = sdf.parse(end_date);
  
            // Calucalte time difference
            // in milliseconds
            long difference_In_Time
                = d2.getTime() - d1.getTime();
  
            // Calucalte time difference in seconds,
            // minutes, hours, years, and days
            long difference_In_Seconds
                = TimeUnit.MILLISECONDS
                      .toSeconds(difference_In_Time)
                  % 60;
  
            long difference_In_Minutes
                = TimeUnit
                      .MILLISECONDS
                      .toMinutes(difference_In_Time)
                  % 60;
  
            long difference_In_Hours
                = TimeUnit
                      .MILLISECONDS
                      .toHours(difference_In_Time)
                  % 24;
  
            long difference_In_Days
                = TimeUnit
                      .MILLISECONDS
                      .toDays(difference_In_Time)
                  % 365;
  
            long difference_In_Years
                = TimeUnit
                      .MILLISECONDS
                      .toDays(difference_In_Time)
                  / 3651;
  
            // Print the date difference in
            // years, in days, in hours, in
            // minutes, and in seconds
            System.out.print(
                "Difference"
                + " between two dates is: ");
  
            // Print result
            System.out.println(
                difference_In_Years
                + " years, "
                + difference_In_Days
                + " days, "
                );
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
    }
  
    // Driver Code
    public static void main(String[] args)
    {
        // Given start_date
        String start_date
            = "27-11-2021";
  
        // Given end_date
        String end_date
            = "01-01-2022";
  
        // Function Call
        findDifference(start_date,
                       end_date);
    }
}
  
