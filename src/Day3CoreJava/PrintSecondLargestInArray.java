package Day3CoreJava;

public class PrintSecondLargestInArray {

    public static void main(String[] args) {
        // Example array
        int[] array = {5, 2, 8, 7, 1};

        // Sorting the array in ascending order using Bubble Sort
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println(array[array.length - 2]);
    }

}
