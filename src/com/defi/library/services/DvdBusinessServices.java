package com.defi.library.services;

import com.defi.library.category.Dvd;
import com.defi.library.interfaces.DvdServices;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DvdBusinessServices implements DvdServices {
    private List<Dvd> inventory = new ArrayList<>();
    private Dvd initialDvd;

    public DvdBusinessServices(Dvd dvd){
        this.initialDvd = dvd;
        this.inventory.add(dvd);
    }

    @Override
    public void buy(Dvd dvd) {
        if (!dvd.getTitle().isEmpty()){
            this.inventory.add(dvd);
            System.out.println("The dvd with title " + dvd.getTitle() + " has been added to inventory");
        }
    }

    @Override
    public void borrow(Dvd dvd) {
        Iterator<Dvd> iter = this.inventory.iterator();

        while(iter.hasNext()){
            Dvd foundDvd = iter.next();

            if(!dvd.getTitle().isEmpty() && foundDvd.getTitle().equals(dvd.getTitle())){
               iter.remove();
                System.out.println("Thanks for borrowing the dvd with title " + dvd.getTitle());
            } else {
                System.out.println("This dvd is not available, please come back later");
            }
        }
    }

    @Override
    public void returnProduct(Dvd dvd) {
        if (!dvd.getTitle().isEmpty()){
            this.inventory.add(dvd);
            System.out.println("Thanks for returning the dvd with title " + dvd.getTitle());
        } else {
            System.out.println("Please fill out the title of this dvd");
        }
    }
}
