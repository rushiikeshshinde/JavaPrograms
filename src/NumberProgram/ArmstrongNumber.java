package NumberProgram;
// Import Scanner Utility
import java.util.Scanner;

// Created a class ArmstrongNumber
public class ArmstrongNumber {

    // Create a method 'isArmstrong' with 'num' as input
    public static String isArmstrong(int num){

        // Initializing Variables
        int number = num;
        int sum = 0;
        int rem;

        // This while loop will split numbers and their cube is added into variable 'sum'
        while(num!=0){
            rem = num % 10;
            sum = sum + rem * rem * rem;
            num = num / 10;
        }

        // If-else block to compare 'sum' and 'number'
        if (number == sum){
            return number + " is an Armstrong Number.";
        }
        else{
            return number + " is not an Armstrong Number.";
        }
    }
    // Main Method
    public static void main(String[] args){

        // Used Scanner Utility to take user input
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // This calls the method and prints output
        System.out.println(isArmstrong(number));

    }

}
