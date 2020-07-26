package wk3;

class IncomeTax {
    private String taxFiler;
    private double income;
    final double[] RANGE = {9875, 30250, 45400, 77775, 44050, 311050};
    final private double[] TAX_RATE = {0.1, 0.12, 0.22, 0.24, 0.32, 0.32, 0.37};

    public IncomeTax() {

    }

    public IncomeTax(String status, double income) {
        this.taxFiler = status;
        this.income = income;
    }

    public double calculateTax() {
        double result = 0;
        double leftOver = leftOver = income - RANGE[0];

        if (leftOver >= 0) {
            result = RANGE[0] * TAX_RATE[0];
        }
        else return income * TAX_RATE[0];
        for (int i = 0; i < 6; i++) {
            leftOver = income - RANGE[i];
//            if ()
        }
        return 0;
    }
}

public class Q8_ProgressiveTax {

}
