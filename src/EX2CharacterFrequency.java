import java.util.Scanner;
public class EX2CharacterFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// Input string
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
// Input character
        System.out.print("Enter a character to find frequency: ");
        char ch = scanner.next().charAt(0);
        int frequency = 0;
// Convert string to char array and count occurrences
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                frequency++;
            }
        }
        System.out.println("Frequency of '" + ch + "' = " + frequency);
        scanner.close();
    }
}
