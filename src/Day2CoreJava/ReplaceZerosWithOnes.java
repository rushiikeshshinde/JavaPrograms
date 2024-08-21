package Day2CoreJava;

import java.util.Scanner;

public class ReplaceZerosWithOnes {

    static String replaceZerosWithOnes(int num){

        int rem;
        String temp = "";
        while(num!=0){
            rem = num % 10;
            if(rem == 0){
                rem = 1;
            }
            temp = rem + temp;
            num /= 10;
        }

        return temp;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(replaceZerosWithOnes(number));

    }

}
