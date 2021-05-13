package NewChapterFiveAndSix;

import java.util.Scanner;

public class ParkingCharges {
    public static void main(String[] args) {
        calculateCharges();
    }

    public static void calculateCharges(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter park duration");
        int hours = userInput.nextInt();
        System.out.println("Enter park duration");
        double parkCharges = 0;
        while (hours != -1) {

             hours = userInput.nextInt();

            if(hours == -1){
                System.exit(1);
            }
            if (hours <= 3) {
                parkCharges = 2.00;
                System.out.println("charges :" + "$" + parkCharges);
            } else if(hours > 3 && hours < 24){
                System.out.println("charges :" + "$" + parkCharges);
            }
            else if (hours == 24) {
                parkCharges = 10.00;
                System.out.println("charges :" + "$" + parkCharges);}

        }

    }
}
