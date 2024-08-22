package StringPrograms;

public class FindAllAnagrams {
    public static String findAnagrams(String s, String p) {
        StringBuilder result = new StringBuilder();

        // Base condition: if p is longer than s, no anagrams possible
        if (p.length() > s.length()) {
            return "";
        }

        // Frequency arrays to store the counts of characters
        int[] pCount = new int[26]; // Assuming lowercase English letters
        int[] sCount = new int[26];

        // Fill the frequency array for the string p
        for (int i = 0; i < p.length(); i++) {
            pCount[p.charAt(i) - 'a']++;
        }

        // Initialize the sliding window on the first p.length() characters of s
        for (int i = 0; i < p.length(); i++) {
            sCount[s.charAt(i) - 'a']++;
        }

        // Check the first window
        if (areCountsEqual(pCount, sCount)) {
            result.append(0).append(",");
        }

        // Slide the window over the rest of the string s
        for (int i = p.length(); i < s.length(); i++) {
            // Add the next character in the window
            sCount[s.charAt(i) - 'a']++;
            // Remove the character that is no longer in the window
            sCount[s.charAt(i - p.length()) - 'a']--;

            // Compare the counts of the current window with p
            if (areCountsEqual(pCount, sCount)) {
                result.append(i - p.length() + 1).append(",");
            }
        }

        // Remove the trailing comma if result is not empty
        if (result.length() > 0) {
            result.setLength(result.length() - 1);
        }

        return result.toString();
    }

    // Helper method to compare two frequency arrays
    private static boolean areCountsEqual(int[] pCount, int[] sCount) {
        for (int i = 0; i < 26; i++) {
            if (pCount[i] != sCount[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        String result = findAnagrams(s, p);
        System.out.println(result);  // Output: 0,6
    }
}