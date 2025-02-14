import java.util.*;

public class Cogni {
    public int findSubstring(String input1, int input2) {
        String S = input1; // Original string
        int K = input2;    // Number of repetitions

        // Count the number of 'M' and 'E' in S
        int countM = countChar(S, 'M');
        int countE = countChar(S, 'E');

        // Case 1: 'M' and 'E' are in the same repetition of S
        int sameRepetitionPairs = 0;
        int mCount = 0;
        for (char ch : S.toCharArray()) {
            if (ch == 'M') {
                mCount++;
            } else if (ch == 'E') {
                sameRepetitionPairs += mCount;
            }
        }
        sameRepetitionPairs *= K; // Multiply by K for all repetitions

        // Case 2: 'M' and 'E' are in different repetitions of S
        int differentRepetitionPairs = (countM * countE) * (K * (K - 1)) / 2;

        // Total pairs
        int totalPairs = sameRepetitionPairs + differentRepetitionPairs;

        return totalPairs;
    }

    // Helper method to count occurrences of a character in a string
    private int countChar(String str, char target) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == target) {
                count++;
            }
        }
        return count;
    }

    // Main method for testing
    public static void main(String[] args) {
        Cogni obj = new Cogni();
        String S = "ABEMEE";
        int K = 2;
        System.out.println(obj.findSubstring(S, K)); // Output: 7
    }
}