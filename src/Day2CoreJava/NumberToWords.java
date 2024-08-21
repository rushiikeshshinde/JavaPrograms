package Day2CoreJava;

import java.math.BigInteger;

public class NumberToWords {
    private static final String[] ones = {
            "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    private static final String[] tens = {
            "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    private static final String[] scales = {"", "thousand", "million", "billion", "trillion", "quadrillion", "quintillion"};

    public static String convertToWords(BigInteger number) {
        if (number.equals(BigInteger.ZERO)) {
            return "zero";
        }

        String words = "";
        int scaleIndex = 0;

        while (number.compareTo(BigInteger.ZERO) > 0) {
            if (!number.mod(BigInteger.valueOf(1000)).equals(BigInteger.ZERO)) {
                words = convertHundreds(number.mod(BigInteger.valueOf(1000)).intValue()) + scales[scaleIndex] + " " + words;
            }
            number = number.divide(BigInteger.valueOf(1000));
            scaleIndex++;
        }

        return words.trim();
    }

    private static String convertHundreds(int number) {
        String current;

        if (number % 100 < 20) {
            current = ones[number % 100];
            number /= 100;
        } else {
            current = ones[number % 10];
            number /= 10;

            current = tens[number % 10] + (current.isEmpty() ? "" : "-" + current);
            number /= 10;
        }

        if (number == 0) {
            return current;
        }

        return ones[number] + " hundred" + (current.isEmpty() ? "" : " " + current);
    }

    // ... (previous code for convertToWords, convertHundreds, and arrays remains the same)

    public static void main(String[] args) {
        BigInteger[] numbers = {
                BigInteger.ZERO,
                BigInteger.ONE,
                BigInteger.valueOf(7),
                BigInteger.valueOf(42),
                BigInteger.valueOf(100),
                BigInteger.valueOf(101),
                BigInteger.valueOf(999),
                BigInteger.valueOf(1000),
                BigInteger.valueOf(1001),
                BigInteger.valueOf(1234),
                BigInteger.valueOf(9876),
                BigInteger.valueOf(10000),
                BigInteger.valueOf(21212),
                BigInteger.valueOf(100000),
                BigInteger.valueOf(123456),
                BigInteger.valueOf(1000000),
                BigInteger.valueOf(1234567),
                BigInteger.valueOf(12345678),
                BigInteger.valueOf(123456789),
                BigInteger.valueOf(1000000000),
                new BigInteger("1234567890"),
                new BigInteger("12345678901"),
                new BigInteger("123456789012"),
                new BigInteger("1234567890123"),
                new BigInteger("12345678901234"),
                new BigInteger("123456789012345"),
                new BigInteger("1234567890123456"),
                new BigInteger("12345678901234567"),
                new BigInteger("123456789012345678"),
                new BigInteger("1234567890123456789"),
                new BigInteger("12345678901234567890"),
                new BigInteger("123456789012345678901"),
//                new BigInteger("1234567890123456789012"),
//                new BigInteger("12345678901234567890123"),
//                new BigInteger("123456789012345678901234"),
//                new BigInteger("1234567890123456789012345"),
//                new BigInteger("12345678901234567890123456"),
//                new BigInteger("123456789012345678901234567"),
//                new BigInteger("1234567890123456789012345678"),
//                new BigInteger("12345678901234567890123456789"),
//                new BigInteger("123456789012345678901234567890"),
//                new BigInteger("1000000000000000000000000000000"),
//                new BigInteger("9876543210987654321098765432109876543210")
        };

        for (BigInteger number : numbers) {
            System.out.println(number + ": " + convertToWords(number));
        }
    }
}