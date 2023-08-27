/* Write a program in Java to copy the content of a given file 
to another user entered file using character stream. */

import java.io.*;

public class lab9q4 {
    public static void main(String[] args) {
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try {
            reader = new BufferedReader(new FileReader("input.txt")); // input file
            System.out.println("Enter output file name:");
            String fileName = new BufferedReader(new InputStreamReader(System.in)).readLine(); // user-entered output file name
            writer = new BufferedWriter(new FileWriter(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Content has been copied successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null)
                    reader.close();
                if (writer != null)
                    writer.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
