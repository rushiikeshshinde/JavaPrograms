package Day2CoreJava;

import java.util.Scanner;

public class DecimalToOctal {

    static String dec2oct(int num){

        String bin = "";
        while(num!=0){

            bin = (num%8)+bin;
            num /= 8;
        }

        return bin;


    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(dec2oct(number));

    }
}
