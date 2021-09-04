package com.defi.library.category;

public class Comic extends Item{
    private String isbn_10;

    public Comic(String isbn_10, String title, String author) {
        super(title, author);
        this.isbn_10 = isbn_10;
    }

    public String getIsbn_10() {
        return isbn_10;
    }

    public void setIsbn_10(String isbn_10) {
        this.isbn_10 = isbn_10;
    }
}
