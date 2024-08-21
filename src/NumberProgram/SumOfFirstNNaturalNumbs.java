package NumberProgram;
// Import Scanner Utility
import java.util.Scanner;

// Created a class SumOfFirstNNaturalNumbs
public class SumOfFirstNNaturalNumbs {

    // Create a method 'sumOfNNumbs' with 'n' as input
    public static String sumOfNNumbs(int n){

        // Initializing variable 'sum'
        int sum = 0;

        // Using for loop to append sum of n numbers in 'sum'
        for(int i = 1; i<=n; i++){
            sum+=i;
        }

        // Returns 'sum'
        return "Sum of "+ n + " is "+sum;
    }

    // Main Method
    public static void main(String [] args){

        // Used Scanner Utility to take user input
        Scanner sc = new Scanner(System.in);
        int n_num = sc.nextInt();

        // This calls the method and prints output
        System.out.println(sumOfNNumbs(n_num));

    }

}
