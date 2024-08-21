package Day2CoreJava;

import java.util.Scanner;

public class BinaryToOctal {

    static String bin2oct(int num) {
        int rem, sum = 0,rem_new, count = 0;
        String temp = "";
        while(num!=0){
            rem = num % 1000;
            while(rem!=0){
                rem_new = rem % 10;
                sum += rem_new * (int) Math.pow(2, count);
                count++;
                rem /= 10;
            }
            temp = sum + temp;
            sum = 0;
            count = 0;
            num /= 1000;
        }
        return temp;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int bin = sc.nextInt();
//        bin2oct(bin);
        System.out.println(bin2oct(bin));
    }

}
