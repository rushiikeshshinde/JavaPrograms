package StringPrograms;

import java.util.Scanner;

public class StringCompression {

    static void stringCompress(String str) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            // Check if the next character is the same as the current one
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                // Append the character and its count to the compressed string
                compressed.append(str.charAt(i));
                if (count > 1) {
                    compressed.append(count);
                }
                count = 1;  // Reset count for the next new character
            }
        }

        System.out.println(compressed.toString());
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        stringCompress(str);
    }
}
