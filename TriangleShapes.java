package roughLectures;

public class TriangleShapes {

//    public static void main(String[] args) {
//        int stars = 1;
//        for (int count = 1; count <= 10; count++) {
//            for (int y = stars; y <10; y++) {
//                System.out.print("*");
//            }
//            System.out.println();
//            stars++;
//        }
//    }



    public static void main(String[] args) {
//        int stars = 1;
//        for (int count = 1; count < 10; count++) {
//            for (int y = 0; y < stars; y++) {
//                System.out.print("*");
//            }
//            System.out.println();
//            stars++;
//        }


//            int stars = 10;
//            int space = 0;
//            for (int count = 0; count < 10; count++) {
//
//                for (int f = space; f>0; f--){
//                    System.out.print(" ");
//                }
//                space++;
//
//                 for (int y = stars; y >0; y--) {
//                     System.out.print("*");
//                }
//                stars--;
//
//                System.out.println();
//
//            }

        int stars = 1;
        int space = 10;
        for (int count = 0; count < 10; count++) {

            for (int f = space; f > 0; f--) {
                System.out.print(" ");
            }
             space--;

            for (int y = stars; y < 2; y++) {
                System.out.print("*");
            }
             stars--;

            System.out.println();

        }

    }



}
