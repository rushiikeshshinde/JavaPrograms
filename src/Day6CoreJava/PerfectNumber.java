package Day6CoreJava;// Import Scanner Utility
import java.util.Scanner;

// Created a class PerfectNumber
public class PerfectNumber {
    // Create a method 'perfectNumber' with 'num' as input
    public static void perfectNumber(int num){

        // Initializing Variable 'sum'
        int sum = 0;

        // For loop is used to create range from 1 to num
        for(int i =1;i<num;i++){

            // if condition is given to sort numbers from range which are divisible by 'i'
            if(num%i==0){
                sum += i;
            }
        }

        // If-else block is used to compare 'num' and 'sum'
        if(num == sum){
            System.out.println(num + " is a Perfect Number.");
        }
        else {
            System.out.println(num + " is not a Perfect Number.");
        }

    }

    // Main Method
    public static void main(String[] args){

        // Used Scanner Utility to take user input
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // This calls the method and prints output
        perfectNumber(number);

    }

}
