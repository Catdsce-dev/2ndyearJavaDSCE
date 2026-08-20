import java.util.Scanner;
public class EX3MatrixMultiplication
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
// Input for first matrix
        System.out.print("Enter number of rows for Matrix A: ");
        int rowsA = scanner.nextInt();
        System.out.print("Enter number of columns for Matrix A: ");
        int colsA = scanner.nextInt();

// Input for second matrix
        System.out.print("Enter number of rows for Matrix B: ");
        int rowsB = scanner.nextInt();
        System.out.print("Enter number of columns for Matrix B: ");
        int colsB = scanner.nextInt();

// Validate matrix multiplication condition
        if (colsA != rowsB)
        {
            System.out.println("Matrix multiplication not possible. Columns of A must equal rows of B.");
            return;
        }
        int[][] matrixA = new int[rowsA][colsA];
        int[][] matrixB = new int[rowsB][colsB];
        int[][] result = new int[rowsA][colsB];

// Input Matrix A
        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < rowsA; i++)
        {
            for (int j = 0; j < colsA; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }

// Input Matrix B
            System.out.println("Enter elements of Matrix B:");
            for (int i = 0; i < rowsB; i++)
            {
                for (int j = 0; j < colsB; j++)
                {
                    matrixB[i][j] = scanner.nextInt();
                }
            }
// Perform matrix multiplication
            for (int i = 0; i < rowsA; i++)
            {
                for (int j = 0; j < colsB; j++)
                {
                    for (int k = 0; k < colsA; k++)
                    {
                        result[i][j] += matrixA[i][k] * matrixB[k][j];
                    }
                }
            }
// Display the result
            System.out.println("Resultant Matrix after Multiplication:");
            for (int i = 0; i < rowsA; i++)
            {
                for (int j = 0; j < colsB; j++)
                {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
            scanner.close();
        }
    }