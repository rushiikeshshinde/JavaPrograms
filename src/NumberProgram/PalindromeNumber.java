package NumberProgram;
// Import Scanner Utility
import java.util.Scanner;

// Created a class PalindromeNumber
public class PalindromeNumber {

    // Create a method 'isArmstrong' with 'num' as input
    public static String isPalindrome(int num){

        // Initializing Variables
        int number = num;
        int reversed_number = 0;

        // While loop is used to reverse the number and store it in 'reversed_number'
        while(num!=0){
            reversed_number = reversed_number * 10 + (num%10);
            num = num/10;
        }

        // if-else block is used to compare 'number' and 'reversed_number'
        if(number == reversed_number){
            return number + " is a Palindrome Number.";
        }
        else {
            return number + " is not a Palindrome Number";
        }

    }

    // Main Method
    public static void main(String[] args){

        // Used Scanner Utility to take user input
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // This calls the method and prints output
        System.out.println(isPalindrome(number));

    }

}
