package wk1;

import java.text.DecimalFormat;

//class MileToKm {
//    final double KILOMETERS_PER_MILE = 1.609;
//    double mile;
//    double km = KILOMETERS_PER_MILE * mile;
//
//    public double getMile() {
//        return mile;
//    }
//
//    public void setMile(double mile) {
//        this.mile = mile;
//    }
//
//    public double getKm() {
//        return km;
//    }
//
//    public void setKm(double km) {
//        this.km = km;
//    }
//}

public class Q7_MileToKm {

    static void tableMileToKm() {
        // decimal format
        DecimalFormat decimalFormat = new DecimalFormat("####.##");
        final double KILOMETERS_PER_MILE = 1.609;

        // display table header
        System.out.println("\tMiles\tKilometers\t|\tKilometers\tMiles");

        // display conversion
//        for (int i = 1, j = 20; i <= 9; i++, j += 5) {
//            if (i <= 6)
//                System.out.println("\t  " + i + "\t\t   " + decimalFormat.format(i * KILOMETERS_PER_MILE) + "\t\t|\t   " + j + "\t    " + decimalFormat.format(j / KILOMETERS_PER_MILE));
//            else
//                System.out.println("\t  " + i + "\t\t  " + decimalFormat.format(i * KILOMETERS_PER_MILE) + "\t\t|\t   "
//                                    + j + "\t    " + decimalFormat.format(j / KILOMETERS_PER_MILE));
//        }
//        System.out.println("\t " + 10 + "\t\t  " + decimalFormat.format(10 * KILOMETERS_PER_MILE) + "\t\t|\t   " + 65 + "\t    "
//                            + decimalFormat.format(65 / KILOMETERS_PER_MILE));

        // alternate and better method
        for (int i = 1, j = 20; i <= 10; i++, j += 5)
            System.out.printf("\t%2d\t\t%5.2f\t\t|\t\t%2d\t\t%4.2f\n", i, i * KILOMETERS_PER_MILE, j, j / KILOMETERS_PER_MILE);
    }
    public static void main(String[] args) {
        Q7_MileToKm.tableMileToKm();
    }
}
