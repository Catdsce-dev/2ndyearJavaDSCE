import java.util.Scanner;

public class EX10ExceptionHandlingExample
{
    // Method that may throw an exception
    static int divide(int a, int b) throws ArithmeticException
    {
        return a / b; // May throw ArithmeticException if b = 0
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        try
        {
// Input two numbers
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();
// Try to divide the numbers

            int result = divide(num1, num2);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e)
        {
            System.out.println(" Exception caught: Division by zero is not allowed!");
        } finally
        {
            System.out.println("Finally block executed: Program ended gracefully.");
        }
        sc.close();
    }
}
