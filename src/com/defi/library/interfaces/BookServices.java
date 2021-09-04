package com.defi.library.interfaces;

import com.defi.library.category.Book;

public interface BookServices {
    void borrow(Book book);
    void returnProduct(Book book);
    void buy(Book book);
}
