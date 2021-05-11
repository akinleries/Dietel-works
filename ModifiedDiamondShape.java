package roughLectures;

import java.util.Scanner;

public class ModifiedDiamondShape {
        public static void main(String[] args) {
            printDiamondShape();
        }

        public static void printDiamondShape() {
            Scanner userInput = new Scanner(System.in);
            System.out.println("Enter Number");
            int lines = userInput.nextInt();

            int star = 1, space = 19;
            if (lines <= 19 && lines % 2 == 0){
                    int div = lines / 2 + 1;

                    for (int counter = 1; counter <= lines; counter++) {
                        for (int s = space; s > 0; s--) {
                            System.out.print(" ");
                        }
                        for (int a = star; a > 0; a--) {
                            System.out.print("* ");
                        }
                        System.out.println();
                        if (counter < div) {
                            space -= 2;
                            star += 2;
                        } else if (counter >= div) {
                            space += 2;
                            star -= 2;
                        }

                    }

                }

            }

}
