package ArrayPrograms;

public class RemoveDuplicates {

    static void removeDuplicates(int[] arr) {
        boolean isVisted;

        for(int i = 0; i < arr.length; i++) {
            isVisted = false;
            for(int j = i+1; j < arr.length; j++) {
                if(i!=j && arr[i] == arr[j]) {
                    isVisted = true;
                    break;
                }

            }
            if(!isVisted) {
                System.out.println(arr[i]);
            }

        }

    }

    public static void main(String[] args) {

        int[] arr = {1,1,2,2,2,3,3,3,3,4,4,5,5,5,5};
        removeDuplicates(arr);

    }

}
