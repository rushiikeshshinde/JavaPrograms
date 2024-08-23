package ArrayPrograms;

import java.util.Scanner;
import java.util.Arrays;

public class ProductOfArrayExceptNumOfI {

    static int productOfArray(int [] arr){

        int mul = 1;

        for(int j:arr){
            mul *= j;
        }

        return mul;

    }

    static void exceptNumOfI(int [] arr){
        int[] newArr = new int[arr.length];
        int mul = productOfArray(arr);

        for(int i = 0; i < arr.length; i++){
            newArr[i] = mul/arr[i];
        }
        System.out.println(Arrays.toString(newArr));

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = in.nextInt();

        int [] arr = new int[n];
        System.out.print("Enter the elements: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        exceptNumOfI(arr);

    }

}
