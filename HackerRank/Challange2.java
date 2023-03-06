import java.io.*;

public class Challange2 {
    public static void main(String[] args) throws IOException {
        // Create a BufferedReader to read from the standard input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Initialize a counter to keep track of the line numbers
        int lineNumber = 0;


        // Read the lines one by one until EOF (end-of-file) is reached
        String line;
        while ((line = reader.readLine()) != null) {
            lineNumber++; // Increment the line number
            System.out.println(lineNumber+" " +line); // Print the line number and the line itself
        }
    }
}
