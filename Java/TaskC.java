import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class  TaskC {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a sentence: ");
            String sentence = scanner.nextLine().toLowerCase(); // Convert to lowercase for case insensitivity

            boolean isPangram = isPangram(sentence);
            if (isPangram) {
                System.out.println("The sentence is a pangram.");
            } else {
                System.out.println("The sentence is not a pangram.");
            }
        }
    }

    public static boolean isPangram(String sentence) {
        Set<Character> alphabetSet = new HashSet<>();

        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                alphabetSet.add(c);
            }
        }

        return alphabetSet.size() == 26; // There are 26 letters in the English alphabet
    }
}
