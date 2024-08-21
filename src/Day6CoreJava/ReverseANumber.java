package Day6CoreJava;// Import Scanner Utility
import java.util.Scanner;

// Created a class ReverseANumber
public class ReverseANumber {

    // Create a method 'isArmstrong' with 'num' as input
    public static String reverseNumber(int num){

        // Initializing 'reversed_number'
        int reversed_number = 0;

        // Using while loop to reverse the number until number is zero and further stored in 'reversed_number'
        while(num!=0){
            reversed_number = reversed_number * 10 + (num%10);
            num = num/10;
        }

        // Returns 'reversed_number'
        return "Reversed Number: "+ reversed_number;
    }

    // Main Method
    public static void main(String[] args){

        // Used Scanner Utility to take user input
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // This calls the method and prints output
        System.out.println(reverseNumber(number));

    }

}
