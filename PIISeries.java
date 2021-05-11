package roughLectures;

public class PIISeries {
    public static void main(String[] args) {
        calculatePII();
    }
    public static void calculatePII(){
        double pii = 0;
        System.out.printf("Term      PiiValue%n");
        for (int i = 1; i <= 200_000; i++){
            if (i == 1 ){

                pii = 4;

            }else if (i % 2 == 0){

                pii = pii -  (double) 4/ (i +(i-1));

            }else {

            pii = pii + (double) 4/ (i +(i-1));

           }
            System.out.printf("%d%20f%n", i, pii);
        }
    }
}
