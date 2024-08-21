package NumberProgram;
// Import Scanner Utility
import java.util.Scanner;

// Created a class PowerOfNumber
public class PowerOfNumber {

    // Created a method 'powerOfNum' with 'a,b' as input
    public static int powerOfNum(int a, int b){

        // Initializing Variable 'result'
        int result = 1;

        // Using while loop to multiply 'a' into result until 'b' becomes zero
        while(b!=0){
            result *= a;
            --b;
        }

        // Returns 'result'
        return result;

    }

    // Main Method
    public static void main(String[] args){

        // Used Scanner Utility to take user input
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exponent = sc.nextInt();

        // This calls the method and prints output
        System.out.println(powerOfNum(base,exponent));

    }

}
