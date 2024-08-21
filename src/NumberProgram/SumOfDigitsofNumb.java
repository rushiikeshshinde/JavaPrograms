package NumberProgram;
// Import Scanner Utility
import java.util.Scanner;

// Created a class SumOfDigitsofNumb
public class SumOfDigitsofNumb {

    // Create a method 'sumOfDigits' with 'a' as input
    public static String sumOfDigits(int a){

        // Initializing variable 'sum'
        int sum = 0;

        // Using while loop to add sum of digits to 'sum' until a becomes zero
        while(a!=0){
            sum = sum + a % 10;
            a = a/10;
        }

        // Returns 'sum'
        return "Sum of digits is "+sum;

    }

    // Main Method
    public static void main(String[] args){

        // Used Scanner Utility to take user input
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // This calls the method and prints output
        System.out.println(sumOfDigits(number));

    }

}
