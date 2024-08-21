package Day2CoreJava;

import java.util.Scanner;

public class DecimalToBinary {

    static String dec2bin(int num){

        if(num == 0){
            return "0";
        }

        String bin = "";
        while(num>0){
            bin = (num % 2) + bin;
            num /= 2;
        }

        return bin;


    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(dec2bin(number));

    }

}
