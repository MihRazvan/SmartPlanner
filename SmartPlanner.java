
package smartplanner;
package com.mkyong;

import java.util.*;
import java.text.*;
import java.io.*;

public class SmartPlanner {

 
    public static void main(String[] args) {

    System.out.println("Welcome user\n")    
        
    Date date = new Date();
    SimpleDateFormat ft = 
      new SimpleDateFormat ("dd.MM.yyyy");
    
    System.out.println("Today is: " + ft.format(date))"\n";
    
   
    
    Activity activity = new Activity();    
    
    Scanner input = new Scanner(System.in);
    
     System.out.println("Insert name of activity:");
        String readName = input.next();
 
    activity.name = readName;
    
    
    System.out.println("Insert date of activity:");
        String readDate = input.next();
 
    activity.date = readDate;
    
    
    System.out.println("Insert duration (in hours):");
        int readDuration = input.nextInt();
        
    activity.duration = readDuration; 
    
    
     System.out.println("Insert importance (urgent / important / meh):");    
        String readImportance = input.next();
        
    activity.urgency = readImportance; 
    
   System.out.println("You have added a new activity:  " + activity.name); 
   System.out.println("On:  " + activity.date);
   System.out.println("With the duration of:  " + activity.duration + " hours"); 
   System.out.println("The activity is marked as:  " + activity.urgency);   
   
    }
    
}
