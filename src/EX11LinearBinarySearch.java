import java.util.Arrays;
import java.util.Scanner;

public class EX11LinearBinarySearch
{
    // Linear Search Method
    public static int linearSearch(int[] arr, int key)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == key)
                return i; // Return index if found
        }
        return -1; // Not found
    }

    // Binary Search Method
    public static int binarySearch(int[] arr, int key)
    {
        int low = 0, high = arr.length - 1;
        while (low <= high)
        {
            int mid = (low + high) / 2;
            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1; // Not found
    }



    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Input array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        // Input search key
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
// Linear Search
        int linearResult = linearSearch(arr, key);
        if (linearResult == -1)
            System.out.println("Linear Search: Element not found.");
        else
            System.out.println("Linear Search: Element found at position " + (linearResult + 1));
// Binary Search (array must be sorted)
        Arrays.sort(arr); // Sorting array before Binary Search
        int binaryResult = binarySearch(arr, key);
        if (binaryResult == -1)
            System.out.println("Binary Search: Element not found.");
        else
            System.out.println("Binary Search: Element found at position "
                    + (binaryResult + 1));

        sc.close();
    }
}
