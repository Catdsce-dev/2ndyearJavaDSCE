
import java.io.*;

public class EX7FileReaderWriterDemo
{
    public static void main(String[] args)
    {
        try
        {
// Step 1: Writing to a file using FileWriter
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello, this is a file handling example in Java.\n");
            writer.write("We are using FileWriter and FileReader classes.\n");
            writer.close();
            System.out.println("Data has been written to the file successfully.");
// Step 2: Reading from the file using FileReader
            FileReader reader = new FileReader("example.txt");
            int ch;
            System.out.println("\nReading data from file:");
            while ((ch = reader.read()) != -1)
            {
                System.out.print((char) ch);

            }
            reader.close();
            System.out.println("\n\nFile reading completed successfully.");
        } catch (IOException e)
        {
            System.out.println("An error occurred: " + e.getMessage());
        }

    }
}
