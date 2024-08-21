package Day6CoreJava;

public class FibonacciSeries {
    public static void fibonacciUptoNterms(int n) {
        if (n <= 0) {
            return;
        }

        int a = 0, b = 1;
        System.out.print(a);

        if (n > 1) {
            System.out.print(", " + b);
        }

        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(", " + next);
            a = b;
            b = next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        fibonacciUptoNterms(10);
    }
}