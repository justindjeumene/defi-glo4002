package com.defi.library.category;

public class Comic {
    private String isbn_10;
    private String title;
    private String author;

    public Comic(String isbn_10, String title, String author) {
        this.isbn_10 = isbn_10;
        this.title = title;
        this.author = author;
    }

    public String getIsbn_10() {
        return isbn_10;
    }

    public void setIsbn_10(String isbn_10) {
        this.isbn_10 = isbn_10;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
