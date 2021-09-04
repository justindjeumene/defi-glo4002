package com.defi.library.services;

import com.defi.library.category.Cassette;
import com.defi.library.interfaces.CassetteServices;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CassetteBusinessServices implements CassetteServices {
    private List<Cassette> inventory = new ArrayList<>();
    private Cassette initialCassette;

    public CassetteBusinessServices(Cassette cassette){
        this.initialCassette = cassette;
        this.inventory.add(cassette);
    }

    @Override
    public void buy(Cassette cassette) {
        if (!cassette.getTitle().isEmpty()){
            this.inventory.add(cassette);
            System.out.println("The cassette with title " + cassette.getTitle() + " has been added to inventory");
        }
    }

    @Override
    public void borrow(Cassette cassette) {
        Iterator<Cassette> iter = this.inventory.iterator();

        while (iter.hasNext()){
            Cassette foundCassette = iter.next();

            if(!cassette.getTitle().isEmpty() && foundCassette.getTitle().equals(cassette.getTitle())){
                iter.remove();
                System.out.println("Thanks for borrowing the cassette with title " + cassette.getTitle());
            } else {
                System.out.println("This cassette is not available, please come back later");
            }
        }
    }

    @Override
    public void returnProduct(Cassette cassette) {
        if (!cassette.getTitle().isEmpty()){
            this.inventory.add(cassette);
            System.out.println("Thanks for returning the cassette with title " + cassette.getTitle());
        } else {
            System.out.println("Please fill out the title of this cassette");
        }
    }
}
