package Day5CoreJava;

import java.util.Scanner;

public class LargestAmongThree {

    static void largestNumber(int a, int b, int c){

        if(a>b && a>c){
            System.out.println(a+ " is largest.");
        }
        else if(b>c & b>a){
            System.out.println(b+ " is largest.");
        }
        else {
            System.out.println(c+ " is largest.");
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 =sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        largestNumber(num1,num2,num3);

    }

}
