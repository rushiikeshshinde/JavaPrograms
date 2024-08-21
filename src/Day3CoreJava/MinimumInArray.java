package Day3CoreJava;

public class MinimumInArray {

    public static void main(String[] args) {
        int[] arr = {2, 8, 3, 2, 5, 1};
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        System.out.println(min);
    }

}