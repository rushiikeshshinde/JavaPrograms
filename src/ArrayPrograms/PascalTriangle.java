package ArrayPrograms;

public class PascalTriangle {
    public static String[][] generatePascalTriangle(int numRows) {
        if (numRows <= 0) {
            return new String[0][0];
        }

        String[][] triangle = new String[numRows][];

        for (int i = 0; i < numRows; i++) {
            triangle[i] = new String[i + 1];
            triangle[i][0] = "1";
            triangle[i][i] = "1";

            for (int j = 1; j < i; j++) {
                int sum = Integer.parseInt(triangle[i-1][j-1]) + Integer.parseInt(triangle[i-1][j]);
                triangle[i][j] = Integer.toString(sum);
            }
        }

        return triangle;
    }

    public static void printPascalTriangle(String[][] triangle) {
        for (String[] row : triangle) {
            for (String num : row) {
                System.out.print(num+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numRows = 5;
        String[][] pascalTriangle = generatePascalTriangle(numRows);
        printPascalTriangle(pascalTriangle);
    }
}