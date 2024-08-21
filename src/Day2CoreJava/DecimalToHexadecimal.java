package Day2CoreJava;

import java.util.Scanner;

public class DecimalToHexadecimal {

    public static String dec2hex(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        String hexadecimal = "";

        while (decimal > 0) {
            int remainder = decimal % 16;
            char hexDigit;

            if (remainder < 10) {
                hexDigit = (char) ('0' + remainder);
            } else {
                hexDigit = (char) ('A' + remainder - 10);
            }

            hexadecimal = hexDigit + hexadecimal;
            decimal /= 16;
        }

        return hexadecimal;
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(dec2hex(number));

    }

}
