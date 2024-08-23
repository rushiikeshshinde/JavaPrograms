package ArrayPrograms;

import java.util.Scanner;

public class TwoSum {

    static void twoSum(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.printf("[%d,%d]", i, j);
                }
            }
        }
        }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = in.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("Enter the target: ");
        int target = in.nextInt();

        twoSum(arr, target);

    }



}
