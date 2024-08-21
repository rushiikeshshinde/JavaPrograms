package Day5CoreJava;

import java.util.Scanner;

public class PowerOfTwo {

    static void powerOfTwo(int n){

        int value = 1;
        if(n>0 && n<31){
            for(int i = 1; i<=n;i++){
                value *= 2;
                System.out.println(2+"^"+i+" = "+value);
            }

        }
        else {
            System.out.println("Enter Value less than 31.");
        }


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int power = sc.nextInt();
        powerOfTwo(power);

    }

}
