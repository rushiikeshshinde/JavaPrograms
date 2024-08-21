package Day5CoreJava;

import java.util.Scanner;

public class VowelOrConsonant {

    static void vowelOrConsonant(String a){

        if(a.equals("A") || a.equals("E") || a.equals("I") || a.equals("O") || a.equals("U")){
            System.out.println(a+ " is a vowel.");
        }
        else {
            System.out.println(a+ " is a consonant.");
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        vowelOrConsonant(a);

    }

}
