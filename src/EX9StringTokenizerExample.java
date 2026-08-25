import java.util.Scanner;
import java.util.StringTokenizer;

public class EX9StringTokenizerExample
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
// Step 1: Read a line of integers
        System.out.println("Enter a line of integers separated by spaces:");
        String inputLine = sc.nextLine();
// Step 2: Create StringTokenizer to split the input line
        StringTokenizer st = new StringTokenizer(inputLine);
        int sum = 0;
        System.out.println("\nThe integers are:");
// Step 3: Process each token
        while (st.hasMoreTokens())
        {
            String token = st.nextToken();
            int num = Integer.parseInt(token);

            System.out.println(num);
            sum += num;
        }
// Step 4: Display the sum
        System.out.println("\nSum of all integers = " + sum);
        sc.close();
    }
}
