package Day5CoreJava;
// Import Scanner Utility
import java.util.Scanner;

// Created a class PrimeFactorsOfNumbers
public class FactorsOfNumber {
    // Create a method 'primeFactorsOfNumbers' with 'num' as input
    public static void primeFactorsOfNumbers(int num){

        // Using for loop to create a range from 2 to 'num'
        for(int i = 1;i<num; i++){

            // Using if condition to check whether the 'num' is divisible by 'i' or not
            if(num%i==0){

                // Using if condition to check whether 'i' is divisible by 2 or not
                if(i%2!=0){
                    System.out.println(i);
                }
            }
        }

    }

    // Main Method
    public static void main(String[] args){

        // Used Scanner Utility to take user input
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // This calls the method and prints output
        primeFactorsOfNumbers(number);

    }

}
