package NumberProgram;
// Import Scanner Utility
import java.util.Scanner;

// Created a class GreatestOfTwoNumbs
public class GreatestOfTwoNumbs {

    // Create a method 'greaterNum' with 'a,b' as input of two numbers
    public static String greaterNum(int a, int b){

        // If-else block is used to find out the greatest number from give two numbers
        if (a>b){
            return a + " is the greatest.";
        }
        else {
            return b + " is the greatest.";
        }

    }

    // Main Method
    public static void main(String[] args){

        // Used Scanner Utility to take user input
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // This calls the method and prints output
        System.out.println(greaterNum(num1,num2));

    }

}
