package Day3CoreJava;

class Sorting {

    static void bubbleSort(int[] arr) {

        for(int i = 0; i<arr.length-1; i++){
            for(int j = 0; j<arr.length-i-1; j++){

                if(arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }
        printArray(arr);

    }

    static void selectionSort(int[] arr) {

        for(int i = 0; i<arr.length-1; i++){
            int smallest = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[j]<arr[smallest]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);

    }

    static void insertionSort(int[] arr) {

        for(int i = 1; i<arr.length; i++){
            int current = arr[i];
            int j = i-1;
            while(j>=0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        printArray(arr);

    }

    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {7, 8, 3, 1, 2};

        // Bubble Sort
        // Time Complexity - O(n^2)
//        bubbleSort(arr);

        // Selection Sort
        // TIme Complexity - O(n^2)
//        selectionSort(arr);

        // Insertion Sort


    }
}