package Class1;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter rate of interest: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter time period (in years): ");
        double time = scanner.nextDouble();

        System.out.print("Enter number of times interest is compounded per year: ");
        int n = scanner.nextInt();

        double amount = principal * Math.pow(1 + (rate / (n * 100)), n * time);
        double compoundInterest = amount - principal;

        System.out.println("Compound Interest: " + compoundInterest);
    }
}
