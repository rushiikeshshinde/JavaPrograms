package Day2CoreJava;

import java.util.Scanner;

public class CalculateAreaOfCircle {

    static void calculateArea(int radius){
        double value = Math.PI * radius * radius;
        System.out.printf("%.2f",value);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        calculateArea(radius);

    }

}
