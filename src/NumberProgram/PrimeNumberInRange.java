package NumberProgram;
// Import Scanner Utility
import java.util.Scanner;

// Created a class PrimeNumberInRange
public class PrimeNumberInRange {

    // Created a method 'primeNumbsinRange' with 'a,b' as input
    public static void primeNumbsinRange(int a, int b){

        // Initializing Variables
        int i,j,count;

        // Using for loop to define range given by user input
        for(i = a; i<= b;i++){

            // Using if condition to check whether 'i' is 0 or 1.
            if(i == 0 || i==1){
                continue;
            }

            // Initialized count = 2
            count = 2;

            // Using for loop to create range from 2 to 'i-2'
            for(j = 2;j<=i-2;j++){

                // Using if condition to check whether 'i' is divisible by 'j' or not
                if(i%j == 0){
                    count++;
                    break;
                }
            }

            // If condition is used to check count is 2 or not which eliminates non-prime numbers
            if(count == 2){
                System.out.println(i);
            }
        }
    }

    // Main Method
    public static void main(String[] args){

        // Used Scanner Utility to take user input
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        // This calls the method and prints output
        primeNumbsinRange(start,end);

    }

}
