package Day2CoreJava;

import java.util.Scanner;

public class HighestCommonFactor {
    static int hcf;

    static void findHCF(int num1, int num2){

        for(int i = 1; i<=num1 && i<=num2;++i){
            if(num1%i==0 && num2%i==0){
                hcf = i;
            }
        }
        System.out.println(hcf);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        findHCF(num1,num2);
        sc.close();

    }

}
