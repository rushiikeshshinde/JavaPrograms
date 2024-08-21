package NumberProgram;
// Import Scanner Utility
import java.util.Scanner;

// Created a class ArmstrongNumberInRange
public class ArmstrongNumberInRange {

    // Create a method 'armstrongNumInRange' with 'a' as start & 'b' as end as input
    public static void armstrongNumInRange(int a, int b){

        // Using for loop getting answers in range provided by user input
        for(int i = a; i<=b; i++){

            // Initializing the variables
            int number = i;
            int sum = 0;
            int rem;

            // This while loop will split numbers and their cube is added into variable 'sum'
            while(number!=0){
                rem = number % 10;
                sum = sum + rem * rem * rem;
                number = number / 10;
            }

            // If condition is used to compare 'i' and 'sum'
            if (i == sum){
                System.out.println(i + " ");
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
        armstrongNumInRange(start,end);

    }

}
