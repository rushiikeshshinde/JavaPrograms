package Day2CoreJava;

import java.util.Scanner;

public class ConvertDigitsToWords {

    public static final String[] ones = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
    public static final String[] teens = {" Eleven ", " Twelve "," Thirteen ", " Fourteen "," Fifteen "," Sixteen ", " Seventeen ", " Eighteen ", " Nineteen "};
    public static final String[] tens = {" Ten ", " Twenty ", " Thirty ", " Forty ", " Fifty ", " Sixty ", " Seventy ", " Eighty ", " Ninety "};

    public static String digitToWord(int num) {

        if (num < 0 || num > 9999) {
            return "Out of Range";
        }

        if (num == 0) return ones[0];

        String words = "";


        if (num / 1000 > 0) {
            words += ones[num / 1000] + " Thousand ";
            num %= 1000;

        }

        if(num / 100 > 0){
            words += ones[num/100] + " Hundred";
            num %= 100;
        }

        if(num >= 11 && num <= 19){
            words += teens[num-11];
        }
        else {
            if(num/10 > 0) {
                words += tens[num/10 - 1] ;
                num %= 10;
            }
            if(num > 0){
                words += ones[num];
            }
        }
        return words;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(digitToWord(number));

    }

}
