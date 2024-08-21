package Day5CoreJava;

import java.util.Scanner;

public class LeapYearOrNot {

    static void isLeapYear(int num){

        int count=0;
        int temp = num;

        while(temp!=0){
            temp /= 10;
            count++;

        }
        if(count == 4){
            if(num%4 == 0){
                if(num%100 == 0){
                    if(num%400 == 0){
                        System.out.println(num + " is a Leap Year.") ;
                    }
                    else{
                        System.out.println(num + " is not a Leap Year.");
                    }
                }
                else {
                    System.out.println(num + " is a Leap Year.");
                }
            }
            else{
                System.out.println(num + " is not a Leap Year.");
            }

        }
        else{
            System.out.println("Please Enter Year Properly.");
        }




    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        isLeapYear(year);
        sc.close();

    }

}
