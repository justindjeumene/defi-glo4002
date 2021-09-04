package com.defi.library.category;

public class Book {
    private String title;
    private String author;
    private String isbn_10;
    private String isbn_13;

    public Book(String title, String author, String isbn_10, String isbn_13) {
        this.title = title;
        this.author = author;
        this.isbn_10 = isbn_10;
        this.isbn_13 = isbn_13;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn_10(String isbn_10) {
        this.isbn_10 = isbn_10;
    }

    public void setIsbn_13(String isbn_13) {
        this.isbn_13 = isbn_13;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn_10() {
        return isbn_10;
    }

    public String getIsbn_13() {
        return isbn_13;
    }
}
