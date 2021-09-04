package com.defi.library.services;

import com.defi.library.category.Comic;
import com.defi.library.interfaces.ComicServices;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ComicBusinessServices implements ComicServices {
    private List<Comic> inventory = new ArrayList<>();
    private Comic initialComic;

    public ComicBusinessServices(Comic comic){
        this.initialComic = comic;
        this.inventory.add(comic);
    }

    @Override
    public void buy(Comic comic) {
        if (!comic.getTitle().isEmpty()){
            this.inventory.add(comic);
            System.out.println("The comic with title " + comic.getTitle() + " has been added to inventory");
        }
    }

    @Override
    public void borrow(Comic comic) {
        Iterator<Comic> iter = this.inventory.iterator();

        while(iter.hasNext()){
            Comic foundComic = iter.next();

            if(!comic.getTitle().isEmpty() && foundComic.getTitle().equals(comic.getTitle())){
                iter.remove();
                System.out.println("Thanks for borrowing the comic with title " + comic.getTitle());
            } else {
                System.out.println("This comic is not available, please come back later");
            }
        }
    }

    @Override
    public void returnProduct(Comic comic) {
        if (!comic.getTitle().isEmpty()){
            this.inventory.add(comic);
            System.out.println("Thanks for returning the comic with title " + comic.getTitle());
        } else {
            System.out.println("Please fill out the title of this cassette");
        }
    }
}
