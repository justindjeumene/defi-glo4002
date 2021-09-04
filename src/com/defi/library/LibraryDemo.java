package com.defi.library;

import com.defi.library.category.Book;
import com.defi.library.category.Cassette;
import com.defi.library.category.Comic;
import com.defi.library.category.Dvd;
import com.defi.library.services.BookBusinessServices;
import com.defi.library.services.CassetteBusinessServices;
import com.defi.library.services.ComicBusinessServices;
import com.defi.library.services.DvdBusinessServices;

public class LibraryDemo {
    public static void main(String[] args) {
        System.out.println("Library Program! \n");

        System.out.println("Book Business Services");
        Book firstBook = new Book("Learn Python", "Jean C.", "", "978-78965-12478");
        Book secondBook = new Book("Learn Java", "John Doe", "978-1425-963", "978-78965-12478");

        BookBusinessServices bookBusinessServices = new BookBusinessServices(firstBook);
        bookBusinessServices.borrow(firstBook);
        bookBusinessServices.buy(secondBook);
        bookBusinessServices.borrow(secondBook);

        System.out.println("-------------------------------------------------------------- \n");
        System.out.println("Cassette Business Services");
        Cassette firstCassette = new Cassette(12012, "My Girl Killer", "John Doe");

        CassetteBusinessServices cassetteBusinessServices = new CassetteBusinessServices(firstCassette);
        cassetteBusinessServices.borrow(firstCassette);


        System.out.println("-------------------------------------------------------------- \n");
        System.out.println("Dvd Business Services");
        Dvd firstDvd = new Dvd(1019025, "Going Anywhere", "TTD");

        DvdBusinessServices dvdBusinessServices = new DvdBusinessServices(firstDvd);
        dvdBusinessServices.borrow(firstDvd);

        System.out.println("-------------------------------------------------------------- \n");
        System.out.println("Comic Business Services");
        Comic firstComic = new Comic("975-001-7896", "Just for fun", "John Montreal");

        ComicBusinessServices comicBusinessServices = new ComicBusinessServices(firstComic);
        comicBusinessServices.borrow(firstComic);


    }
}
