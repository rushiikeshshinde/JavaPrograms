package Day2CoreJava;

import java.util.Scanner;

public class HexadecimalToDecimal {

    static int hex2dec(String num){

        String digits = "0123456789ABCDEF";
        num = num.toUpperCase();

        int val = 0;
        for(int i =  0; i < num.length();i++){

            char c = num.charAt(i);
            int d = digits.indexOf(c);
            val = 16 * val + d;
        }
        return val;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        System.out.println(hex2dec(number));

    }

}
