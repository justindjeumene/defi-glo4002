package com.defi.library.category;

public class Book extends Item{
    private String isbn_10;
    private String isbn_13;

    public Book(String title, String author, String isbn_10, String isbn_13) {
        super(title, author);
        this.isbn_10 = isbn_10;
        this.isbn_13 = isbn_13;
    }

    public void setIsbn_10(String isbn_10) {
        this.isbn_10 = isbn_10;
    }

    public void setIsbn_13(String isbn_13) {
        this.isbn_13 = isbn_13;
    }

    public String getIsbn_10() {
        return isbn_10;
    }

    public String getIsbn_13() {
        return isbn_13;
    }
}
