package com.library;

public class Book extends LibraryItem {
    private double price;

    public Book(String title, String itemId, double price) {
        super(title, itemId);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String getDetails() {
        return "Book," + title + "," + itemId + "," + price;
    }
}