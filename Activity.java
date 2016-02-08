

package smartplanner;

import java.util.*;
import java.text.*;
import java.io.*;

public class Activity {
    
    String name;
    String date;
    int duration;
    String urgency;
    
    Activity()
    
    void show(){
        
    System.out.println("You have added a new activity:  " + this.name); 
    System.out.println("On:  " + this.date);
    System.out.println("With the duration of:  " + this.duration + " hours"); 
    System.out.println("The activity is marked as:  " + this.urgency); 
   
    }
    
    void writeToFile(){
    
    try {

	File file = new File("filename.txt");

	// if file doesnt exists, then create it
	if (!file.exists()) {
            file.createNewFile();
		}

	FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
        try (BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(this.name);
            bw.newLine();
            bw.write(this.date);
            bw.newLine();
            bw.write(this.duration);
            bw.newLine();
            bw.write(this.urgency);
            bw.newLine();
        }

	System.out.println("Done");

	} catch (IOException e) {
            e.printStackTrace();
	}
    
    
     }
}
