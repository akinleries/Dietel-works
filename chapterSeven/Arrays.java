package chapterSeven;

//import javax.swing.*;
//
public class Arrays {
    //    public static void main(String[] args) {
//        double sumArray[] = new double[10];
//        for(int i = 0; i< sumArray.length; i++){
//            sumArray[i] = Math.random() * 100;
//            System.out.println(Array.sumArray[]);
//        }
//
//    }
//
//}
    public static void main(String[] args) {
        String input = "semicolon";

        // getBytes() method to convert string
        // into bytes[].
        byte[] reverseArray = input.getBytes();

        byte[] result = new byte[reverseArray.length];

        // Store result in reverse order into the
        // result byte[]
        for (int i = 0; i < reverseArray.length; i++)
            result[i] = reverseArray[reverseArray.length - i - 1];

        System.out.println(new String(result) + "  ");

        }
    }
