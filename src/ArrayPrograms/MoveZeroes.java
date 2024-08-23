package ArrayPrograms;
import java.util.ArrayList;
import java.util.List;

public class MoveZeroes {

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 5};
        moveZeroesToRight(arr);

    }

    static void moveZeroesToRight(int[] arr) {
        List<Integer> nonZeroes = new ArrayList<>(arr.length);

        // Separate non-zero elements and count zeros
        for (int num : arr) {
            if (num != 0) {
                nonZeroes.add(num);
            }
        }

        // Fill the rest with zeros
        for (int i = nonZeroes.size(); i < arr.length; i++) {
            nonZeroes.add(0);
        }
        
        System.out.println(nonZeroes);
    }
}