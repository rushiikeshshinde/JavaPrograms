package StringPrograms;

import java.util.Scanner;

public class AnagramCheck {

    static boolean isAnagram(String a, String b) {

        a = a.toLowerCase().replaceAll("[^a-zA-z0-9]","");
        b = b.toLowerCase().replaceAll("[^a-zA-z0-9]","");

        if(a.length() != b.length()){
            return false;
        }

        int sum1=0,sum2=0;
        long product1 = 1,product2=1;

        for(int i = 0;i < a.length();i++){
            sum1 += a.charAt(i);
            product1 *= a.charAt(i);
        }
        for(int i = 0;i < b.length();i++){
            sum2 += b.charAt(i);
            product2 *= b.charAt(i);
        }

        return (sum1 == sum2 && product1 == product2);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first string: ");
        String first = in.nextLine();
        System.out.println("Enter second string: ");
        String second = in.nextLine();

        if(isAnagram(first,second)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }


    }

}
