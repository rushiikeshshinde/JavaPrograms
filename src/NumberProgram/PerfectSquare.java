package NumberProgram;
// Import Scanner Utility
import java.util.Scanner;

// Created a class PerfectSquare
public class PerfectSquare {

    // Created a method 'perfectSquare' with 'num' as input
    public static void perfectSquare(int num){
        // Prints the perfect square of given number
        System.out.println("Perfect Square of "+ num + " is "+ num*num);
    }

    // Main Method
    public static void main(String[] args){

        // Used Scanner Utility to take user input
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // This calls the method and prints output
        perfectSquare(number);

    }

}
