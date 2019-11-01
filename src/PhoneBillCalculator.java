

import java.util.Scanner;

public class PhoneBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter base cost of the plan: ");
        double baseCost = scanner.nextDouble();

        System.out.println("Enter overage minutes: ");
        double overageMinutes = scanner.nextInt();

        scanner.close();

        double overCharge = calculateOverages(overageMinutes);
        double tax = calculateTax(baseCost + overCharge);
        calculateAndPrintBill(baseCost,overCharge, tax );

    }

    public static double calculateOverages(double extraMinutes){
        double rate = 0.25;
        double overAge = extraMinutes * rate;
        return overAge;

    }

    public static double calculateTax(double subTotal){
        double rate = 0.15;
        double tax = rate * subTotal;
        return tax;
    }

    public static void calculateAndPrintBill(double base, double overage, double tax){
        double finalTotal = base + overage + tax;

        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $"+base);
        System.out.println("Overage: $"+overage);
        System.out.println("Tax: $"+tax);
        System.out.println("Total: "+finalTotal);
    }
}
