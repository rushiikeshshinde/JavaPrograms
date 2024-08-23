package ArrayPrograms;

import java.util.Arrays;

public class MergeSortedArray {

    static void mergeSortedArray(int[] arr1, int[] arr2) {

        int[] newArr = new int[arr1.length + arr2.length];
        int i,j;

        for(i = 0; i< arr1.length; i++){
            newArr[i] = arr1[i];
        }
        for(j = 0; j< arr2.length; j++){
            newArr[j+arr2.length] = arr2[j];
        }

        System.out.println(Arrays.toString(newArr));

        }

    public static void main(String[] args) {

        int[] arr1 = {3,6,7,9,10};
        int[] arr2 = {1,2,4,5,8};

        mergeSortedArray(arr1, arr2);

    }

}



