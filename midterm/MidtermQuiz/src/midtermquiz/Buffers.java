/*
 * 
 * 5. Distinguish between buffered and unbuffered I/O in Java with example programs.
 * Explain the difference between the two.
 */

package midtermquiz;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


/**
 *
 * @author zacharylevy
 * @version 20140707
 */
public class Buffers {
    // instance vars
    // buffered
    BufferedReader inputStream = null;
    PrintWriter outputStream = null;
    // unbuffered
    FileInputStream fileIn = null;
    FileOutputStream fileOut = null;
    // filenames
    String fromFileName;
    String bufferToFileName;
    String unbufferToFileName;

    // constructor
    // throw an exception in case the file doesn't exist
    public Buffers (String startFromFileName) {
        fromFileName = startFromFileName;
        bufferToFileName = "buffered_output.txt";
        unbufferToFileName = "unbuffered_output.txt";
        
    }
    
    // example of an unbuffered copy of a file called input.txt
    // the input.txt file is in the project root dir
    public void unbufferedCopy () throws FileNotFoundException, IOException {
        // filereader is unbuffered
        FileInputStream input = new FileInputStream(fromFileName);
        // filewriter is unbuffered
        FileOutputStream output = new FileOutputStream(unbufferToFileName);

        // int because it reads chars not lines
        int inBetween;
        
        // set inbetween to the character
        // while there's still characters in the file
        while ((inBetween = input.read()) != -1) {
            // write the line to the output file
            output.write(inBetween);
        }
    }
    
    // example of a buffered copy of a file called input.txt
    // the input.txt file is in the project root dir
    public void bufferedCopy () throws FileNotFoundException, IOException {
        try {
            // filereader is unbuffered, BufferedReader makes it buffered
            inputStream = new BufferedReader(new FileReader(fromFileName));
            // filewriter is unbuffered, PrintWriter makes it buffered
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
