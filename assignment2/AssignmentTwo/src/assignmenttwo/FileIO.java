/*
 * 
 * 1.	Write a Java program that highlights file I/O operations in Java.
 */

package assignmenttwo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


/**
 *
 * @author zacharylevy
 * @version 20140716
 */

// class copies file called input.txt and and makes a new one caled output.txt
public class FileIO {
    // instance vars
    // buffered
    BufferedReader inputStream = null;
    PrintWriter outputStream = null;
    // filenames
    String fromFileName;
    String bufferToFileName;

    // constructor
    // throw an exception in case the file doesn't exist
    public FileIO (String startFromFileName) {
        fromFileName = startFromFileName;
        bufferToFileName = "output.txt";
    }
    
    // example of a buffered copy of a file called input.txt
    // the input.txt file is in the project root dir
    public void bufferedCopy () throws FileNotFoundException, IOException {
        try {
            inputStream = new BufferedReader(new FileReader(fromFileName));
            outputStream = new PrintWriter(new FileWriter(bufferToFileName));
            
            // string because it reads lines not characters
            String inBetween;
            // set inbetween to the next line
            // while there's still new lines in the file
            while ((inBetween = inputStream.readLine()) != null) {
                // write the line to the output file
                outputStream.println(inBetween);
            }
        } finally {
            // when the try block finishes everything
            // close the streams so memory doesn't explode
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }    
    }
    
}
