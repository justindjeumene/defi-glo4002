package com.defi.library.interfaces;

import com.defi.library.category.Comic;

public interface ComicServices {
    void borrow(Comic comic);
    void returnProduct(Comic comic);
    void buy(Comic comic);
}
