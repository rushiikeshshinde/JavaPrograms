package Day2CoreJava;

import java.util.Scanner;

public class OctalToDecimal {

    static void oct2dec(int num){

        int rem,sum = 0,count=0;
        while (num > 0) {
            rem = num % 10;
            if(rem <=7){
                sum += rem * (int) Math.pow(8,count);
                count++;
                num /= 10;


            }
            else {
                System.out.println("Not a valid Octal Number.");
                break;
            }


        }
        if(sum>0){
            System.out.println(sum);
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        oct2dec(number);
    }

}
