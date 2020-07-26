package wk8;

public class Q4_AddMatrices {
    public static void main(String[] args) {
        double[][] a = new double[4][5];

        for (int i = 0, j = 0; i < 4 && j < 5; i++, j++) {
            a[i][j] = 1;
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println();
            }
        }

//        double[][] c = parallelAddMatrix_sequential(a, a);
//
//        int count = 0;
//        for (int i = 0, j = 0; i < 4 && j < 5; i++, j++) {
//            System.out.println(c[i][j] + " ");
//            count++;
//            if (count == 4)
//                System.out.println();
//        }
    }


    public static double[][] parallelAddMatrix_sequential(double[][] a, double[][] b) {
        int row = a.length;
        int column = a[0].length;

        double[][] c = new double[row][column];

        for (int i = 0, j = 0; i < row && j < column; i++, j++) {
            c[i][j] = a[i][j] + b[i][j];
        }

        return c;
    }

    public static double[][] parallelAddMatrix_parallel(double[][] a, double[][] b) {
        return null;
    }
}
