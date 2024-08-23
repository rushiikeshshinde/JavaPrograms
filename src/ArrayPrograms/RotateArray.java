package ArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {

    static void rotate(int[] arr, int d) {
        int[] temp = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            temp[(i+d)%arr.length] = arr[i];
        }
        System.out.println(Arrays.toString(temp));
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = in.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i = 0; i<n; i++){
            arr[i] = in.nextInt();
        }
        System.out.print("Enter value of k to rotate array: ");
        int k = in.nextInt();

        rotate(arr, k);

    }

}
