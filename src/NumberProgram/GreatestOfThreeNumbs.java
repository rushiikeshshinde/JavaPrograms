package NumberProgram;
// Import Scanner Utility
import java.util.Scanner;

// Created a class GreatestOfThreeNumbs
public class GreatestOfThreeNumbs {

    // Create a method 'greatestOfThreeNumb' with 'a,b,c' as input for three numbers
    public static String greatestOfThreeNumb(int a,int b,int c){

        // If-else block is used to find out the greatest number from given three numbers
        if(a>b && a>c){
            return a + " is the greatest number.";
        }
        else if(b>a && b>c){
            return b + " is the greatest number.";
        }
        else {
            return c + " is the greatest number.";
        }

    }


    // Main Method
    public static void main(String[] args){

        // Used Scanner Utility to take user input
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        // This calls the method and prints output
        System.out.println(greatestOfThreeNumb(num1,num2,num3));

    }

}
