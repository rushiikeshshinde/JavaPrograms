package NumberProgram;
// Import Scanner Utility
import java.util.Scanner;

// Created a class FactorialOfGivenNum
public class FactorialOfGivenNum {

    // Create a method 'factorialOf' with 'n' as input
    public static int factorialOf(int n){

        // Initializing Variable
        int factorial = 1;

        // For loop is used to Multiply 'i' from n to 1 and store it in 'factorial'
        for(int i = n; i>=1; i--){
            factorial *= i;
        }

        // Returns 'factorial'
        return factorial;
    }

    // Main Method
    public static void main(String[] args){

        // Used Scanner Utility to take user input
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // This calls the method and prints output
        System.out.println(factorialOf(number));

    }

}
