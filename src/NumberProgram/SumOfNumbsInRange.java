package NumberProgram;
// Import Scanner Utility
import java.util.Scanner;

// Created a class ArmstrongNumber
public class SumOfNumbsInRange {

    // Create a method 'isArmstrong' with 'num' as input
    public static String sumOfRangeNumbs(int a, int b){

        // Initializing Variables
        int sum = 0;

        // Using for loop to add and append range given by user to 'sum'
        for(int i = a;i<=b;i++){
            sum+=i;
        }

        // Returns 'sum'
        return "The sum of numbers in range "+ a + " and "+ b + " is "+sum;
    }

    // Main Method
    public static void main(String[] args){

        // Used Scanner Utility to take user input
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        // This calls the method and prints output
        System.out.println(sumOfRangeNumbs(start,end));

    }

}
