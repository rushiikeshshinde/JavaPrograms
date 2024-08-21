package Day5CoreJava;

import java.util.Scanner;

public class SwapTwoNumbers {

    static void toSwap(int x, int y){

        System.out.println("Before Swapping: ");
        System.out.printf("X: %d, Y: %d",x,y);
        System.out.println();

        x = x+y;
        y = x-y;
        x = x-y;

        System.out.println("After Swapping: ");
        System.out.printf("X: %d, Y: %d",x,y);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        toSwap(a,b);

    }

}
