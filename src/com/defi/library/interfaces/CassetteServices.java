package com.defi.library.interfaces;

import com.defi.library.category.Cassette;

public interface CassetteServices {
    void borrow(Cassette cassette);
    void returnProduct(Cassette cassette);
    void buy(Cassette cassette);
}
