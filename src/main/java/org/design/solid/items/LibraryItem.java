package org.design.solid.items;

import org.design.solid.LateFeeCalculatable;

public interface LibraryItem extends LateFeeCalculatable {
    String getTitle();
    String getUniqueId();
    double calculateLateFee(int daysLate);
    double getValue();
}
