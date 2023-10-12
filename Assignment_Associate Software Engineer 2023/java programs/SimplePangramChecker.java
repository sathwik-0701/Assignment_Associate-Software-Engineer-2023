
import java.util.Scanner;

public class SimplePangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine().toLowerCase(); // Convert to lowercase for case insensitivity

        boolean isPangram = checkIfPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }

        scanner.close();
    }

    public static boolean checkIfPangram(String input) {
        // Create a boolean array to track the presence of each alphabet letter (A to Z)
        boolean[] isPresent = new boolean[26];

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is an alphabet letter (a to z)
            if (ch >= 'a' && ch <= 'z') {
                // Mark the corresponding letter as present
                isPresent[ch - 'a'] = true;
            }
        }

        // Check if all letters from 'a' to 'z' are present
        for (boolean letterPresent : isPresent) {
            if (!letterPresent) {
                return false; // If any letter is missing, it's not a pangram
            }
        }

        return true; // All letters are present, it's a pangram
    }
}

