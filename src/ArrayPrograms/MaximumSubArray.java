package ArrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumSubArray {

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 5, 3, 2, 4);

        int start = 1;
        int end = 3;

        subArraySum(arr,start,end);

    }

    static void subArraySum(List<Integer> arr, int start, int end) {

        int sum = 0;

        List<Integer> new_arr = new ArrayList<>();

        for(int i = start; i <= end; i++) {
            new_arr.add(arr.get(i));
        }

        System.out.println(new_arr);

        for(int j : new_arr){
            sum += j;
        }
        System.out.println("Sum of sub-array: "+sum);

    }

}
