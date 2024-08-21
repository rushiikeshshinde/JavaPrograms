package Day2CoreJava;

import java.util.Scanner;

public class ExactDivisors {

    public static int countIntegersWithXDivisors(int limit, int x) {
        int count = 0;
        for (int num = 1; num <= limit; num++) {
            if (countDivisors(num) == x) {
                count++;
            }
        }
        return count;
    }

    private static int countDivisors(int n) {
        int divisors = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    divisors++;
                } else {
                    divisors += 2;
                }
            }
        }
        return divisors;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = sc.nextInt();
        System.out.print("Enter the number of divisors: ");
        int x = sc.nextInt();

        int result = countIntegersWithXDivisors(limit, x);

        System.out.println("Number of integers up to " + limit +
                " with exactly " + x + " divisors: " + result);
    }


}
