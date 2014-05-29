
/**
 * Write a description of class VoiceExmaple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.io.*;
import java.text.NumberFormat;


public class VoiceExmaple
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class VoiceExmaple
     */
    public VoiceExmaple()
    {
		// first comment
		// Get the number of seconds from the user.
		// Create a ConsoleReader object to simplify input.
		ConsoleReader console = new ConsoleReader(System.in);
		System.out.print("Please enter a number of seconds: ");
		double sec = console.readDouble(); 

		// second comment
		// Calculate the number of kilobytes. 
		final int KBYTE = 1024; // 1 kb = 1024 bytes
		final int VOICE_BYTES_PER_SECOND = 8000;
		final int VOICE_KB_PER_SECOND = 8000 / KBYTE;
		double voiceKB = sec / VOICE_KB_PER_SECOND;

		// third comment
		// Print the result on the screen.
		NumberFormat formatter = NumberFormat.getNumberInstance();
		formatter.setMaximumFractionDigits(2);
		System.out.println("\n\n" + formatter.format(sec)
				+ " seconds of voice " + "requires "
				+ formatter.format(voiceKB) + "kb of " + "storage\n");
    }
}
