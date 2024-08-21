package NumberProgram;
// Import Scanner Utility
import java.util.Scanner;

// Created a class FibonacciNthTermFind
public class FibonacciNthTermFind {

    // Create a method 'isArmstrong' with 'n' as input
    public static void fibonacciFindNthTerm(int n) {

        // Initializing Variables
        int a = 0;
        int b = 1;
        int nextTerm;

        // Using for loop to create range from 2 to n
        for (int i = 2; i <= n; i++) {

            // Swapping variables
            nextTerm = a + b;
            a = b;
            b = nextTerm;

            // Using if loop to compare i and n to get nth term
            if (i == n) {
                System.out.print(nextTerm);
            }

        }


        }

    // Main Method
    public static void main(String[] args){

        // Used Scanner Utility to take user input
        Scanner sc = new Scanner(System.in);
        int nth_term = sc.nextInt();

        // This calls the method and prints output
        fibonacciFindNthTerm(nth_term);


    }
}

