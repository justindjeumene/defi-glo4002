package com.defi.library.category;

public class Dvd extends Item{
    private int serial_number;

    public Dvd(int serial_number, String title, String author) {
        super(title, author);
        this.serial_number = serial_number;
    }

    public int getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(int serial_number) {
        this.serial_number = serial_number;
    }
}
