package Day2CoreJava;

public class PrimeNumberInRange {

    public static void main(String[] args) {

        int i, j, count;

        // Using for loop to define range given by user input
        for (i = 1; i <= 100; i++) {

            // Using if condition to check whether 'i' is 0 or 1.
            if (i == 0 || i == 1) {
                continue;
            }

            // Initialized count = 2
            count = 2;

            // Using for loop to create range from 2 to 'i-2'
            for (j = 2; j <= i - 2; j++) {

                // Using if condition to check whether 'i' is divisible by 'j' or not
                if (i % j == 0) {
                    count++;
                    break;
                }
            }

            // If condition is used to check count is 2 or not which eliminates non-prime numbers
            if (count == 2) {
                System.out.println(i);
            }
        }

    }
}