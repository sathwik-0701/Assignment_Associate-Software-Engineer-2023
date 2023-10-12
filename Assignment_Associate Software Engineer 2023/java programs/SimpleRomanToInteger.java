import java.util.Scanner;

public class SimpleRomanToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine().toUpperCase(); // Convert to uppercase for case insensitivity

        int result = romanToInt(romanNumeral);
        System.out.println("The integer equivalent of " + romanNumeral + " is: " + result);

        scanner.close();
    }

    public static int romanToInt(String s) {
        int result = 0;
        int prevValue = 0; // To keep track of the previous character's value

        // Iterate through the Roman numeral from left to right
        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currentValue = romanCharToInt(currentChar);

            if (currentValue < prevValue) {
                result -= currentValue; // Subtract if the current value is smaller
            } else {
                result += currentValue; // Add if the current value is equal or larger
            }

            prevValue = currentValue; // Update the previous value
        }

        return result;
    }

    public static int romanCharToInt(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0; // Invalid character
        }
    }
}
