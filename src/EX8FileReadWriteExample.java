import java.io.*;

public class EX8FileReadWriteExample
{
    public static void main(String[] args)
    {
// Define input and output file names
        String inputFile = "input.txt";
        String outputFile = "output.txt";
// Try-with-resources for automatic resource management
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile)))
        {
            String line;
// Read line by line from input file
            while ((line = reader.readLine()) != null)
            {
                writer.write(line);
                writer.newLine(); // write new line
            }

            System.out.println(" File has been read and written successfully.");
        } catch (FileNotFoundException e)
        {
            System.out.println(" Error: Input file not found.");
        } catch (IOException e)
        {
            System.out.println(" Error occurred while reading or writing the file.");
        }
    }
}
