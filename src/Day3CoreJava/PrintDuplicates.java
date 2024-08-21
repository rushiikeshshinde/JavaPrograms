package Day3CoreJava;

public class PrintDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 7, 8, 8, 3};

        System.out.println("Duplicate elements in the array:");
        printDuplicates(arr);
    }

    static void printDuplicates(int[] arr) {
        boolean duplicateFound = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    duplicateFound = true;
                    break;
                }
            }
        }

        if (!duplicateFound) {
            System.out.println("No duplicates found.");
        }
    }
}