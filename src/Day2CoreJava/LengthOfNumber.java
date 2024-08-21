package Day2CoreJava;

import java.util.Scanner;

public class LengthOfNumber {

    static int numCount(int num){

        int count = 0;

        while(num!=0){
            num /= 10;
            count++;
        }
        return count;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Length of "+number+" is "+numCount(number));
    }

}
