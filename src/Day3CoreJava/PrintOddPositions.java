package Day3CoreJava;

public class PrintOddPositions {

    public static void main(String[] args) {

        int[] arr = {2, 8, 3, 2, 5, 1};

        for (int i = 0; i < arr.length; i++) {
            if(i%2!=0){
                System.out.print(arr[i]+" ");
            }
        }

    }


}
