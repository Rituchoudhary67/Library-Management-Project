package com.library;

import java.io.Serializable;

public abstract class LibraryItem implements Serializable{
    protected String title;
    protected String itemId;

    public LibraryItem(String title, String itemId) {
        this.title = title;
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getItemId() {
        return itemId;
    }

    public abstract String getDetails();
}
