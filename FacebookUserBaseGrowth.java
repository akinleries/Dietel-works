package NewChapterFiveAndSix;

public class FacebookUserBaseGrowth {

    public static void main(String[] args) {
        
        estimateForOnePointFiveBillion();
        estimateForTwoBillion();
    }

       public static void estimateForOnePointFiveBillion(){
           double userBase = 1_000_000_000;
           double growthRate = 0.04;
           double targetBase = 0;
           int month = 0;

           while (true) {
               targetBase = userBase * Math.pow(1.0 + growthRate, month);
               if (targetBase >= 1_500_000_000) {
                   System.out.println(month);
                   break;
               }

               month++;
        }
    }
    public static void estimateForTwoBillion() {
        double userBase = 1_000_000_000;
        double growthRate = 0.04;
        double targetBase = 0;
        int month = 0;
        while (true) {
            targetBase = userBase * Math.pow(1.0 + growthRate, month);
            if (targetBase >= 2_000_000_000) {
                System.out.println(month);
                break;
            }
            month++;
        }
    }
}



