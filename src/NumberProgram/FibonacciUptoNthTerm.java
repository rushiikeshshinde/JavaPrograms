package NumberProgram;
import java.util.Scanner;

public class FibonacciUptoNthTerm {

    public static void fibonacciUptoNterms(int n){

        int a = 0; int b = 1;
        System.out.print(a+","+b+",");

        int nextTerm;

        for(int i = 2; i<=n;i++){
            nextTerm = a+b;
            a=b;
            b = nextTerm;
            if (i==n){
                System.out.print(nextTerm);
            }
            else{
                System.out.print(nextTerm+",");
            }

        }



    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int nth_term = sc.nextInt();

        fibonacciUptoNterms(nth_term);

    }

}
