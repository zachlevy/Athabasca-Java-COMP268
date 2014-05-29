/* ConsoleReader.java - use to read input from the keyboard.
 * Examples of use:
 * First, declare and initialize a ConsoleReader object:
 * ConsoleReader console = new ConsoleReader(System.in);
 * Next, use the desired method:
 * console.readLine() // returns a String
 * console.readInt() // returns an int
 * console.readDouble() // returns a double
 */
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.IOException;

public class ConsoleReader {
	private BufferedReader reader;

	public ConsoleReader(InputStream inStream) {
		reader = new BufferedReader(new InputStreamReader(inStream));
	}

	public String readLine() {
		String inputLine = "";
		try {
			inputLine = reader.readLine();
		} catch (IOException e) {
			System.out.println(e);
			System.exit(1);
		}
		return inputLine;
	}
	public int readInt() {
		String inputString = readLine();
		int n = Integer.parseInt(inputString);
		return n;
	}

	public double readDouble() {
		String inputString = readLine();
		double x = Double.parseDouble(inputString);
		return x;
	}
}