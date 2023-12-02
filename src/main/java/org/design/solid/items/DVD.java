package org.design.solid.items;

import org.design.solid.LateFeeCalculatable;

public class DVD implements LibraryItem {


    private String title;
    private String uniqueId;
    private double value;

    public DVD(String title, String uniqueId, double value) {
        this.title = title;
        this.uniqueId = uniqueId;
        this.value = value;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public String getUniqueId() {
        return this.uniqueId;
    }

    @Override
    public double calculateLateFee(int daysLate) {
        return daysLate*20; // Assuming Rs 20 is charged for each delayed day
    }

    @Override
    public double getValue() {
        return this.value;
    }
}
