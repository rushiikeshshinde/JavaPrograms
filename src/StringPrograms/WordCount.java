package StringPrograms;


import java.util.Scanner;

public class WordCount {

    static void wordCount(String word) {

        int count = 0;

        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == ' ' || word.charAt(i) == ',') {
                i++;
            }
            count++;
        }
        System.out.println(count);

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        wordCount(word);


    }

}
