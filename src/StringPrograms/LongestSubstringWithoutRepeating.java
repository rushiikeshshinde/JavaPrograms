package StringPrograms;

import java.util.Scanner;

public class LongestSubstringWithoutRepeating {

    public static int lengthOfLongestSubstring(String s) {
        // Array to store the last index of each character
        int[] lastIndex = new int[128];  // Assuming ASCII characters
        int maxLength = 0;
        int start = 0;

        // Initialize the array with -1 (indicating character hasn't been seen)
        for (int i = 0; i < 128; i++) {
            lastIndex[i] = -1;
        }

        // Expand the window with the end pointer
        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);

            // If the character was seen before, update the start pointer
            if (lastIndex[currentChar] != -1) {
                // Move start pointer to the right of the last occurrence of currentChar
                start = Math.max(start, lastIndex[currentChar] + 1);
            }

            // Update the last seen index of the current character
            lastIndex[currentChar] = end;

            // Calculate the maximum length
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println("Length of the longest substring without repeating characters: " + lengthOfLongestSubstring(s));
    }
}
