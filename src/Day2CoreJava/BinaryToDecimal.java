package Day2CoreJava;

import java.util.Scanner;

public class BinaryToDecimal {

    static int bin2dec(int num){

        int rem,sum = 0,count=0;
        while (num > 0) {
            rem = num % 10;
            if (rem != 0) {
                sum += (int) Math.pow(2, count);
            }
            count++;
            num /= 10;
        }
        return sum;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(bin2dec(number));
    }

}
