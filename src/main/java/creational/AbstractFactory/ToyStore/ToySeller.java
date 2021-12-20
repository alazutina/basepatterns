package creational.AbstractFactory.ToyStore;

import creational.AbstractFactory.Seller;

public class ToySeller implements Seller {
    @Override
    public void sell(){
        System.out.println("A toy seller sells toys");
    }
}
