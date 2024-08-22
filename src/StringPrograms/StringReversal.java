package StringPrograms;

import java.util.Scanner;

public class StringReversal {

    static void stringReverse(String str) {
        String reversed = "";

        for(int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println("Reversed String: "+reversed);


    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        stringReverse(str);

    }

}
