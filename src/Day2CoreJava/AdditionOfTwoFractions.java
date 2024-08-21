package Day2CoreJava;

import java.util.Scanner;

public class AdditionOfTwoFractions {

    static int gcd(int a, int b){

        if(a==0){
            return b;
        }
        return gcd(b%a,a);

    }

    static void lowest(int den3, int num3){

        int common_factor = gcd(num3,den3);

        den3 /= common_factor;
        num3 /= common_factor;
        System.out.println(num3+ "/"+den3);

    }

    static void addFraction(int num1, int den1, int num2, int den2){

        int den3 = gcd(den1,den2);

        den3 = (den1*den2)/den3;

        int num3 = (num1)*(den3/den1) + (num2)*(den3/den2);

        lowest(den3,num3);


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first numerator: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the first denominator: ");
        int den1 = sc.nextInt();
        System.out.print("Enter the second numerator: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the second denominator: ");
        int den2 = sc.nextInt();

        System.out.print(num1+"/"+den1+ " + "+num2+"/"+den2+ " = ");
        addFraction(num1,den1,num2,den2);


    }

}
