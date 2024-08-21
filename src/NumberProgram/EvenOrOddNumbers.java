package NumberProgram;
// Import Scanner Utility
import java.util.Scanner;

// Created a class EvenOrOddNumbers
public class EvenOrOddNumbers {
    static void evenOrOdd(int a){

        // If-else block is used to check whether the number is even or odd or less than 0.
        if (a <= 0) {
            System.out.println("Please enter a number greater than 0");
        }
        else if (a%2==0){
            System.out.println("The number is even");
        }
        else {
            System.out.println("The number is odd");
        }

    }

    // Main Method
    public static void main(String[] args){

        // Used Scanner Utility to take user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        // This calls the method and prints output
        evenOrOdd(number);
    }
}

