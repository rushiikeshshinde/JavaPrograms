package NumberProgram;
// Import Scanner Utility
import java.util.Scanner;

// Created a class FactorsOfNumbers
public class FactorsOfNumbers {

    // Create a method 'factorialOfNums' with 'n' as input
    public static void factorialOfNums(int n){

        // Prints 1 in output as 1 is common factors for natural numbers
        System.out.print(1);

        // Used for loop for creating range upto nth number
        for(int i = 2;i<n; i++){

            // Used if loop to sort divisible numbers from the above range
            if(n%i==0){
                System.out.print(","+i);
            }
        }

    }

    // Main Method
    public static void main(String[] args){

        // Used Scanner Utility to take user input
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // This calls the method and prints output
        factorialOfNums(number);

    }

}
