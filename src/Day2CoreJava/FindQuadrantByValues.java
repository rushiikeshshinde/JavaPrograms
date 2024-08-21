package Day2CoreJava;

import java.util.Scanner;

public class FindQuadrantByValues {

    static void findQuadrant(int x, int y){

        if(x>0 && y>0){
            System.out.printf("%d and %d lies in First Quadrant.%n",x,y);
        }
        else if (x<0 && y>0) {
            System.out.printf("%d and %d lies in Second Quadrant.%n",x,y);
        }
        else if (x<0 && y<0) {
            System.out.printf("%d and %d lies in Third Quadrant.%n",x,y);
        }
        else {

            System.out.printf("%d and %d lies in Fourth Quadrant.%n",x,y);
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();
        System.out.print("Enter the value of y: ");
        int y = sc.nextInt();
        findQuadrant(x,y);

    }

}
