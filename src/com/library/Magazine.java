package com.library;

public class Magazine extends LibraryItem {
    private String writer;

    public Magazine(String title, String itemId, String writer) {
        super(title, itemId);
        this.writer = writer;
    }

    public String getWriter() {
        return writer;
    }

    @Override
    public String getDetails() {
        return "Magazine," + title + "," + itemId + "," + writer;
    }
}
