import java.util.Scanner;
public class EX1PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        String original = s;
        s = s.toLowerCase(); // optional: ignore case
        int i = 0, j = s.length() - 1;
        boolean isPal = true;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                isPal = false;
                break;
            }
            i++;
            j--;
        }
        if (isPal) {
            System.out.println("\"" + original + "\" is a palindrome.");
        } else {
            System.out.println("\"" + original + "\" is not a palindrome.");
        }
        sc.close();
    }
}