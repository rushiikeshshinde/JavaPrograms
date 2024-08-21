package Day3CoreJava;

public class FrequencyOfNumbersInArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 8, 3, 2, 2, 2, 5, 1, 1, 1};

        // Find the maximum element in the array
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Create a frequency array
        int[] frequency = new int[max + 1];


        // Count the frequency of each element
        for (int j : arr) {
            frequency[j]++;
        }

        // Print the frequency of each element
        System.out.println("Element frequencies:");
        for (int i = 0; i <= max; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + ": " + frequency[i]);
            }
        }
    }
}