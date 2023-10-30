package Assignment;

import java.util.Scanner;

public class ITCalculator {

    private double taxableIncome;
    private double taxPaidPerYear;
    private double taxPayablePerMonth;

    public ITCalculator(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public void calculateTax() {
        if (taxableIncome <= 25000) {
            taxPaidPerYear = 0;
        } else if (taxableIncome > 25000 && taxableIncome <= 50000) {
            taxPaidPerYear = taxableIncome * 0.1;
        } else if (taxableIncome > 50000 && taxableIncome <= 75000) {
            taxPaidPerYear = taxableIncome * 0.2;
        } else {
            taxPaidPerYear = taxableIncome * 0.3;
        }

        taxPayablePerMonth = taxPaidPerYear / 12;
    }

    public double getTaxPaidPerYear() {
        return taxPaidPerYear;
    }

    public double getTaxPayablePerMonth() {
        return taxPayablePerMonth;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your taxable income: ");
        double taxableIncome = scanner.nextDouble();

        ITCalculator calculator = new ITCalculator(taxableIncome);
        calculator.calculateTax();

        System.out.println("Tax paid per year: " + calculator.getTaxPaidPerYear());
        System.out.println("Tax payable per month: " + calculator.getTaxPayablePerMonth());

        scanner.close();
    }
}
