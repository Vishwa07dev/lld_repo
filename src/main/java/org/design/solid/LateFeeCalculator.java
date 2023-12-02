package org.design.solid;


/**
 * Dependency Inversion Principle
 */
public class LateFeeCalculator {
    public double calculateTotalLateFees(LateFeeCalculatable[] items, int daysLate) {
        double totalLateFees = 0;
        for (LateFeeCalculatable item : items) {
            totalLateFees += item.calculateLateFee(daysLate);
        }
        return totalLateFees;
    }
}
