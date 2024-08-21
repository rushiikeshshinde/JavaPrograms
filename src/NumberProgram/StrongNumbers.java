package NumberProgram;
// Import Scanner Utility
import java.util.Scanner;

// Created a class StrongNumbers
public class StrongNumbers {

    // Create a method 'strongNumbers' with 'num' as input
    public static void strongNumbers(int num){

        // Initializing Variables
        int factorial = 1;
        int number = num;
        int sum = 0;
        int rem;

        // Using while loop to slice numbers
        while(num!=0){
            rem = num % 10;

            // Using for loop to multiply 'i' and store it to factorial
            for(int i = rem; i>=1; i--){
                factorial *= i;
            }
            num = num / 10;

            // factorial values are added into sum
            sum += factorial;

            // 'factorial' is reset to 1
            factorial = 1;
        }

        // If-else block is used to compare 'number' and 'sum'
        if (number == sum){
            System.out.println(number +" is a Strong Number.");
        }
        else {
            System.out.println(number +" is not a Strong Number.");
        }

    }

    // Main Method
    public static void main(String[] args){

        // Used Scanner Utility to take user input
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // This calls the method and prints output
        strongNumbers(number);

    }

}
