package Day2CoreJava;

import java.util.Scanner;

public class NumberOccurrence {

    static int count;

    static void isNumberRepeated(int num,int target){

        int rem;

        while(num!=0){
            rem = num % 10;
            if(rem==target){
                count++;
            }
            num /= 10;

        }
        System.out.println(target+" is repeated "+count+" times.");

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.print("Enter the target: ");
        int target = sc.nextInt();

        isNumberRepeated(num,target);

    }

}
