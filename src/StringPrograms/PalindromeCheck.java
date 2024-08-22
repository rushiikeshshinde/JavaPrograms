package StringPrograms;

import java.util.Scanner;

public class PalindromeCheck {

    static void isPalindrome(String str) {

        str = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        String reversed = "";
        for(int i = str.length()-1; i >= 0; i--){
            reversed += str.charAt(i);
        }

        if(str.equals(reversed)){
            System.out.println(str+" is Palindrome");
        }
        else{
            System.out.println(str+" is not a palindrome");
        }

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        in.close();
        isPalindrome(str);


    }

}
