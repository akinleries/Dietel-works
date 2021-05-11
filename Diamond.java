package roughLectures;

public class Diamond {
    public static void main(String[] args) {
        printDiamondShape();
    }

    public static void printDiamondShape() {
        int star = 1,space = 9,lines = 9;

        int div = lines/2+1;

        for (int counter = 1; counter <= lines; counter++) {
            for (int s = space; s > 0; s--) {
                System.out.print(" ");
            }
            for (int a = star; a > 0; a--) {
                System.out.print("* ");
            }
            System.out.println();
           if (counter < div){
               space -= 2;
               star += 2;
           }else if (counter >= div){
               space += 2;
               star -= 2;
           }

        }

    }
}
