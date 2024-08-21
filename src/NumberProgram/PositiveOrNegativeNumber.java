package NumberProgram;
// Import Scanner Utility
import java.util.Scanner;

// Created a class PositiveOrNegativeNumber
public class PositiveOrNegativeNumber {

    // Create a method 'PositiveOrNegativeNumber' with 'a' as input
    public static String positiveOrNegative(float a){

        // If-else bloc is used to check whether the given number is positive negative or neither any of them
        if (a < 0){
            return "Negative Number";
        }
        else if (a == 0){
            return "Neither positive nor negative";
        }
        else{
            return "Positive Number";
        }

    }

    // Main Method
    public static void main(String[] args) {

        // Used Scanner Utility to take user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        float number = sc.nextFloat();

        // This calls the method and prints output
        String answer = positiveOrNegative(number);
        System.out.println(number + " is a " + answer);

    }

}
