import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class  TaskB {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a Roman Number: ");
            String romanNumber = scanner.nextLine().toUpperCase(); // Convert to uppercase for case insensitivity

            int result = romanToInteger(romanNumber);
            System.out.println("Integer Value: " + result);
        }
    }

    public static int romanToInteger(String s) {
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int value = romanValues.get(s.charAt(i));

            if (value < prevValue) {
                result -= value;
            } else {
                result += value;
            }

            prevValue = value;
        }

        return result;
    }
}
