package NewChapterFiveAndSix;

import java.util.Scanner;

public class SeparatingDigits {
    public static void main(String[] args) {
        System.out.println(separateDigit());
    }
    public static String separateDigit(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter Numbers");
        int number = userInput.nextInt();
        String result = " ";



       while (number > 0){
           int digit = number % 10;
           result = digit + "  " + result;
           number = number/10;

       }
       return result;
    }
}
