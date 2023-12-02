package org.design.solid.items;

import org.design.solid.LateFeeCalculatable;


/**
 * Open Close principle
 */
public class Book implements LibraryItem  {
    private String title;
    private String uniqueId;
    private String author;
    private double value;

    public Book(String title, String uniqueId, String author, double value) {
        this.title = title;
        this.uniqueId = uniqueId;
        this.author = author;
        this.value = value;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getUniqueId() {
        return uniqueId;
    }

    @Override
    public double calculateLateFee(int daysLate) {
        // Late fee calculation for books (e.g., Rs 10 per day)
        return daysLate * 10;
    }

    @Override
    public double getValue() {
        return value;
    }

    // Other methods specific to Book
}
