package Day5CoreJava;

import java.util.Scanner;

public class HarmonicNumber {

    static void harmonicValue(int num){

        double sum = 0.0;
        for (int i = 1; i <= num; i++) {
            sum += 1.0 / i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        harmonicValue(num);

    }

}