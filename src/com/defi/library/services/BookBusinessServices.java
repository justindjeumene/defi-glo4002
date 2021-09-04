package com.defi.library.services;

import com.defi.library.category.Book;
import com.defi.library.interfaces.BookServices;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookBusinessServices implements BookServices {
    private List<Book> inventory = new ArrayList<>();
    private Book initialBook;

    public BookBusinessServices(Book book){
        this.initialBook = book;
        this.inventory.add(book);
    }

    @Override
    public void buy(Book book) {
        if (!book.getTitle().isEmpty()){
            this.inventory.add(book);
            System.out.println("The book with title " + book.getTitle() + " has been added to inventory");
        }
    }

    @Override
    public void borrow(Book book) {
        Iterator<Book> iter = this.inventory.iterator();
        while(iter.hasNext()){
            Book foundBook = iter.next();

            if(!book.getTitle().isEmpty() && foundBook.getTitle().equals(book.getTitle())){
                iter.remove();
                System.out.println("Thanks for borrowing the book with title " + book.getTitle());
            } else {
                System.out.println("This book is not available, please come back later");
            }
        }
    }

    @Override
    public void returnProduct(Book book) {
        if (!book.getTitle().isEmpty()){
            this.inventory.add(book);
            System.out.println("Thanks for returning the book with title " + book.getTitle());
        } else {
            System.out.println("Please fill out the title of this book");
        }
    }
}
