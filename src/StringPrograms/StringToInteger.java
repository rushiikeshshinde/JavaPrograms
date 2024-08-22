package StringPrograms;

public class StringToInteger {
    public static int atoi(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        // Remove leading and trailing whitespace
        s = s.trim();

        int sign = 1;
        int result = 0;
        int i = 0;

        // Check for sign
        if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '+') ? 1 : -1;
            i++;
        }

        // Process digits
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // Check for overflow
            if (result > Integer.MAX_VALUE / 10 ||
                    (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return sign * result;
    }

    public static void main(String[] args) {
        System.out.println(atoi("4193 with words")); // Output: 4193
    }
}