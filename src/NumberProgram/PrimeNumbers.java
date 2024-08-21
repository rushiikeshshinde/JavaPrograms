package NumberProgram;
// Import Scanner Utility
import java.util.Scanner;

// Created a class PrimeNumbers
public class PrimeNumbers {

    // Create a method 'isPrime' with 'n' as input
    public static String isPrime(int n) {

        // Initializing Variable
        int i, m, count = 0;
        m = n / 2;

        // Using for loop to create range from 2 to 'm'
        for(i=2;i<=m;i++){

            // If condition is used to check whether 'n' is divisible by 'i' or not
            if(n%i==0){
                count++;
            }
        }

        // If-else block is used to check whether count i zero or incremented which sorts prime numbers
        if (count == 0){
            return n + " is a prime number.";
        }
        else{
            return n + " is not a prime number";
        }
    }

    // Main Method
    public static void main(String[] args){

        // Used Scanner Utility to take user input
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // This calls the method and prints output
        System.out.println(isPrime(number));

    }

}




