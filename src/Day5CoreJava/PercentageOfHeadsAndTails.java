package Day5CoreJava;

import java.util.Random;
import java.util.Scanner;

public class PercentageOfHeadsAndTails {

    static void percentageOfHeadAndTails(int noOfFlip) {

        int i;
        int headCount = 0,tailCount = 0;
        Random r = new Random();

        if (noOfFlip <= 0) {
            System.out.println("Please Enter Positive Integer");
        }

        for (i = 1; i <= noOfFlip;i++){

            if(r.nextDouble() < 0.5){
                tailCount++;
            }
            else{
                headCount++;
            }

        }

        double headPercentage = ((double) headCount / noOfFlip) * 100;
        double tailPercentage = ((double) tailCount / noOfFlip) * 100;

        System.out.println("Head Percentage: "+headPercentage);
        System.out.println("Tail Percentage: "+tailPercentage);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int flips = sc.nextInt();
        percentageOfHeadAndTails(flips);

    }

}
