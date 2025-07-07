package com.library;

public class Book {
    private String title;
    private String id;
    private double price;

    public Book(String title, String id, double price) {
        this.title = title;
        this.id = id;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }
    public String getDetails() {
        return "Title: " + title + ", ID: " + id + ", Price: " + price;
    }
}
