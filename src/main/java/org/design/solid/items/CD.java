package org.design.solid.items;

import org.design.solid.LateFeeCalculatable;

public class CD implements LibraryItem {

    private String title;
    private String uniqueId;
    private double value;

    public CD(String title, String uniqueId, double value) {
        this.title = title;
        this.uniqueId = uniqueId;
        this.value = value;
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public String getUniqueId() {
        return null;
    }

    @Override
    public double calculateLateFee(int daysLate) {
        return 0;
    }

    @Override
    public double getValue() {
        return 0;
    }
}
