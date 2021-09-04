package com.defi.library.interfaces;

import com.defi.library.category.Dvd;

public interface DvdServices {
    void borrow(Dvd dvd);
    void returnProduct(Dvd dvd);
    void buy(Dvd dvd);
}
