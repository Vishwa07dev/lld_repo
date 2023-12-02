package org.design.solid;

import org.design.solid.items.CD;
import org.design.solid.items.DVD;
import org.design.solid.items.LibraryItem;
import org.design.solid.items.Book;

public class Main {

    public static void main(String[] args) {
        LibraryItem[] items = {
                new Book("Book Title 1", "B001", "Author 1", 500),
                new CD("CD Title 1", "C001",  1250),
                new DVD("DVD Title 1", "D001", 1999)
                // Add more items as needed
        };

        Library library = new Library(items);

        // Calculate total value of all items in the library
        double totalValue = library.calculateTotalValue();
        System.out.println("Total Value of Library Items: Rs " + totalValue);

        // Calculate late fees for overdue items
        LateFeeCalculator lateFeeCalculator = new LateFeeCalculator();
        double totalLateFees = lateFeeCalculator.calculateTotalLateFees(
                (LateFeeCalculatable[]) items, 5); // Assuming 5 days late
        System.out.println("Total Late Fees for Overdue Items: Rs " + totalLateFees);
    }
}
