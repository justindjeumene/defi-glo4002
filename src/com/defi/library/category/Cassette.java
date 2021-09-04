package com.defi.library.category;

public class Cassette {
    private int serial_number;
    private String title;
    private String author;

    public Cassette(int serial_number, String title, String author) {
        this.serial_number = serial_number;
        this.title = title;
        this.author = author;
    }

    public int getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(int serial_number) {
        this.serial_number = serial_number;
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
