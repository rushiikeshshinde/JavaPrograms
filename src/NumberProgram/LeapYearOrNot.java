package NumberProgram;
// Import Scanner Utility
import java.util.Scanner;

// Created a class LeapYearOrNot
public class LeapYearOrNot {

    // Create a method 'isLeapYear' with 'year' as input
    public static String isLeapYear(int year){

        // If-else blocks are executed to check whether the 'year' is a leap year or not
        if(year%4 == 0){
            if(year%100 == 0){
                if(year%400 == 0){
                    return year + " is a Leap Year.";
                }
                else{
                    return year + " is not a Leap Year.";
                }
            }
            else {
                return year + " is a Leap Year.";
            }
        }
        else{
            return year + " is not a Leap Year.";
        }

    }

    // Main Method
    public static void main(String[] args){

        // Used Scanner Utility to take user input
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        // This calls the method and prints output
        System.out.println(isLeapYear(year));

    }

}
